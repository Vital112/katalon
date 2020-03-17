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

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input__username'), 'vitaly@vitaly')

WebUI.setEncryptedText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input__password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_AK Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/label_'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input_ _name'), 'SMS_resource')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_SMS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/select_ EmailSMSPush'), 
    'sms', true)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div__1'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_drop_sms'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input_ _search'), 'SMS_resource')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_91 - SMS_resourceEmailSMS'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input_  _search'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input_  _search'), 'Database_1')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_123 - Database_15'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_next_1'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/input_ _prompt'), 'SMS_template_1')

'Ожидание(3сек) '
WebUI.waitForElementNotClickable(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_ _ui four wide column'), 
    3)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/i_134_ui icon big plus square outline'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div_next_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/div__1_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/label_    ( )'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_sms/Page_/button_'))

WebUI.closeBrowser()

