import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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




