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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('Homepage/btn_login-toggle'))

WebUI.waitForElementPresent(findTestObject('Login/txtField_username'), 5)

WebUI.verifyElementPresent(findTestObject('Login/txtField_username'), 5)

WebUI.setText(findTestObject('Login/txtField_username'), '')

WebUI.setText(findTestObject('Login/txtField_password'), '')

WebUI.waitForElementPresent(findTestObject('Login/btn_login-form'), 5)

WebUI.verifyElementPresent(findTestObject('Login/btn_login-form'), 5)

WebUI.click(findTestObject('Login/btn_login-form'))

WebUI.waitForElementVisible(findTestObject('Login/verify_gagalLogin'), 5)

WebUI.verifyTextPresent('Login failed! Please ensure the username and password are valid.', true)

WebUI.closeBrowser()

