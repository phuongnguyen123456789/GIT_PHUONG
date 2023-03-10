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

WebUI.openBrowser('https://demo.nopcommerce.com/register?returnUrl=%2F')

WebUI.maximizeWindow()

//Get number of total option
int totalDays = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'))
int totalMonths = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Month'))
int totalYears = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Year'))

//Verify these text: ['Day', '1', '2', '3'] present in Date Of Birth dropdown
WebUI.verifyOptionsPresent(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'), ['Day', '1', '2', '3'])
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'), '1', false, 30)
WebUI.verifyOptionPresentByValue(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'), '2', false, 30)

//Verify these text: ['May','December'] present in Date Of Birth dropdown
WebUI.verifyOptionsPresent(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Month'), ['May', 'December'])
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Month'), 'July', false, 30)
WebUI.verifyOptionPresentByValue(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Year'), '1990', false, 30)

//Select value on dropdown by index 31
WebUI.selectOptionByIndex(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'), 4)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Month'), 7)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Year'), 78)

//Verify Option Selected By Index
WebUI.verifyOptionSelectedByIndex(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'), 4, 30)

//Verify Option Not Selected By Index
WebUI.verifyOptionNotSelectedByIndex(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Day'), 5, 30)

//Select Option By Label
WebUI.selectOptionByLabel(findTestObject('Object Repository/Repo_NOPCOMMERCE/ddl_Month'), 'November', false)

WebUI.delay(3)

WebUI.closeBrowser()
