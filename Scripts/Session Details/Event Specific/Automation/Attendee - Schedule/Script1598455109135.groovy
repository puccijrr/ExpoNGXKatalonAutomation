import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
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


////Login + Nav to Sessions Details  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX (longer)'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.maximizeWindow()
//WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX

WebUI.delay(1)


//Verify "Remove" is found under My Schedule (Auto Test Session should already be part of schedule)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/button_Remove'), 3)

//Select My Schedule from left nav menu to return to session list with My Schedule selected
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_My Schedule'))

//Verify "Auto Test Session" is found in My Schedule on session list
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Auto Test Session'), 6)


//Select Auto Test Session to go back to session details and remove it from schedule
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Auto Test Session'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Remove'))
WebUI.delay(5) //Takes time to remove
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/button_Add'), 3) //Button should now show "Add"

//Verify "Auto Test Session" is no NOT found in My Schedule on session list
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_My Schedule'))
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Auto Test Session'), 6) //Verify Auto Test Session is NOT Present on my shedule view


//Nav back to Auto Test Session and add it back to my schedule and verify
WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Add'))
WebUI.delay(5) //Takes time to add
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/button_Remove'), 3)


//WebUI.closeBrowser()

