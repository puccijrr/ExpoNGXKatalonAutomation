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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtila


////Login ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.eventSettingsURL)  //Go to Event Settings for Automation
WebUI.delay(3)

////Attendee Web App Access - Set OFF  *NOT WORKING*
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Attendee WEB Access Radio Buttons/div_web Off_mat-radio-outer-circle'))
////WebUI.clickOffset(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Attendee WEB Access Radio Buttons/div_web Off_mat-radio-outer-circle'), 5, 10)
//
//
////Attendee Mobile App Access - Set Later  *NOT WORKING*
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Attendee MOBILE Access Radio Buttons/div_mobile Later_mat-radio-outer-circle'))

//***Confirmation Settings***
//Web toggle
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Confirmation Email/toggle_web'))
//Select Cancel (should appear with change)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/a_Cancel'))
//Mobile Toggle
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Confirmation Email/toggle_mobile'))
//Select Cancel (should appear with change)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/a_Cancel'))

//***Event Reminder settings***
//Main toggle
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Event Reminder Email/toggle_main'))
//Select Cancel (should appear with change)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/a_Cancel'))
//Web toggle
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Event Reminder Email/toggle_web'))
//Select Cancel (should appear with change)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/a_Cancel'))
//Mobile toggle
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Event Reminder Email/toggle_mobile'))
//Select Cancel (should appear with change)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/a_Cancel'))


//Video Streaming Settings
WebUI.click(findTestObject('Page_EXPO/Events Main page/NGX Home/Event Settings/toggle_videoStreaming_Yes_xpath'))
//Select Cancel (should appear with change)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/a_Cancel'))


WebUI.delay(2)



//****Recheck verification of Canceled actions****

////Attendee Web App Access - 'Now' should be selected
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Attendee WEB Access Radio Buttons/Selected/div_web_Now_selected'), FailureHandling.CONTINUE_ON_FAILURE)
//
////Attendee Mobile App Access - 'Now' should be selected
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Attendee MOBILE Access Radio Buttons/Selected/div_mobile_Now_selected'), FailureHandling.CONTINUE_ON_FAILURE)

//***Confirmation Checks***
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Confirmation Email/toggle_web - No'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Confirmation Email/toggle_mobile - No'), 3, FailureHandling.CONTINUE_ON_FAILURE)

//***Event Reminder settings Checks***
//Check Main Toggle is set to Yes
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Event Reminder Email/toggle_main - Yes'), 3, FailureHandling.CONTINUE_ON_FAILURE)
//Check both Web and Mobile Magic Link switches are on
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Event Reminder Email/toggle_web - On'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/Event Reminder Email/toggle_mobile - On'), 3, FailureHandling.CONTINUE_ON_FAILURE)

//***Video Streaming Check***
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/toggle_videoStreaming - Yes'), 3, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.closeBrowser()


