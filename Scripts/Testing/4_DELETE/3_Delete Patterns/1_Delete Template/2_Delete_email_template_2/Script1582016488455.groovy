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

WebUI.setText(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/input__username'), 
    'vitaly@vitaly')

WebUI.setEncryptedText(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/input__password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_AK Dashboard/div_'))

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_AK Dashboard/a_'))

WebUI.setText(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/input__ak-table-search'), 
    'Email_template_2')

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/i__search link icon'))

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Delete/3_Delete Patterns/1_Delete Template/Delete_email_template_2/Page_/div__1'))

WebUI.closeBrowser()

