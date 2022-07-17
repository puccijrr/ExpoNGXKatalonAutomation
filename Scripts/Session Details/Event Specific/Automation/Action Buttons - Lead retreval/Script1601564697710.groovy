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
//WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
//WebUI.maximizeWindow() //maximize window for better view

WebUI.delay(1)

//Logout
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/div_Default View_profile'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/a_Log Out'))
WebUI.delay(5)

//Log in as attendee and back to Auto Test Session
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Email Address_ngx'), 'rick+a@expopass.com')
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Password_ngx'), 'Password1')
WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/button_Login_ngx'))
WebUI.delay(20)
WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.delay(7)

//Click Exhibitor button: which should send lead to Taco Man [rick+ex@expopass.com], ensure successful popup
WebUI.click(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Action Buttons/button_Exhibitor')) //Exhibitor type Action Button
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Action Buttons/div_Leads successfully sent to Exhibitor Admin'), 3) //Leads successfull popup
WebUI.delay(5)

//Logout
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/div_Default View_profile'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/a_Log Out'))
WebUI.delay(2)

//Log in as admin and back to Auto Test Session
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Email Address_ngx'), GlobalVariable.login)
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Password_ngx'), GlobalVariable.password)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/button_Login_ngx'))
WebUI.delay(10)
WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession) //Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.delay(2)

//***Current admin functionality shows if also an attendee***
//Click Exhibitor button: which should error as admin, ensure error popup
//WebUI.click(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Action Buttons/button_Exhibitor')) //Exhibitor type Action Button
//WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Action Buttons/div_oops error'), 3) //Leads error popup
//WebUI.delay(5)

//WebUI.closeBrowser()


