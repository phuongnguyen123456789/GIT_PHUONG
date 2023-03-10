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

//Open https://katalon-demo-cura.herokuapp.com/profile.php
WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php')

//Maximize Window
WebUI.maximizeWindow()

//Input Username "John Doe"
WebUI.setText(findTestObject('Object Repository/Repo_CURA/txt_Username'), 'John Doe')

//Input Password "ThisIsNotAPassword"
WebUI.setText(findTestObject('Object Repository/Repo_CURA/txt_Password'), 'ThisIsNotAPassword')

//Click button Login 
WebUI.click(findTestObject('Object Repository/Repo_CURA/btn_Login'),FailureHandling.STOP_ON_FAILURE)

//Verify button Book Appointment displayed
WebUI.verifyTextPresent('Book Appointment', false)

// Check on \'Apply for hospital readmission\' checkbox'
WebUI.check(findTestObject('Object Repository/Repo_CURA/chk_HospitalReadmission'))

//Verify checkbox \'Apply for hospital readmission\' is checked
WebUI.verifyElementChecked(findTestObject('Object Repository/Repo_CURA/chk_HospitalReadmission'), 0)

// Uncheck on \'Apply for hospital readmission\' checkbox
WebUI.uncheck(findTestObject('Object Repository/Repo_CURA/chk_HospitalReadmission'))

//Verify checkbox \'Apply for hospital readmission\' is NOT checked
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Repo_CURA/chk_HospitalReadmission'), 0)

// Check on \'Apply for hospital readmission\' checkbox
WebUI.click(findTestObject('Object Repository/Repo_CURA/chk_HospitalReadmission'))

// Check on \'Medicaid\' radio button
WebUI.click(findTestObject('Object Repository/Repo_CURA/rdo_Medicaid'))

//Verify radio \'Medicaid\' is checked
WebUI.verifyElementChecked(findTestObject('Object Repository/Repo_CURA/rdo_Medicaid'), 0)

//Verify radio \'Medicare \' and \'None \' are NOT checked
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Repo_CURA/rdo_Medicare'), 0)
WebUI.verifyElementNotChecked(findTestObject('Object Repository/Repo_CURA/rdo_None'), 0)

//Close browser
WebUI.closeBrowser()




