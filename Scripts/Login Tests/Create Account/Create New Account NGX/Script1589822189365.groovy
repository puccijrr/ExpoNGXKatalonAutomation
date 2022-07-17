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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.login_Url)

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/button_Create An Account'))

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_First Name_ng-untouched ng-pristine ng-valid'), 
    'auto')

//***Should be unique each runthrough***
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_Last Name_ng-untouched ng-pristine ng-valid'), GlobalVariable.newAccount_lName)

//***Should be unique each runthrough***
WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_Email Address_ng-untouched ng-pristin_9cd3b9'), GlobalVariable.newAccount_email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_Password_ng-untouched ng-valid ng-dirty'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/input_Confirm Password_ng-untouched ng-vali_21dd19'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/div_agree_SHOW_mat-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/Create an account/button_Create Account'))

//TEMP
WebUI.closeBrowser()
