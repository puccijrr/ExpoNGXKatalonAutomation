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

////****Uncomment if running test case individually***
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.login_Url)

WebUI.click(findTestObject('Page_EXPO/Login Objects/Forgot Password/a_Having Trouble Logging In')) //click forgot password link

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/Forgot Password/h1_Having Trouble Logging In'), 2) //Ensure correct page is entered from header

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/input_Forgot Your Password'), GlobalVariable.login) //Input Email

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/button_Send Magic Link')) //click Send Magic Link button (ensures visibility after input is typed)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/h1_Your Magic Link Has Been Sent'), 5) //Ensure correct page is entered from header

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/a_Cancel')) //Cancel back to login page


//WebUI.closeBrowser()