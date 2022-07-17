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


//Login as exhibitor
WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX (longer)'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events],
	FailureHandling.STOP_ON_FAILURE)
WebUI.maximizeWindow()


//Search for Event (and wait a few secs for results)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events List NGX/search_input'))
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Events List NGX/search_input'), 'automation')
WebUI.delay(5)


//Enter Event, check page element header and "Exhibitor Admin" tag exists and ensure link is correct
WebUI.click(findTestObject('Page_EXPO/Events List NGX/Event Specific/Automation/a_Enter keyboard_arrow_right')) //Event enter button
WebUI.delay(7)
check_link1() //Verify at Events Home page
WebUI.verifyElementPresent(findTestObject(GlobalVariable.eventHeaderObj), 2) //Check Automation Header
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/label_Exhibitor Admin'), 2, FailureHandling.CONTINUE_ON_FAILURE) //Check Exhibitor Admin tag exists


//Enter Sessions List through Exhibitors button: check Exhibitors View is selected, page element header and ensure link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_Exhibitors')) //Exhibitors nav menu to get to sessions list exhibitor view
WebUI.delay(2)
check_link2() //Verify at Sessions List page with Exhibitors Url
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/h1_Schedule'), 2) //Check Schedule Header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Exhibitors'), 2) //Verify that Exhibitors view is selected (Active)


//Enter Auto Test Session (should be only session in list) Session Details by clicking label, then check page element header and ensure link is correct
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

//Sessions List Exhibitors
def check_link2() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.exhibitorsURL) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Exhibitors button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found (exhibitor view may not be active)!!')

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
