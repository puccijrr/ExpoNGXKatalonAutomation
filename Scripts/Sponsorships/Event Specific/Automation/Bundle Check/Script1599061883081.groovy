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

WebUI.navigateToUrl(GlobalVariable.eventHomeURL)  //Go to Events Home

//Select Sponsorships left nav option
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Sponsorships_hamburger-box'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_Sponsorships'))

WebUI.delay(2)

//Verify navs to sponsors url
check_link()

//Verify Sponsor Bundles header is found (otherwise test will fail here)
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Sponsorships/h1_Sponsor Bundles'), 2)

//Verify Create New button is found (otherwise test will fail here)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/button_Create New'), 2)

//Verify All expected Auto Button items are present
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Automation Event/Auto Bundle/Setup/mat-icon_three_dot'), 2, FailureHandling.CONTINUE_ON_FAILURE) //3 dots menu
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Automation Event/Auto Bundle/Setup/h3_Auto Bundle'), 2, FailureHandling.CONTINUE_ON_FAILURE) //Header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Automation Event/Auto Bundle/Setup/label_Auto'), 2, FailureHandling.CONTINUE_ON_FAILURE) //Display label
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Automation Event/Auto Bundle/Setup/a_auto_url'), 2, FailureHandling.CONTINUE_ON_FAILURE) //Url link


//WebUI.closeBrowser()


def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == GlobalVariable.sponsorsURL) {
        KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Sponsorships button')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect url found!!')

        log.logInfo(url_check)
    }
}



