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

WebUI.callTestCase(findTestCase('Login Tests/Login Basic'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_EXPO/Events Main page/input_DATA TABLE_search'), 'paid event')

WebUI.delay(3)

//WebUI.sendKeys(findTestObject('Page_EXPO/Events Main page/input_DATA TABLE_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_EXPO/Events Main page/td_Paid Event'))

WebUI.click(findTestObject('Page_EXPO/Events Main page/div_Registration'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_EXPO/Events Main page/div_Transactions'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_EXPO/Registration/Transactions/div_Refund Man'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_EXPO/Registration/Transactions/div_ACTIONS'))

WebUI.click(findTestObject('Page_EXPO/Registration/Transactions/div_Refund'))

WebUI.click(findTestObject('Page_EXPO/Registration/Transactions/div_Refund to credit card'))

WebUI.click(findTestObject('Page_EXPO/Registration/Transactions/div_REFUND 300000'))


