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

//Setup and save basic Theater type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Theater')) //select Theater type
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Next Theater')) //click Next (General page)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Next Theater')) //click Next (Manage Roles page)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save Theater')) //finally cllick Save button on chat
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Done')) //Exit Edit mode


//Check Theater session was created and Join button exists and enter theater
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/Theater Internal/button_Join'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/Theater Internal/button_Join'))
WebUI.delay(3) //Wait for theater enterance

//Verify url is correct for theater session and correct label is found to ensure theater room is correct
check_link()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/Videos Session/Video Settings/h1_Videos Session info'), 2, FailureHandling.STOP_ON_FAILURE)


//Nav back to default session details page
WebUI.navigateToUrl(GlobalVariable.sessionURL_videosSession) 
WebUI.delay(3)


//WebUI.closeBrowser()

def check_link() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.theater_url) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Join button and entering the Theater')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url was found, or video setup did not work!!')

		log.logInfo(url_check)
	}
}
