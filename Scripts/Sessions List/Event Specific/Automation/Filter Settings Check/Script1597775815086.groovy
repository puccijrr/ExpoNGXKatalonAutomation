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


//Login + Nav to Sessions List  ***Comment IN if running test case individually!***
WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl(GlobalVariable.scheduleURL)  //Go to Events Session List page

WebUI.maximizeWindow() //maximize window for better view

WebUI.delay(2)


//Process all filter items
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/button_Filter'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/input_Type_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/div_keyboard_arrow_down_mat-checkbox-inner-_0c434b'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/section_Type keyboard_arrow_down1 Selectedk_c2c62f'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/input_Type_ng-star-inserted'), 
    'agent')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/div_keyboard_arrow_down_mat-checkbox-inner-_0c434b_1'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/section_Type keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/div_Boris_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/input_Type_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/div_Here_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/button_Done'))


//Ensure Correct session is found
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Main One'), 3) //"Main One"
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Session List/Event Specific/Sessions/Automation/title_Automation Demo'), 3) //Extra step to make sure common session is filtered OUT



