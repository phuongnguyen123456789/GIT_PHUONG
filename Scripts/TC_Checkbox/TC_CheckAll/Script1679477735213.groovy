import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open "https://automationfc.github.io/multiple-fields/" 
WebUI.openBrowser("https://automationfc.github.io/multiple-fields/")

//Maximize window
WebUI.maximizeWindow()

//Get total number of checkbox
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Repo_Checkbox/chk_All'), 30).size()

//Check all checkboxes using WebUI.check
/*for(int i=1; i<=total; i++) {
	WebUI.check(findTestObject('Object Repository/Repo_Checkbox/chk_AllByIndex',['index':i]))
}*/

//Check all checkboxes using WebUI.click
for(int i=1; i<=total; i++) {
	//Find element of checkbox
	WebElement eleCheckbox = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Repo_Checkbox/chk_AllByIndex',['index':i]),2)

	//Check status of checkbox
	boolean isChecked = eleCheckbox.isSelected()
	//boolean isChecked = WebUI.verifyElementChecked(findTestObject('Object Repository/Repo_Checkbox/chk_AllByIndex',['index':i]), 2, FailureHandling.STOP_ON_FAILURE)
	
	//If checkbox is not checked --> check to checkbox
	if(isChecked == false) {
		WebUI.click(findTestObject('Object Repository/Repo_Checkbox/chk_AllByIndex',['index':i]))
	}
}

//Delay 2s
WebUI.delay(2)

//Uncheck all checkboxes
for(int i=1; i<=total; i++) {
	WebUI.uncheck(findTestObject('Object Repository/Repo_Checkbox/chk_AllByIndex',['index':i]))
}

//Close browser
WebUI.closeBrowser()
