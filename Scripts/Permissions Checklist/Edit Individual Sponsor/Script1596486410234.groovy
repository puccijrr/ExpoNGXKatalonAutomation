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

WebUI.delay(1)

//Navigate to URL to Permission Bundle Sponsor edit on NGX
WebUI.navigateToUrl(GlobalVariable.permissionBundleURL)

WebUI.delay(3)

//Ensure that URL is still correct (did not direct to a different location)
check_link()

//Verify page elements are found to ensure page load
WebUI.maximizeWindow() //maximize window for better view
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/span_Sponsored Session'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/span_Native Session Ad'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/span_Native Display Ad'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/span_Banner Ad'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/mat-icon_edit'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/li_Native Display Ad'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/label_URL'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/label_Logo'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/label_Header'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/label_Bundle Name'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/label_Body'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h3_You should not be here   You are an intruder'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h3_Welcome to Hell'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h3_Permissions Event'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h3_Permission Bundle'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h3_Enable or disable the locations to display the ad'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h2_Select Ad Type'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h2_Native Display Ad Locations'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/h1_Where should it go'), 3, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_EXPO/Sponsorships/Permissons Event/Permission Bundle/a_httpsd-wfrenprojectsvirusland'), 3, FailureHandling.CONTINUE_ON_FAILURE)


//WebUI.closeBrowser()

def check_link() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == GlobalVariable.permissionBundleURL) {
        KeywordUtil.markPassed('PASS: the expected URL was found')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: incorrect url found, may have been redirected to incorrect location!!')

        log.logInfo(url_check)
    }
}





