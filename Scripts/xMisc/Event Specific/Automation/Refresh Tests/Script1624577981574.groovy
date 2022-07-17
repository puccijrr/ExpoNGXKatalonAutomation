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


//Login as admin
WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX (longer)'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events],
	FailureHandling.STOP_ON_FAILURE)
WebUI.maximizeWindow()


//*** EVENT HOME ***//

WebUI.navigateToUrl(GlobalVariable.eventHomeURL)  //Go to Events Home
WebUI.delay(5)

//Refresh the event home page
WebUI.refresh()
WebUI.delay(3)

//Admin Toolbar
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Admin Menu keyboard_arrow_down'), FailureHandling.CONTINUE_ON_FAILURE) //Admin Menu
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Attendee Access Status/button_Attendee Access ON'), FailureHandling.CONTINUE_ON_FAILURE) //Attendee Access should be ON
//WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Home Version/div_Version20'), FailureHandling.CONTINUE_ON_FAILURE) //Event Home Version - Should EXIST due to this event being previous AND be on '2.0'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Template Layout/span_During-Event'), FailureHandling.CONTINUE_ON_FAILURE) //Template should be in "During-Event" layout
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Attendee Access'), FailureHandling.CONTINUE_ON_FAILURE) //Attendee Access Display/Button
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE) //Edit Mode Buton
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Template'), FailureHandling.CONTINUE_ON_FAILURE) //Template Span display

//Event Home Elements
WebUI.verifyElementVisible(findTestObject(GlobalVariable.eventHeaderObj), FailureHandling.CONTINUE_ON_FAILURE) //Event header (Based off profile variable)
WebUI.verifyElementVisible(findTestObject('Page_EXPO/Events Main page/NGX Home/h4_Event Contacts'), FailureHandling.CONTINUE_ON_FAILURE) //Contacts: header
WebUI.verifyElementVisible(findTestObject('Page_EXPO/Events Main page/NGX Home/h4_Resources'), FailureHandling.CONTINUE_ON_FAILURE) //Resources: header
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/article_SponsorLets Go Flyers'), 7, FailureHandling.CONTINUE_ON_FAILURE) //Main Sponsorship Header (waiting extra time for switch)
WebUI.verifyElementPresent(findTestObject(GlobalVariable.welcomeHomeImage), 3, FailureHandling.CONTINUE_ON_FAILURE) //Froala Image from welcome editor
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Specific/Automation/div_RR Rick RollQAphone(847) 602-2372mailrickexpopasscom'), FailureHandling.CONTINUE_ON_FAILURE) //Rick Roll full event contact info
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/span_Video Player is loading_vjs-icon-placeholder'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Welcome Video ready to be played


//*** SCHEDULE (Sessions List) ***//

WebUI.navigateToUrl(GlobalVariable.scheduleURL)  //Go to Schedule (Sessions List) page
WebUI.delay(5)

//Refresh the schedule page
WebUI.refresh()
WebUI.delay(3)

//Find all General Elements that are expected on any Events Session List
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/h1_Schedule'), FailureHandling.CONTINUE_ON_FAILURE) //Schedule Sessions page header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/title_Event'), FailureHandling.CONTINUE_ON_FAILURE) //Left Nav Header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/search_input'), FailureHandling.CONTINUE_ON_FAILURE) //Search Schedule sessions inputer
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/h3_View'), FailureHandling.CONTINUE_ON_FAILURE) //View Header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/View/li_Live'), FailureHandling.CONTINUE_ON_FAILURE) //Live View Option
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/View/li_My Schedule'), FailureHandling.CONTINUE_ON_FAILURE) //My Schedule View Option
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Event Schedule'), FailureHandling.CONTINUE_ON_FAILURE) //Event Schedule View Option (ACTIVE by default)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/h3_Filters'), FailureHandling.CONTINUE_ON_FAILURE) //Filters header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/button_Filter'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Filter button
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/th_Start Time'), FailureHandling.CONTINUE_ON_FAILURE) //Start Time column header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/th_Title'), FailureHandling.CONTINUE_ON_FAILURE) //Title column header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/th_Length'), FailureHandling.CONTINUE_ON_FAILURE) //Length column header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/th_Speakers'), FailureHandling.CONTINUE_ON_FAILURE) //Speakers column header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/th_Location'), FailureHandling.CONTINUE_ON_FAILURE) //Location column header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/th_Speakers'), FailureHandling.CONTINUE_ON_FAILURE) //Type column header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/div_Filter_banner'), 5, FailureHandling.CONTINUE_ON_FAILURE) //Sponsorship banner
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/View/li_Exhibitors'), FailureHandling.CONTINUE_ON_FAILURE) //Exhibitors View Option (Exists due to Automation having an exhibitor session availible)


//*** SESSION DETAILS ***//

WebUI.navigateToUrl(GlobalVariable.sessionURL_autoTestSession)  //Go to Session Details (Auto Test Session)
WebUI.delay(5)

//Refresh the schedule page
WebUI.refresh()
WebUI.delay(3)

//Admin Toolbar for session details
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/button_Session Details'), FailureHandling.CONTINUE_ON_FAILURE) //Session Details legacy button
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/button_Update Session Icon'), FailureHandling.CONTINUE_ON_FAILURE) //Update Session Icon button
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/button_Edit'), FailureHandling.CONTINUE_ON_FAILURE) //Edit Mode button

//Session Details Elements
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session List/title_Event'),  FailureHandling.CONTINUE_ON_FAILURE) //Left Nav Header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/label_Back to Exhibitors'), FailureHandling.CONTINUE_ON_FAILURE) //Back to Exhibitors label (specific for exhibitors session)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/h4_Session Type'), FailureHandling.CONTINUE_ON_FAILURE) //Required Session Type Label
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/h4_Location'), FailureHandling.CONTINUE_ON_FAILURE) //Required Location Label
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h3_Automation'), FailureHandling.CONTINUE_ON_FAILURE) //Automation Event home button
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/Headers/h1_Auto Test Session'), FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session header
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Exhibitor'), FailureHandling.CONTINUE_ON_FAILURE) //Session Type (Exhibitor)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Autoland'), FailureHandling.CONTINUE_ON_FAILURE) //Session Location (Autoland)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Agent Boris'), FailureHandling.CONTINUE_ON_FAILURE) //Agent Boris Speaker
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/h4_Materials'), FailureHandling.CONTINUE_ON_FAILURE) //Materials Label
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_OWjpgget_app'), FailureHandling.CONTINUE_ON_FAILURE) //Expected Materials: OW.jpg
WebUI.verifyElementVisible(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/button_Join'), FailureHandling.CONTINUE_ON_FAILURE) //Join button for embeded session live video



//WebUI.closeBrowser()



