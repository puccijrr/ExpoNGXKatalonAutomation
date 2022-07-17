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
//WebUI.navigateToUrl(GlobalVariable.sessionURL_videosSession)
//WebUI.maximizeWindow() //maximize window for better view
//WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Edit')) //Enter Edit mode

//Setup and save URL type session video for link "https://www.katalon.com/"
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_URL')) //select URL type
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Web URL'), 'https://www.katalon.com/') //add url to Web URL
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Mobile URL'), 'https://www.katalon.com/') //add url to Web URL
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save')) //click Save
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Done')) //Exit Edit mode
WebUI.delay(3)

//Click Join button and ensure url opens correctly in new tab
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_Join'))

//Wait for new tab to load
WebUI.delay(5)

//Switch to new tab
WebUI.switchToWindowIndex(1)

//Verify url in new tab is correct
check_link()

//Close current tab then focus switch to back main tab
WebUI.closeWindowIndex(1)
WebUI.switchToWindowIndex(0)


//WebUI.closeBrowser()


def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == vid_url) {
        KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Join button from the created URL video')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect url was found, or video setup did not work!!')

        log.logInfo(url_check)
    }
}

