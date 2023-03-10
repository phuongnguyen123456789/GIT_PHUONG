import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open https://www.fahasa.com/customer/account/create
WebUI.openBrowser('https://www.fahasa.com/customer/account/create')

//MaximizeWindow
WebUI.maximizeWindow()

//Click to tab Login 
WebUI.click(findTestObject('Object Repository/Repo_FAHASA/tab_Login'))

//Verify button "Đăng nhập" disabled 
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Repo_FAHASA/btn_Login'))

//Input invalid "Số điện thoại/Email" and "Mật khẩu"
WebUI.setText(findTestObject('Object Repository/Repo_FAHASA/txt_Phone'),'0909123456')
WebUI.setText(findTestObject('Object Repository/Repo_FAHASA/txt_Password'),'ThisIsAPassword!')

//Verify button "Đăng nhập" enabled
WebUI.verifyElementVisible(findTestObject('Object Repository/Repo_FAHASA/btn_Login'),FailureHandling.STOP_ON_FAILURE)

//Click to button "Đăng nhập"
WebUI.click(findTestObject('Object Repository/Repo_FAHASA/btn_Login'),FailureHandling.STOP_ON_FAILURE)

//Verify message "Số điện thoại/Email hoặc Mật khẩu sai!"
WebUI.verifyElementText(findTestObject('Object Repository/Repo_FAHASA/msg_Error'),'Số điện thoại/Email hoặc Mật khẩu sai!')

//Close Browser
WebUI.closeBrowser()



