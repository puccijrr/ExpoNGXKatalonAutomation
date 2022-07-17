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

//Verifiy that all objects exist
WebUI.navigateToUrl(url)

WebUI.click(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), 3)

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), 3)

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), 3)

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 3)

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/i_I agree to theandand also agree to receive news and tips via email_fa fa-check'), 
    3)

//Check that Create Account button is grayed out (not clickable) when all fields are blank
//WebUI.verifyElementPresent(findTestObject('null'), 3, FailureHandling.STOP_ON_FAILURE)

//NO TERMS CHECK: Fill in all data except terms of use/privacy policy box and ensure button is STILL grayed out (not clickable)
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), "First")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), "Last")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), "test@home.com")
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.delay(2)

//WebUI.getAttribute(findTestObject('null'),'Present')

//WebUI.verifyElementNotClickable(findTestObject('null'))
//*WAT*WebUI.click(findTestObject('null'))

//Set Checkbox for terms and service
WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/i_I agree to theandand also agree to receive news and tips via email_fa fa-check'))

//BLANK FIRST NAME: Fill in all data except First Name and ensure button is STILL grayed out (not clickable)
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), "")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), "Last")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), "test@home.com")
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.verifyElementPresent(findTestObject('null'), 3)

//BLANK LAST NAME: Fill in all data except Last Name and ensure button is STILL grayed out (not clickable)
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), "First")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), "")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), "test@home.com")
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.verifyElementPresent(findTestObject('null'), 3)

//BLANK LAST NAME: Fill in all data except Email and ensure button is STILL grayed out (not clickable)
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), "First")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), "Last")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), "")
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.verifyElementPresent(findTestObject('null'), 3)

//BLANK LAST NAME: Fill in all data except Passwords and ensure button is STILL grayed out (not clickable)
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), "First")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), "Last")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), "test@home.com")
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), '')
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), '')
WebUI.verifyElementClickable(findTestObject('null'))

//Fill in all data and ensure button is enabled (clickable)
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_fname'), "First")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_lname'), "Last")
WebUI.setText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_email'), "test@home.com")
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_pass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/Create an account/input_createAccount_confPass'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
WebUI.verifyElementPresent(findTestObject('null'),
	3, FailureHandling.STOP_ON_FAILURE)


WebUI.closeWindowUrl('https://rick.web.expopass.com/#!/signup')
