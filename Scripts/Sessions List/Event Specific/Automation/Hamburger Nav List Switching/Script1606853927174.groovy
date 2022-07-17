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


////Login + Nav to Sessions List + Maximize window  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.navigateToUrl(GlobalVariable.scheduleURL)  //Go to Events Session List page
//WebUI.maximizeWindow() //maximize window for better view


WebUI.delay(2)


////Select My Schedule from left nav and confrim link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_My Schedule'))
check_MySchedule()  //Verify url goes to My Schedule page

//Select Schedule from left nav and confrim link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_Schedule'))
check_Schedule() //Verify url goes to Schedule page

//Select Exhibitors from hamburger nav and confrim link is correct
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_Exhibitors'))
check_Exhibitors() //Verify url goes to Exhibitors page


//WebUI.closeBrowser()


//***Check all session list Hamburger Nav urls***

def check_MySchedule() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.myScheduleURL) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the My Schedule nav button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect URL found after clicking My Schedule!!')

		log.logInfo(url_check)
	}
}


def check_Schedule() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.scheduleURL) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Schedule nav button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found after clicking Schedule!!')

		log.logInfo(url_check)
	}
}


def check_Exhibitors() {
	KeywordLogger log = new KeywordLogger()

	url_check = (url = WebUI.getUrl())

	if (url_check == GlobalVariable.exhibitorsURL) {
		KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Exhibitors nav button')

		log.logInfo(url_check)
	} else {
		KeywordUtil.markFailed('FAIL: incorrect url found after clicking Exhibitors!!')

		log.logInfo(url_check)
	}
}

