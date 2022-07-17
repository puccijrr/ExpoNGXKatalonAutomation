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

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), firstName)

WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), lastName)

WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), email)

WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/i_I agree to theandand also agree to receive news and tips via email_fa fa-check'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/div_create account'))

//Verification for email section = that new dialog appears with "We send you an email" appears
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/div_ok_logo-holder'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/p_We sent you an Email'), 
    3, FailureHandling.STOP_ON_FAILURE)

//As long as objects were found select "OK"
WebUI.click(findTestObject('null'))

//Verification for account verify section = that new dialog appears with "Please verify your account by entering the 4 digit passcode..." and 4 iput boxes appear
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/div_submit_logo-holder'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/p_Please verify your account by entering the 4 digitpasscode that we sent to your email address'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_submit_1'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_submit_2'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_submit_3'), 
    3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_submit_4'), 
    3, FailureHandling.STOP_ON_FAILURE)

