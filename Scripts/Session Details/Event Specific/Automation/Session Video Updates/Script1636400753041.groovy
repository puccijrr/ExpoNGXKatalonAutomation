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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.paulhammant.ngwebdriver.ByAngular as ByAngular
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.paulhammant.ngwebdriver.NgWebDriver as NgWebDriver
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

////Login  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.maximizeWindow() //maximize window for better view

WebUI.delay(1)

//Navigate to URL to Auto Test Session (Session Details) on NGX
WebUI.navigateToUrl(GlobalVariable.sessionURL_videosSession)
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Edit')) //Enter Edit mode


//Setup and save URL type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_URL')) //select URL type
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Web URL'), 'www.katalon.com') //add url to Web URL
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Mobile URL'), 'www.katalon.com') //add url to Web URL

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save')) //click Save
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/div_Updated session webinar'), 5, FailureHandling.CONTINUE_ON_FAILURE) //Ensure correct 'Success Popup' appears
WebUI.delay(3)


//Setup and save Video type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Video')) //select Video type
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Select_fileUpload')) // Click "Select" video option for default file upload
WebUI.click(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/Videos Session/Video Settings/span_sample_3840x2160.wmv')) // Select the specific recent video file
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Done')) //select Done *(Special ID)*

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save')) //click Save
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/div_Updated session webinar'), 5, FailureHandling.CONTINUE_ON_FAILURE) //Ensure correct 'Success Popup' appears
WebUI.delay(3)


//Setup and save Live type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Live')) //select Live type
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Zoom Webinar-Meeting ID (9-11 Digits)'), '123456789') //add test zoom code of required minimum digits
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Zoom Password'), 'Password1') //add test password

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save')) //click Save
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/div_Updated session webinar'), 5, FailureHandling.CONTINUE_ON_FAILURE) //Ensure correct 'Success Popup' appears
WebUI.delay(3)


//Setup and save Theater type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Theater')) //select Theater type
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Next Theater')) //click Next (General page)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Next Theater')) //click Next (Manage Roles page)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save Theater')) //finally cllick Save button on chat

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/div_Updated session with theater webinar'), 5, FailureHandling.CONTINUE_ON_FAILURE) //Ensure correct (unique theater) 'Success Popup' appears

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Done')) //Exit Edit mode


//WebUI.closeBrowser()

