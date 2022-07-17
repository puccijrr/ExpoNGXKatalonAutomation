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


////Login, open profile pane and select security tab  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/div_Default View_profile')) //Open Profile modal by clicking top-right image
//WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/Security/li_Security')) //Select Security Tab

WebUI.delay(2)

//Set correct Current Password field
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_Current Password'), GlobalVariable.password)
 
 //Set matching passwords
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_New Password'), GlobalVariable.newPass)
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Profile/Security/input_Confirm Password'), GlobalVariable.newPass)
 
 //Select Save button
 WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/Security/button_Save'))
 
 //Verify that "Password Set!" successful popup appears
 WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Profile/Security/div_Password Set'), 2)
 
 //Logout
 WebUI.click(findTestObject('Object Repository/Page_EXPO/Profile/a_Log Out'))
 WebUI.delay(3)
 
 //Login with NEW password
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Email Address_ngx'), GlobalVariable.login)
 WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Password_ngx'), GlobalVariable.newPass)
 WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/button_Login_ngx'))
 
 //Verify login password update works by ensuring login to the right page which includes "#!/events" and PASS, otherwise fail with message
 WebUI.delay(12)
 check_login()
 
 
//WebUI.closeBrowser()

 
 def check_login() {
	 KeywordLogger log = new KeywordLogger()
 
	 url_check = (url = WebUI.getUrl())
 
	 if (url_check == GlobalVariable.events) {
		 KeywordUtil.markPassed('PASS: the correct URL was found after clicking the login button (password update worked!)')
 
		 log.logInfo(url_check)
	 } else {
		 KeywordUtil.markFailed('FAIL: password update may not have worked!')
 
		 log.logInfo(url_check)
	 }
 }
 
