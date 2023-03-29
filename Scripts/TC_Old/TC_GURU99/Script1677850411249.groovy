import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open browser and navite to https://demo.guru99.com/V4/
WebUI.openBrowser('https://demo.guru99.com/V4/')

//Maximize Window
WebUI.maximizeWindow()

//Click "here" link at the bottom
WebUI.click(findTestObject('Object Repository/Repo_GURU99/lnk_Here'))

//Input Email ID "phuong.nguyen@aperia.com"
WebUI.setText(findTestObject('Object Repository/Repo_GURU99/txt_Email'), 'phuong.nguyen@aperia.com')

//Click Submit button
WebUI.click(findTestObject('Object Repository/Repo_GURU99/btn_Submit'),FailureHandling.STOP_ON_FAILURE)

//Get UserID "mngr482860" 
String UserID = WebUI.getText(findTestObject('Object Repository/Repo_GURU99/lbl_UserID'))

//Get Password "qypEmEp"
String Password = WebUI.getText(findTestObject('Object Repository/Repo_GURU99/lbl_Password'))

//Navigate to "https://demo.guru99.com/V4/again"
WebUI.navigateToUrl('https://demo.guru99.com/V4/')

//Input UserID and Password at step 5
WebUI.setText(findTestObject('Object Repository/Repo_GURU99/txt_UserID'), UserID)
WebUI.setText(findTestObject('Object Repository/Repo_GURU99/txt_Password'), Password)

//Click button Login
WebUI.click(findTestObject('Object Repository/Repo_GURU99/btn_Login'),FailureHandling.STOP_ON_FAILURE)
 
//Verify message: "Welcome To Manager's Page of Guru99 Bank" displayed
WebUI.verifyTextPresent("Welcome To Manager's Page of Guru99 Bank", false, FailureHandling.STOP_ON_FAILURE)

//Close Browser
WebUI.closeBrowser()


