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

//KeywordLogger log = new KeywordLogger()
WebUI.openBrowser('')

WebUI.navigateToUrl('https://rick.web.expopass.com/#!/login')

WebUI.setText(findTestObject('Page_EXPO/Login Objects/input_email'), username)

WebUI.setText(findTestObject('Page_EXPO/Login Objects/input_password'), password)

WebUI.click(findTestObject('Page_EXPO/Login Objects/div_log in'))

WebUI.delay(5)

//Verify login enters the right page which includes "#!/events" and PASS, otherwise fail with message
check_login()


def check_login() {
    KeywordLogger log = new KeywordLogger()

    url_check = (url = WebUI.getUrl())

    if (url_check == 'http://expo-frontend.s3-website-us-west-2.amazonaws.com/#!/events') {
        KeywordUtil.markPassed('PASS: the correct URL was found after clicking the login button')

        log.logInfo(url_check)
    } else {
        KeywordUtil.markFailed('FAIL: either incorrect loggin or home page took more then 5 seconds to login!!')

        log.logInfo(url_check)
    }
}

//Grab Authorize token
WebUI.callTestCase(findTestCase('Login Tests/BE/Validate Token'), [:], FailureHandling.STOP_ON_FAILURE)
