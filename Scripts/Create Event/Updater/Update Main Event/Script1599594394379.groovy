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

//Login to legacy as super admin
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/input_Forgot password_email'), GlobalVariable.login)
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/input_Forgot password_password'), GlobalVariable.password)
WebUI.doubleClick(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/div_log in'))

WebUI.delay(7)

//Nav to event url in question
WebUI.navigateToUrl('https://rick.web.expopass.com/events/Ge5rp8j/details')
WebUI.maximizeWindow()

WebUI.delay(5)

//Change event date-from and date-to (based on input)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/i_Date_fa fa-pencil'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/input__date_from'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/Days/' + GlobalVariable.dayFrom))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/Legacy Details/div_Save'))

WebUI.delay(3)

//Go to each session and update them for current day
WebUI.navigateToUrl('https://rick.web.expopass.com/events/Ge5rp8j/sessions/16951/details')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/div_EDIT'))
WebUI.sendKeys(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/input__time_from'),Keys.chord(Keys.CONTROL,Keys.LEFT_SHIFT,'R')) //Legacy page needs to HARD Refresh to dispose of selector bug
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/input__time_from'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/td_9 am'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details//td_900'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/input__time_to'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/td_10 pm'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/td_1000'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Session Details/Legacy Details/div_SAVE'))

WebUI.delay(7)

WebUI.closeBrowser()

