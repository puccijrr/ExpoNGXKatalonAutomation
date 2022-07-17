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

////Login + Nav to Sessions List  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.navigateToUrl(GlobalVariable.scheduleURL)  //Go to Events Session List page
//WebUI.maximizeWindow() //maximize window for better view
 

WebUI.delay(2)

//Select Search input then Input search parameters for Auto Test Session
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/search_input'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session List/search_input'), 'auto test')

//Check all tiles are correct
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/td_1000 AM CST'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Start Time (Should always be 10:00AM regardless of day)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/img_AM CST_ng-star-inserted'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Logo
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/span_Sponsored'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Sponsored Session label
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Auto Test Session'), 3, FailureHandling.CONTINUE_ON_FAILURE) //"Auto Test Session" Title
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/td_60 min'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Length (Should be 60min exactly)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/td_Autoland'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Location - Autoland
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/td_Exhibitor'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Type - Exhibitor


//Close out search
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/span_close'))

