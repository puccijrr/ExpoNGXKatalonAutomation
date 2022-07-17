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


////Login + Nav to Sessions List + Maximize window  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.navigateToUrl(GlobalVariable.scheduleURL)  //Go to Events Session List page
//WebUI.maximizeWindow() //maximize window for better view

WebUI.delay(2)

//Select Live then confirm its selected
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/View/li_Live'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Live'), 1, FailureHandling.CONTINUE_ON_FAILURE)

//Select My Schedule then confirm its selected
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/View/li_My Schedule'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_My Schedule'), 1, FailureHandling.CONTINUE_ON_FAILURE)

//Select Event Schedule then confirm its selected
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/View/li_Event Schedule'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Event Schedule'), 1, FailureHandling.CONTINUE_ON_FAILURE)

//Select Exhibitors then confirm its selected
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/View/li_Exhibitors'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/View/Active (Selected)/li_Exhibitors'), 1, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.closeBrowser()
