import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver as WebDriver
import com.paulhammant.ngwebdriver.ByAngular
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.paulhammant.ngwebdriver.NgWebDriver
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

////Login  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events],
//    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

//Navigate to URL to Basic Permission Session (Session Details) on NGX
WebUI.navigateToUrl(GlobalVariable.basicPermissionSessionURL)

WebUI.delay(3)

//Ensure that URL is still correct (did not direct to a different location)
check_link()

//Verify generic page elements are found to ensure page load
WebUI.maximizeWindow() //maximize window for better view
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/title_Event'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Left Nav Header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/button_arrow_back_ios'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Back to sessions list button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/h4_Session Type'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Required Session Type Label
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/h4_Location'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Required Location Label

//Verify related page elements are NOT found to ensure page user permitions are correct
WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_EXPO/Session Details/button_Session Details'), FailureHandling.CONTINUE_ON_FAILURE) //Session Details legacy button
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/button_Update Session Icon'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Update Session Icon button
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/button_Edit'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Edit Mode button

//***Verify specific page elements are found to ensure correct Session Details page***
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Headers/h1_Basic Permission Session'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Details page header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Permissions Event/h3_Permissions Event'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Permissions Event home button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Permissions Event/p_Permission Land'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Location

//WebUI.closeBrowser()

def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == GlobalVariable.basicPermissionSessionURL) {
        KeywordUtil.markPassed('PASS: the expected URL was found')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect url found, may have been redirected to incorrect location!!')

        log.logInfo(url_check)
    }
}





