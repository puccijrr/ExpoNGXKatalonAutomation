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

//***NOTE: This script tests specific elements including Froala Image editor for Automation which may need to be reviewed***

////Login + Events Home + maximize  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], FailureHandling.STOP_ON_FAILURE)
//WebUI.navigateToUrl(GlobalVariable.eventHomeURL)  //Go to Events Home
//WebUI.maximizeWindow() //maximize window for better view
//WebUI.delay(3)

WebUI.delay(1)

//***Find Elements that are expected on Automation Events Home***

//Admin Toolbar
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Attendee Access Status/button_Attendee Access ON'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Attendee Access should be ON
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Home Version/div_Version20'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Event Home Version - Should EXIST due to this event being previous AND be on '2.0' 
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Template Layout/span_During-Event'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Template should be in "During-Event" layout

//Event Home Elements
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_LIVE'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Live Button (since event is live) ***Investigate non existance on 2.0***
//WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/li_Event Owner'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Event Owner Label (since login user is event owner) ***Investigate non existance on 2.0***
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/article_SponsorLets Go Flyers'), 7, FailureHandling.CONTINUE_ON_FAILURE) //Main Sponsorship Header (waiting extra time for switch)
WebUI.verifyElementPresent(findTestObject(GlobalVariable.welcomeHomeImage), 3, FailureHandling.CONTINUE_ON_FAILURE) //Froala Image from welcome editor
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Specific/Automation/div_RR Rick RollQAphone(847) 602-2372mailrickexpopasscom'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Rick Roll full event contact info
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Video Player is loading_vjs-icon-placeholder'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Welcome Video ready to be played
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Exhibitors'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Exhibitors label (should be present since exhibitor sessions exist on this event)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/h3_Up Next'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Up Next header (part of During-Event event home layout)
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/button_Link Examplespdfget_app'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Resources: Links Example pdf
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/div_banner'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Main Banner


//WebUI.closeBrowser()


