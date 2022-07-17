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


//NG Webdriver version

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(GlobalVariable.login_Url)
//
//WebDriver driver = DriverFactory.getWebDriver()
//driver.manage().window().maximize()
//
//// Creating an instance of NgWebDriver
//ngdriver = new NgWebDriver((JavascriptExecutor) driver);
//
//// Waiting for Angular to finish async activity
//ngdriver.waitForAngularRequestsToFinish();
//
//driver.findElement(ByAngular.cssContainingText("[formcontrolname=\"email\"]","")).sendKeys("fake@home.com")
//
//driver.findElement(ByAngular.cssContainingText("[formcontrolname=\"password\"]","")).sendKeys("Password1")
//
//driver.findElement(ByAngular.cssContainingText("button","Virtual")).click();
//
//WebUI.delay(3)
//
//WebUI.verifyElementPresent(findTestObject('Page_EXPO/Login Objects/div_popup_Email not found'), 3)
//
//driver.quit();
//
//WebUI.closeBrowser()


//OBject Version

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.login_Url)

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Email Address_ngx'), 'fake@home.com')

WebUI.setText(findTestObject('Object Repository/Page_EXPO/Login Objects/input_Password_ngx'), 'Password1')

WebUI.click(findTestObject('Object Repository/Page_EXPO/Login Objects/button_Login_ngx'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Login Objects/div_Invalid credentials'), 3)

//WebUI.closeBrowser()









