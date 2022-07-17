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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


////Login  ***Comment IN if running test case individually!***
//WebUI.callTestCase(findTestCase('Login Tests/Login with Main Events NGX'), [('url') : GlobalVariable.login_Url, ('events') : GlobalVariable.events], 
//    FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_EXPO/Events List NGX/button_Create Event'))

//Verify enters the right legacy page which includes "legacy/create" and PASS, otherwise fail with message
WebUI.delay(3)

check_link()

//Go back to Events List on NGX
WebUI.navigateToUrl(GlobalVariable.events)

//WebUI.closeBrowser()


def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == GlobalVariable.legacyCreate) {
        KeywordUtil.markPassed('PASS: the correct URL was found after clicking the Create Account button')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect link found!!')

        log.logInfo(url_check)
    }
}



