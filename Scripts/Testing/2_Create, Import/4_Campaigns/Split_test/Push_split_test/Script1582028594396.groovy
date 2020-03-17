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

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/input__username'), 'vitaly@vitaly')

WebUI.setEncryptedText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/input__password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_AK Dashboard/a_-'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/label_'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/input_ _name'), 'Push_split_test')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div_Push'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/select_ EmailSMSPush'), 
    'push', true)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div__1'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div_97 - All_channels_resourceEmailPushSMS'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/input_ _search'), 'Push_resource')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div_95 - Push_resourcePush'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/select_All_channels_resourceAll_channels_re_0ca68d'), 
    '95', true)

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/div_123 -drop'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/input_  _search'), 'Database_1')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div_123 - Database_15'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/div_next_1'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/input_ _prompt'), 'Push_template_1')

WebUI.waitForElementNotClickable(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div_131 Push_template_12020-02-18 122 Push__3432ec'), 
    1)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/i_131_ui icon big plus square outline'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/input_ _prompt_1'), 'Push_template_2')

WebUI.waitForElementNotClickable(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/div_123 Push_template_22020-02-10 117 Push__0db105'), 
    1)

not_run: WebUI.mouseOver(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/div__tools'))

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/i_117_ui icon big plus square outline'))

not_run: WebUI.waitForElementNotClickable(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/div_123 Push_template_22020-02-10 117 Push__0db105'), 
    10)

WebUI.click(findTestObject('Create/4_Campaigns/Split_test/Push_split_test/Page_/div_next_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/div__1_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/label_    ( )'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Split_test/Push_split_test/Page_/button_'))

WebUI.closeBrowser()

