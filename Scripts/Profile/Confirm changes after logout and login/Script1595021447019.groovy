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


////Make Changes to profile (see test case for setting parameters - These should match the variables on the function at the bottom of the script)
//WebUI.callTestCase(findTestCase('Profile/Make Changes'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//
////Logout
//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/a_Log Out'))

////Login
//WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Email Address_ngx'), 'rick@expopass.com')
//WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Password_ngx'), 'Password1')
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/button_Login_ngx'))
//WebUI.delay(6)

WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events],
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/div_Default View_profile')) //Open Profile modal by clicking top-right image
WebUI.delay(5)

//Get text of all fields
WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/input_First Name_ng-untouched ng-pristine ng-valid'))
WebUI.delay(5)
fname = WebUI.getText(findTestObject('Object Repository/Page_EXPO/Profile/input_First Name_ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/input_Last Name_ng-untouched ng-pristine ng-valid'))
lname = WebUI.getText(findTestObject('Object Repository/Page_EXPO/Profile/input_Last Name_ng-untouched ng-pristine ng-valid'))

WebUI.getText(findTestObject('Object Repository/Page_EXPO/Profile/input_Job Title_ng-untouched ng-pristine ng-valid'))
job = WebUI.getText(findTestObject('Object Repository/Page_EXPO/Profile/input_Job Title_ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/input_Company Name_ng-untouched ng-pristine ng-valid'))
company = WebUI.getText(findTestObject('Object Repository/Page_EXPO/Profile/input_Company Name_ng-untouched ng-pristine ng-valid'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/input_Phone Number_ng-untouched ng-pristine ng-valid'))
phone = WebUI.getText(findTestObject('Object Repository/Page_EXPO/Profile/input_Phone Number_ng-untouched ng-pristine ng-valid'))

KeywordLogger log = new KeywordLogger()
if (fname == "First") {
	KeywordUtil.markPassed('PASS: First name change was saved after logout')
	log.logInfo(fname)

} else {
	KeywordUtil.markFailed('FAIL: Seems that all profile changes were not saved!!')
	log.logInfo(fname)
}
