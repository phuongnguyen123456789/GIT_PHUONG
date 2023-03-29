import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open http://the-internet.herokuapp.com/login
WebUI.openBrowser('http://the-internet.herokuapp.com/login')

//Maximize Window
WebUI.maximizeWindow()

//Input Username "tomsmith"
WebUI.setText(findTestObject('Object Repository/Repo_TheInternet/txt_Username'), 'tomsmith')

//Input Password "SuperSecretPassword!"
WebUI.setText(findTestObject('Object Repository/Repo_TheInternet/txt_Password'), 'SuperSecretPassword!')

//Click button Login
WebUI.click(findTestObject('Object Repository/Repo_TheInternet/btn_Login'),FailureHandling.STOP_ON_FAILURE)

//Verify text "Welcome to the Secure Area. When you are done click logout below." displayed
WebUI.verifyTextPresent('Welcome to the Secure Area. When you are done click logout below.', false)

//Close browser
WebUI.closeBrowser()

