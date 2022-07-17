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


//Login as attendee
WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX (longer)'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events],
	FailureHandling.STOP_ON_FAILURE)
WebUI.maximizeWindow()


//Select Enter on first Event (should be Automation) Check page element header and ensure link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events List NGX/button_Enter')) //Event enter button
WebUI.delay(2)
check_link1() //Verify at Events Home page
WebUI.verifyElementPresent(findTestObject(GlobalVariable.eventHeaderObj), 2) //Check Automation Header


//Enter Sessions List (event schedule), check page element header and ensure link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_Schedule')) //Schedule nav menu button to get to sessions
WebUI.delay(2)
check_link2() //Verify at Sessions List page
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/h1_Schedule'), 2) //Check Schedule Header


//Select Search input then Input search parameters for session
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/search_input'))
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session List/search_input'), "auto test")

//Enter Session Details, check page element header and ensure link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Auto Test Session')) //Select and enter "Auto Test Session"
WebUI.delay(2)
check_link3() //Verify at Session Dtails page
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Headers/h1_Auto Test Session'), 3) //Verify Session Details header is found (otherwise test will fail here)


//WebUI.closeBrowser()



//Event Home
def check_link1() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.eventHomeURL) {
		KeywordUtil.markPassed('PASS: the correct URL was found after entering event')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found!!')

		log.logInfo(url_check)
	}
}

//Sessions List
def check_link2() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.scheduleURL) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Event Schedule button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found!!')

		log.logInfo(url_check)
	}
}

//Session Details
def check_link3() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.sessionURL_autoTestSession) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Session')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found!!')

		log.logInfo(url_check)
	}
}
