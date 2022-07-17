import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.login_Url)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/a_Reset'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/input_Forgot Your Password_ng-untouched ng-_329cbd'), GlobalVariable.newAccount_email)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/input_Forgot Your Password_ng-untouched ng-_329cbd'), GlobalVariable.newAccount_email)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/input_Forgot Your Password_ng-untouched ng-_329cbd'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/input_Forgot Your Password_ng-untouched ng-_329cbd'), GlobalVariable.newAccount_email)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/button_Okay'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Forgot Password/a_Cancel'))

WebUI.closeBrowser()

