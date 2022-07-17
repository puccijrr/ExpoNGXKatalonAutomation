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

//Setup Live Zoom type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Live')) //select Live type (By default Zoom is selected)
WebUI.delay(2)

//**Setup Check 1:  Add 9 required digits but NO password and ensure Save button is not clickable
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Zoom Webinar-Meeting ID (9-11 Digits)'), '123456789') //add test zoom code LESS than required minimum digits
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save'), FailureHandling.STOP_ON_FAILURE) //check Save button is "grayed-out"
WebUI.delay(3)

//**Setup Check 2:  Add password BUT less than 9 (six) digits and ensure Save button is not clickable
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Zoom Password'), 'Password1') //add test Zoom password
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Zoom Webinar-Meeting ID (9-11 Digits)'), '123456') //add test zoom code LESS than required minimum digits
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save'), FailureHandling.STOP_ON_FAILURE) //check Save button is "grayed-out"
WebUI.delay(3)

//**Setup Check 3:  Attempt to add MORE than 11 MAX digits: should limit to first 9 and button is now clickable
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Zoom Webinar-Meeting ID (9-11 Digits)'), '123456789101') //attempt to add 12 digits - should default to first 9
 WebUI.verifyElementClickable(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save'), FailureHandling.STOP_ON_FAILURE) //check Save button is now clickable
 WebUI.delay(3)
 
//Save then exit edit mode
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save')) //click Save
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Done'))
WebUI.delay(3)

//Enter zoom session (confirming the Enter Zoom button exists) and check entering the waiting room elements
WebUI.click(findTestObject('Page_EXPO/Session Details/Video Settings/Zoom Internal/button_Enter Zoom'))
WebUI.delay(5) //time for page load
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Video Settings/Zoom Internal/iframe_Soviet Union Station_zoom-iframe'), 2, FailureHandling.CONTINUE_ON_FAILURE) //Join Meeting waiting room
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Video Settings/Zoom Internal/button_Join'), 2, FailureHandling.CONTINUE_ON_FAILURE) //Join button


WebUI.navigateToUrl(GlobalVariable.sessionURL_videosSession) //Nav back to default session details page
WebUI.delay(3)

//WebUI.closeBrowser()

