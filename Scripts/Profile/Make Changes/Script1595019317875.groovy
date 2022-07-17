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


//Login
WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
    FailureHandling.STOP_ON_FAILURE)
WebUI.maximizeWindow() //maximize window for better view

WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/div_Default View_profile')) //Open Profile modal by clicking top-right image

//Set all editiable profile text parameters
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/input_First Name_ng-untouched ng-pristine ng-valid'), "First")
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/input_Last Name_ng-untouched ng-pristine ng-valid'), "Last")
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/input_Job Title_ng-untouched ng-pristine ng-valid'), "That Job")
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/input_Company Name_ng-untouched ng-pristine ng-valid'), "That Young Company")
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/input_Phone Number_ng-untouched ng-pristine ng-valid'), "5555554689")

//Select Save button
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/button_Save'))

//Verify that "Changes Made" succseful popup appears
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Profile/div_User updated'), 3)


//WebUI.closeBrowser()


