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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.eventCartURL)

//Next enter in details based on user parameters
WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input_Required_first_name'), fName)

WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input__last_name'), lName)

WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input__email_address'), email)

WebUI.setText(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/input__company_name'), 'Test Company')

//WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/i_privacy_policy_check'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/i_a_fas fa-check'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/div_select'))


WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_nextReg'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_How many guests page'), 3, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/btn_next_guests'))
}

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_checkout'))

WebUI.delay(5)


WebUI.click(findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_next_CompleteAndSend'))

WebUI.delay(2)


//-----Verify that page with "You're all set!" was found to ensure steps correctly sent email-----
//Since the regConf object was found we can click "Done" to go back to the main expo reg form
def check_ConfirmationDiv() {
	KeywordLogger log = new KeywordLogger()

	regConf = findTestObject('Object Repository/Page_EXPO/Registration/Registration Code/Expo Reg Page/div_Youre all set Registration confirmation')

	if (WebUI.verifyElementPresent(regConf, 3, FailureHandling.OPTIONAL)) {
		KeywordUtil.markPassed('PASS: the correct confirmation \'you\'re all set\' was found signaling the the user registration email was sent')

		WebUI.click(findTestObject('Page_EXPO/Registration/Registration Code/Expo Reg Page/div_DONE'))
	} else {
		KeywordUtil.markFailed('FAIL: confirmation \'you\'re all set\' was found, please investigate!!')
	}
}

check_ConfirmationDiv()

