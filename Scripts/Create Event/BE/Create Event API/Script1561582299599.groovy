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
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.verification.WSResponseManager as WSResponseManager

WebUI.callTestCase(findTestCase('Login Tests/BE/Validate Token'), [:], FailureHandling.STOP_ON_FAILURE)

//WS.sendRequest(findTestObject('Page_EXPO/Create Event/BE/Event creation', [('url') : GlobalVariable.url, ('webVersion') : GlobalVariable.webVersion
//            , ('eventID') : GlobalVariable.eventID, ('regLevelID') : GlobalVariable.regLevelID, ('token') : GlobalVariable.Authorization
//            , ('username') : GlobalVariable.username, ('password') : GlobalVariable.password, ('clientID') : GlobalVariable.clientID
//            , ('bearer') : GlobalVariable.Bearer]))

WS.sendRequestAndVerify(findTestObject('Page_EXPO/Create Event/BE/Event creation', [('url') : GlobalVariable.url, ('webVersion') : GlobalVariable.webVersion
	, ('eventID') : GlobalVariable.eventID, ('regLevelID') : GlobalVariable.regLevelID, ('token') : GlobalVariable.Authorization
	, ('username') : GlobalVariable.username, ('password') : GlobalVariable.password, ('clientID') : GlobalVariable.clientID
	, ('bearer') : GlobalVariable.Bearer]))

