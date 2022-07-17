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

WebUI.callTestCase(findTestCase('Login Tests/Login Basic'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Details/div_Automation712019 - 8312019Fake Town AL  Event Owner'))

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

//----Backend---- run test case that correct parmeters are ruturned from attendee fields form end point [https://api-dev.expopass.com/api/v1.1/forms/631/attendee_fields/]
WebUI.callTestCase(findTestCase('Registration Section Tests/Registration Code/Backend/Registration Form Attendee Parameters'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

//Next enter in details based on user parameters
WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input_Required_first_name'), fName)

WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input__last_name'), lName)

WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input__email_address'), email)

WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input__company_name'), 'Test Company')

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/i_privacy_policy_check'))

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/div_next'))

//----Backend---- run test case that reg levels form can be called [https://api-dev.expopass.com/api/v1.1/forms/631/registration_levels/?email_address=]
WebUI.callTestCase(findTestCase('Registration Section Tests/Registration Code/Backend/Registration Levels'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/div_select'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_nextReg'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_How many guests page'), 3, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/btn_next_guests'))
}

WebUI.delay(2)

//----Backend---- run test case that cart page calls both API GET requests [https://api-dev.expopass.com/api/v1.1/forms/631/cart/] and [https://api-dev.expopass.com/api/v1.1/forms/631/registration_levels/2028/addon_sessions/]
WebUI.callTestCase(findTestCase('Registration Section Tests/Registration Code/Backend/Cart Page Calls'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_checkout'))

WebUI.delay(5)

//----Backend---- run test case that gets and checks email request sent for page [https://api-dev.expopass.com/api/v1.1/forms/631/cart/mails/]
WebUI.callTestCase(findTestCase('Registration Section Tests/Registration Code/Backend/Get Registration Emails'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_next_CompleteAndSend'))

WebUI.delay(2)

//----Backend---- run test case that checks receipt endpoint and parameters GET [https://api-dev.expopass.com/api/v1.1/forms/631/cart/mails/]
WebUI.callTestCase(findTestCase('Registration Section Tests/Registration Code/Backend/Get Registration Receipt'), [:], FailureHandling.CONTINUE_ON_FAILURE)

//-----Verify that page with "You're all set!" was found to ensure steps correctly sent email-----
//Since the regConf object was found we can click "Done" to go back to the main expo reg form
def check_ConfirmationDiv() {
	KeywordLogger log = new KeywordLogger()

	regConf = findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_Youre all set Registration confirmation')
//	if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_How many guests page'), 3, FailureHandling.OPTIONAL)) {
	if (WebUI.verifyElementPresent(regConf, 3, FailureHandling.OPTIONAL)) {
		KeywordUtil.markPassed('PASS: the correct confirmation \'you\'re all set\' was found signaling the the user registration email was sent')

		WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/div_DONE'))
	} else {
		KeywordUtil.markFailed('FAIL: confirmation \'you\'re all set\' was found, please investigate!!')
	}
}


check_ConfirmationDiv()



