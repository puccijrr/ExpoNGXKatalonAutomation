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

//***NOTE: This script tests specific elements including Froala Image editor for Automation which may need to be reviewed***

////Login + Events Home + maximize  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.navigateToUrl(GlobalVariable.eventHomeURL)  //Go to Events Home
//WebUI.maximizeWindow() //maximize window for better view
//WebUI.delay(3)

WebUI.delay(3) //Waiting extra for Exhibitors widget nav to load

//***Find and click Exhibitors widget nav (Elements that are expected on Automation Events Home)***
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Exhibitors'))

//***Find and click Exhibitors (more) widget button (Elements that are expected on Automation Events Home, since more than three exhibitor sessions exist)***
 WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Exhibitors'))

//***Should nav to event schedule and have exhibitors view selected***
//Verify Schedule header is found (otherwise test will fail here)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/h1_Schedule'), 5)

//Verify "Exibitors" View option is selected (active) on Sessions List
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Exhibitors'), 5)

//WebUI.closeBrowser()


def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == GlobalVariable.exhibitorsURL) {
        KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Exhibitor nav button')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect url found!! (May also need to ensure button exists on current event)')

        log.logInfo(url_check)
    }
}
//WebUI.closeBrowser()


