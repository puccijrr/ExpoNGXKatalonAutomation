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
//WebUI.maximizeWindow() //maximize window for better view

WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.delay(3)

//Click "Join" on video player to start Auto Test Session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_Join'))

//Click Next Session action button
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/Action Buttons/button_Next Session')) //Session Linkage Action Button
WebUI.delay(5) // Special delay for session linkage

//Verify url is new session [Future Session]
check_link()
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Future Session/h1_Future Session'), 3, FailureHandling.STOP_ON_FAILURE) //Ensure that header for new session is found or fail

// ***Check expected elements are found and that items are NOT carried over from previous session***
//Expected Elements
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Future Session/button_Enter Zoom'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Join Button for video (to ensure playing video isn't carried over)
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Future Session/p_Workshop'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Required Session Type Label
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Future Session/p_Here'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Required Location Label
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Future Session/h5_Andy Boots'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Speaker
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Future Session/h5_Lets Go Flyers'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Sponsorship Banner

//Elements NOT expected (are part of Auto Test Session and should NOT be carried over)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Exhibitor'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Type
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Autoland'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Location
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Agent Boris'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Speaker 1
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Alex Speakerman'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Speaker 2
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Here is the sponsor Here is the spo'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Sponsorship Banner
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_OWjpgget_app'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Materials 1
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_Bugs to write.txtget_app'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Materials 2


WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.delay(5) // Delay for next part of test


//Click Empty Session action button (To session that has NO speakers)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/Action Buttons/button_Empty Session')) //Session Linkage Action Button
WebUI.delay(5) // Special delay for session linkage

//Verify url is new session [Breakfast]
check_link2()
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Empty Session/h1_Breakfast'), 3, FailureHandling.STOP_ON_FAILURE) //Ensure that header for new session is found or fail


//Elements NOT expected (are part of Auto Test Session and should NOT be carried over to this empty session)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Exhibitor'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Type
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Autoland'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Location
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Agent Boris'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Speaker 1 (should remain empty)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Alex Speakerman'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Speaker 2 (should remain empty)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Here is the sponsor Here is the spo'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Sponsorship Banner
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_OWjpgget_app'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Materials 1
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_Bugs to write.txtget_app'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session Materials 2


WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.delay(2)

//WebUI.closeBrowser()

//Future Session
def check_link() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.sessionURL_futureSession) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Next Session action button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found!! (action button may not have worked)')

		log.logInfo(url_check)
	}
}

//Breakfast
def check_link2() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.sessionURL_breakfast) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Empty Session action button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found!! (action button may not have worked)')

		log.logInfo(url_check)
	}
}
