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


////Login and open profile pane  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/div_Default View_profile')) //Open Profile modal by clicking top-right image


WebUI.delay(2)

//Select Security Tab
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/Security/li_Security'))

//**Tests for incorrect Current Password***
//Set INCORRECT Current Password field
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_Current Password'), "fakePassword")

//Set matching passwords
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_New Password'), "Password2")
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_Confirm Password'), "Password2")

//Select Save button
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/Security/button_Save'))

//Verify that "Invalid Password" error popup appears
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Profile/Security/div_Invalid Password'), 1)

//Wait for error to close
WebUI.delay(5)


//**Tests for missmatched New Passwords***
 //Set correct Current Password field
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_Current Password'), GlobalVariable.password)
 
 //Set MISS-matching passwords
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_New Password'), "Password11")
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_Confirm Password'), GlobalVariable.password)
 
 //Select Save button
 WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/Security/button_Save'))
 
 //Verify that "Passwords are not identical" error popup appears
 WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Profile/Security/div_Passwords are not identical'), 1)

 
//WebUI.closeBrowser()


