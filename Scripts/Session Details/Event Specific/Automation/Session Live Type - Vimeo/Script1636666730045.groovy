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

//Setup Live Vimeo type session video
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/mat-icon_edit')) //click pencil icon
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Live')) //select Live type
WebUI.click(findTestObject('Page_EXPO/Session Details/Video Settings/div_keyboard_arrow_down')) //click on type dropdown
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Vimeo Live Drop')) //select Vimeo Live video option
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/label_Vimeo Event ID(6 or 9 Digits)'), 2, FailureHandling.STOP_ON_FAILURE) //ensure Vimeo Event ID label found to check option correctly changed
WebUI.delay(2)


//**Setup Check 1:  Add less than minium 6 (five) Vimeo ID digits and ensure Save button is not clickable
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Vimeo (6 or 9 Digits)'), '12345') //add test Vimeo code LESS than required minimum digits
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save'), FailureHandling.STOP_ON_FAILURE) //check Save button is "grayed-out"
WebUI.delay(3)

//**Setup Check 2:  Attempt to add MORE than 9 (10) MAX digits: should limit to first 9 and button is now clickable
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Vimeo (6 or 9 Digits)'), '1234567890') //attempt to add 10 digits - should default to first 9
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save'), FailureHandling.STOP_ON_FAILURE) //check Save button is now clickable
WebUI.delay(3)

//Enter in 6 digit code, save then exit edit mode
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/input_Vimeo (6 or 9 Digits)'), '123456')
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/button_Save')) //click Save
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/button_Done'))
WebUI.delay(3)

//Check Vimeo live session was created and Join button exists and is clickable
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/Vimeo Internal/button_Join'), 2, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_EXPO/Session Details/Video Settings/Vimeo Internal/button_Join'), FailureHandling.STOP_ON_FAILURE) //check Save button is now clickable


//WebUI.closeBrowser()

