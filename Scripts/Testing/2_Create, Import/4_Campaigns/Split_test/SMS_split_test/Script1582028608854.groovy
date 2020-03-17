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

WebUI.navigateToUrl('https://vitaly-rizaev.dev.altkraft.com/login?next=http%3A%2F%2Fvitaly-rizaev.dev.altkraft.com%2Fhome%3F')

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/input__username'), 'vitaly@vitaly')

WebUI.setEncryptedText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/input__password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_AK Dashboard/a_-'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/label_'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/input_ _name'), 'SMS_split_test')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_SMS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/select_ EmailSMSPush'), 
    'sms', true)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div__1'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_99 -drop_resourceSMS'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/input_ _search'), 'SMS_resource')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_99 - SMS_resourceSMS'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_123 - drop_15'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/input_  _search'), 'Database_1')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_123 - Database_15'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_next_1'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/input_ _prompt'), 'SMS_template_1')

WebUI.waitForElementNotClickable(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_ _ui row'), 2)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/i_147_ui icon big plus square outline'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/input_ _prompt_2'), 'SMS_template_2')

WebUI.waitForElementNotClickable(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_144 SMS_template_22020-02-18 128 SMS_te_619693'), 
    3)

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/i_128_ui icon big plus square outline'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/SMS_split_test/Page_/div_next_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/div__1_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/label_    ( )'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/SMS_split_test/Page_/button_'))

WebUI.closeBrowser()

