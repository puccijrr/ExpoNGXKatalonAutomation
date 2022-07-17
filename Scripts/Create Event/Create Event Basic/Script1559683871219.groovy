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

//WebUI.openBrowser('')

WebUI.callTestCase(findTestCase('Login Tests/Login Basic'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('hhttps://rick.web.expopass.com/#!/login')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/div_CREATE AN EVENT'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Event Name_conf_name'), eventName)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/input_Dates_date_from'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/td_Dec'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/td_9'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/td_12'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Event Website_website'), eventSite)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Venue_venue'), venue)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Venue Phone Number_venue_phone_number'), phone)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Street Address_street_address'), address)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_City_city'), city)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EXPO/Create Event/select_State'), stateCode, true)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Zip Code_zip_code'), zip)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_EXPO/Create Event/select_Country'), countryCode, true)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Create Event/input_Venue Website_venue_url'), venueSite)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/div_On'))

//WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/a_Upload from computer'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Create Event/button_Create'))

//verify if success popup was found
def check_success() {
	KeywordLogger log = new KeywordLogger()

	popup = findTestObject('Object Repository/Page_EXPO/Create Event/popup_The Event has been created successfully')
	if (WebUI.verifyElementPresent(popup, 3, FailureHandling.OPTIONAL)) {
		KeywordUtil.markPassed('PASS: the popup signaling event creation was found')
	} else {
		KeywordUtil.markFailed('FAIL: could not find popup!!')
	}
}

check_success()

//WebUI.closeBrowser()



