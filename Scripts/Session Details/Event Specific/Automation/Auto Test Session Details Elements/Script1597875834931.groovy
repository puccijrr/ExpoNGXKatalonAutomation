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

//Verify specific page elements are found to ensure correct Session Details page
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h3_Automation'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Automation Event home button
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/label_Back to Exhibitors'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Back to Exhibitors label (specific for exhibitors session)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Headers/h1_Auto Test Session'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Auto Test Session header
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Exhibitor'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Type (Exhibitor)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/p_Autoland'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Session Location (Autoland)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/h5_Agent Boris'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Agent Boris Speaker
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/h4_Materials'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Materials Label
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session Details/Event Specific/Automation/button_OWjpgget_app'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Expected Materials: OW.jpg
WebUI.verifyElementPresent(findTestObject('Page_EXPO/Session Details/Event Specific/Automation/button_Join'), 3, FailureHandling.CONTINUE_ON_FAILURE) //Join button for embeded session live video

//WebUI.closeBrowser()


