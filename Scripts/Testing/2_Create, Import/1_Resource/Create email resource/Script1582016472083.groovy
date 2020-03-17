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

WebUI.navigateToUrl(GlobalVariable.Domain)

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_/input__username'), GlobalVariable.Login)

WebUI.setEncryptedText(findTestObject('Create/1_Resource/Resource_email/Page_/input__password'), GlobalVariable.Password)

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_/div_'))

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_AK Dashboard/a_'))

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_/a_'))

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_/div_Email'))

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_ -/input_ _name'), 'Email_resource')

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_ -/div_New Martian databaseDatabase_1New solar_05144d'))

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_ -/input_ _search'), 'Database_1')

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_ -/div_123 - Database_1'))

WebUI.selectOptionByValue(findTestObject('Create/1_Resource/Resource_email/Page_ -/select_New Martian databaseDatabase_1New so_07f9dc'), 
    '123', true)

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_ -/div_                                       _294fb4'))

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_ -/input_URL -   _url'), 'http://example.com')

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_ -/input_   _trk_domain'), 'trk.example.com')

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_ -/input_ _email_optionsfrom_name'), 'Name')

WebUI.setText(findTestObject('Create/1_Resource/Resource_email/Page_ -/input_Email _email_optionsfrom_email'), 'example@example.com')

WebUI.click(findTestObject('Create/1_Resource/Resource_email/Page_ -/button_'))

WebUI.closeBrowser()

