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

WebUI.setText(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/input__username'), 'vitaly@vitaly')

WebUI.setEncryptedText(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/input__password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_AK Dashboard/a_'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/a_'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/label_'))

WebUI.setText(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/input_ _name'), 'Email_regular')

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_Email'))

WebUI.selectOptionByValue(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/select_ EmailSMSPush'), 'email', 
    true)

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div__1'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_     Email'))

WebUI.setText(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/input_ _search'), 'Email_resource')

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_89 - Email_resourceEmailPushSMS'))

WebUI.selectOptionByValue(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/select_     SMS_resourceEmail_resourceNew l_6cc698'), 
    '89', true)

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_124 - log1'))

WebUI.setText(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/input_  _search'), 'Database_1')

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_123 - Database_15'))

WebUI.selectOptionByValue(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/select_logDatabase_1'), '123', 
    true)

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_next_1'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/input_ _prompt'), 'Email_template_1')

'Ожидание(3сек)'
WebUI.waitForElementNotClickable(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_ _ui row'), 3)

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/i_124_ui icon big plus square outline'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div_next_2'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/div__1_2'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/label_    ( )'))

WebUI.click(findTestObject('Create/4_Campaigns/Regular/Regular_email/Page_/button_'))

WebUI.closeBrowser()

