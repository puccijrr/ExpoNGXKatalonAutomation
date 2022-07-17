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


WebUI.callTestCase(findTestCase('Login Tests/Login Basic'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_Automation1312020 - 10302020Fake Town AL'))

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/div_Registration'))

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/div_Registration Code'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/div_Preview'))

WebUI.delay(3)

WebUI.switchToWindowUrl('http://expo-registration.s3-website-us-west-2.amazonaws.com/#!/registration/Kendr2q/info')

WebUI.delay(3)


//Verify that registration pannel object correctly appears in form
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_Registration_Cart_Form'),
	3, FailureHandling.STOP_ON_FAILURE)



WebUI.setText(findTestObject('Page_EXPO/input_Required_first_name'), 'James')

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_Test num_last_name'), 
    'Belt')

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_New_email_address'), 
    'rick+test22@expopass.com')

WebUI.setText(findTestObject('Page_EXPO/input__company_name'), 'test')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_dcba'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/i_c_fas fa-check'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/i_c_fas fa-check'))

WebUI.click(findTestObject('Page_EXPO/i_Zimbabwe_fas fa-check'))

WebUI.click(findTestObject('Page_EXPO/div_next'))

WebUI.click(findTestObject('Page_EXPO/div_select'))

WebUI.click(findTestObject('Page_EXPO/div_next'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/i_Next_fas fa-check'))

WebUI.click(findTestObject('Page_EXPO/div_next'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/i_Friday 1030_fas fa-check'))

WebUI.click(findTestObject('Page_EXPO/div_next'))

WebUI.click(findTestObject('Page_EXPO/div_next'))

WebUI.click(findTestObject('Page_EXPO/div_checkout'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input__address_line2'), 
    'rick@expopass.com')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_Please enter your payment informationRe_21060c'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_Required_name'), 
    'Rick')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div__card-element'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_cardnumber'), 
    '4111 1111 1111 1111')

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_exp-date'), 
    '03 / 22')

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_cvc'), '656')

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/input_postal'), '65656')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_pay 10000'))

WebUI.closeBrowser()

