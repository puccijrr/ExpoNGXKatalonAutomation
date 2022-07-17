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


////Login  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.scheduleURL)  //Go to Events Session List
WebUI.maximizeWindow() //maximize window for better view
WebUI.delay(5)


//Find all General Elements that are expected on any Events Session List
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/h1_Schedule'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Schedule Sessions page header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/title_Event'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Left Nav Header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/search_input'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Search Schedule sessions inputer
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/h3_View'), 3, FailureHandling.CONTINUE_ON_FAILURE) //View Header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/li_Live'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Live View Option
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/li_My Schedule'), 3, FailureHandling.CONTINUE_ON_FAILURE) //My Schedule View Option
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Event Schedule'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Event Schedule View Option (ACTIVE by default)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/button_chevron_left'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Cal Cheveron Left
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/button_chevron_right'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Cal Cheveron Right
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/h3_Filters'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Filters header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/button_Filter'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Filter button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/th_Start Time'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Start Time column header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/th_Title'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Title column header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/th_Length'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Length column header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/th_Speakers'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Speakers column header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/th_Location'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Location column header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/th_Speakers'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Type column header


//WebUI.closeBrowser()


