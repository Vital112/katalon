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

WebUI.setText(findTestObject('Create/3_Patterns/2_Fragment/Page_/input__username'), GlobalVariable.Login)

WebUI.setEncryptedText(findTestObject('Create/3_Patterns/2_Fragment/Page_/input__password'), GlobalVariable.Password)

WebUI.click(findTestObject('Create/3_Patterns/2_Fragment/Page_/div_'))

WebUI.click(findTestObject('Create/3_Patterns/2_Fragment/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Create/3_Patterns/2_Fragment/Page_AK Dashboard/a_'))

WebUI.click(findTestObject('Create/3_Patterns/2_Fragment/Page_/a_'))

WebUI.click(findTestObject('Create/3_Patterns/2_Fragment/Page_ -/input_ _name'))

WebUI.setText(findTestObject('Create/3_Patterns/2_Fragment/Page_ -/input_ _name'), 'Fragment_1')

WebUI.setText(findTestObject('Create/3_Patterns/2_Fragment/Page_ -/input_  _shortname'), 'fragment_name')

WebUI.setText(findTestObject('Create/3_Patterns/2_Fragment/Page_ -/textarea_emoji_content'), 'fragment')

WebUI.click(findTestObject('Create/3_Patterns/2_Fragment/Page_ -/button_'))

WebUI.closeBrowser()

