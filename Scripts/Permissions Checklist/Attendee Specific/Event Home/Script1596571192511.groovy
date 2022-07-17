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

//Navigate to URL to Event Home on NGX
WebUI.navigateToUrl(GlobalVariable.eventHomeURL)

WebUI.delay(3)

//Ensure that URL is still correct (did not direct to a different location)
check_link()

//Verify page elements are found to ensure page load
WebUI.maximizeWindow() //maximize window for better view
WebUI.verifyElementPresent(findTestObject(GlobalVariable.eventHeaderObj), 3, FailureHandling.CONTINUE_ON_FAILURE) //Event header (Based off profile variable)
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Events Main page/NGX Home/h4_Event Contacts'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Contacts: header
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Events Main page/NGX Home/h4_Resources'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Resources: header
//WebUI.closeBrowser()

//Verify page elements are NOT seen/found to ensure attendee does not have admin access (Admin Toolbar)
WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Admin Menu keyboard_arrow_down'), FailureHandling.CONTINUE_ON_FAILURE) //Admin Menu
WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Attendee Access'), FailureHandling.CONTINUE_ON_FAILURE) //Attendee Access Display/Button
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Edit'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Edit Mode Buton
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Template'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Template Span display

def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == GlobalVariable.eventHomeURL) {
        KeywordUtil.markPassed('PASS: the expected URL was found')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect url found, may have been redirected to incorrect location!!')

        log.logInfo(url_check)
    }
}


