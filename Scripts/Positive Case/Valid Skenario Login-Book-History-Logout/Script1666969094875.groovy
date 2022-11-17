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

WebUI.setText(findTestObject('Login/txtField_username'), 'John Doe')

WebUI.setText(findTestObject('Login/txtField_password'), 'ThisIsNotAPassword')

WebUI.waitForElementVisible(findTestObject('Login/btn_login-form'), 5)

WebUI.verifyElementVisible(findTestObject('Login/btn_login-form'))

WebUI.click(findTestObject('Login/btn_login-form'))

WebUI.verifyElementPresent(findTestObject('Book Appointment/verify_halamanMakeAppointment'), 10)

WebUI.selectOptionByValue(findTestObject('Book Appointment/select_facility'), 'Seoul CURA Healthcare Center', true)

WebUI.check(findTestObject('Book Appointment/checkbox_hospitalReadmission'))

WebUI.click(findTestObject('Book Appointment/radioBtn_healthcareProgram2'))

WebUI.click(findTestObject('Book Appointment/date_visitDate-fieldKotak'))

WebUI.setText(findTestObject('Book Appointment/date_visitDate-fieldInput'), '11/10/2022')

WebUI.setText(findTestObject('Book Appointment/textarea_comment'), 'fasilitas kesehatannya bagus dan mantaappp gesss')

WebUI.waitForElementVisible(findTestObject('Book Appointment/btn_bookAppointment'), 5)

WebUI.verifyElementVisible(findTestObject('Book Appointment/btn_bookAppointment'))

WebUI.click(findTestObject('Book Appointment/btn_bookAppointment'))

WebUI.waitForElementPresent(findTestObject('Book Appointment/verify_appointmentConfirmation'), 5)

WebUI.verifyElementPresent(findTestObject('Book Appointment/verify_appointmentConfirmation'), 5)

WebUI.waitForElementVisible(findTestObject('Book Appointment/btn_homepageConfirmation'), 5)

WebUI.verifyElementVisible(findTestObject('Book Appointment/btn_homepageConfirmation'))

WebUI.click(findTestObject('Book Appointment/btn_homepageConfirmation'))

WebUI.waitForElementPresent(findTestObject('Homepage/btn_menu-toggle'), 5)

WebUI.verifyElementPresent(findTestObject('Homepage/btn_menu-toggle'), 5)

WebUI.click(findTestObject('Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('Homepage/btn_history-toggle'))

WebUI.waitForElementPresent(findTestObject('Book Appointment/verify_halamanHistory'), 5)

WebUI.verifyElementPresent(findTestObject('Book Appointment/verify_halamanHistory'), 5)

WebUI.click(findTestObject('Homepage/btn_menu-toggle'))

WebUI.waitForElementPresent(findTestObject('Homepage/btn_logout-toggle'), 5)

WebUI.verifyElementPresent(findTestObject('Homepage/btn_logout-toggle'), 5)

WebUI.click(findTestObject('Homepage/btn_logout-toggle'))

WebUI.verifyElementPresent(findTestObject('Book Appointment/verify_halamanAwal'), 5)

WebUI.closeBrowser()

