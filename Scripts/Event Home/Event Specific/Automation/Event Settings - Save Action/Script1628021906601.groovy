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
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver as WebDriver
import com.paulhammant.ngwebdriver.ByAngular
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.paulhammant.ngwebdriver.NgWebDriver
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtila


////Login ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)
//WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.eventSettingsURL)  //Go to Event Settings for Automation
WebUI.delay(3)


//Turn off Video Streaming toggle
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/toggle_videoStreaming_Yes_xpath'))
WebUI.delay(3)


//Check that Save button has appeared and if so click it (or end the test)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/button_Save'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/button_Save'))

//Verify Success Popup (or stop here)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/div_Event Settings Saved'), 7, FailureHandling.STOP_ON_FAILURE)

//Check Footer is gone (or stop here)
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/footer'), 0, FailureHandling.STOP_ON_FAILURE)


//Refresh page, and ensure that save action state is successful (or stop here)
WebUI.refresh()
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/toggle_videoStreaming - No'), 3, FailureHandling.STOP_ON_FAILURE)

//Reset Defaults
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/toggle_videoStreaming_No_xpath'))
WebUI.click(findTestObject('Object Repository/Page_EXPO/Events Main page/NGX Home/Event Settings/button_Save'))
WebUI.delay(7)

//WebUI.closeBrowser()


