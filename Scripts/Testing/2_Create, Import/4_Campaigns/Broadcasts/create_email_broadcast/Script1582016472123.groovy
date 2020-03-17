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

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/input__username'), GlobalVariable.Login)

WebUI.setEncryptedText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/input__password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_AK Dashboard/a_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/input_ _name'), 'Email_broadcast')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/label_'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/Page_/i_ _dropdown icon'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/div_Email'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/select_ EmailSMSPush'), 
    'email', true)

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/div_next/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/div_     Email'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/input_ _search'), 'Email_resource')

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/div_89 - Email_resourceEmail'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/select_     Email_resourceNew lunar resourc_ac46f0'), 
    '89', true)

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/data123/Page_/input_  _search'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/input_  _search'), 'Database_1')

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/data123/Page_/div_No results found'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/div__1'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/i_ _ui big plus square outline icon'))

WebUI.setText(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/input_ _prompt'), 'Email_template_1')

WebUI.waitForElementNotClickable(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/click_wait/Page_/div_ _ui row'), 
    3)

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/Page_/i_124_ui icon big plus square outline'))

WebUI.click(findTestObject('Create/4_Campaigns/Broadcast/Broadcast_email/div_next_1/Page_/div_next_1'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/div__1_2'))

WebUI.click(findTestObject('Object Repository/Create/4_Campaigns/Broadcast/Broadcast_email/Page_/button_'))

WebUI.closeBrowser()

