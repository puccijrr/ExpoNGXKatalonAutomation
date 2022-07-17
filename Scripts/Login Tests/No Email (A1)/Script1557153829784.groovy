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

WebUI.navigateToUrl(GlobalVariable.login_Url)

WebUI.setText(findTestObject('Page_EXPO/Login Objects/input_email'), 'fake@home.com')

WebUI.setEncryptedText(findTestObject('Page_EXPO/Login Objects/input_password'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Page_EXPO/Login Objects/div_log in'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/div_popup_Email not found'), 3)

WebUI.closeBrowser()

