import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Prepare list data to check to checkbox: Anemia, Emotional Disorder, Digestive Problems
List<String> lstCheckbox = ["Anemia", "Emotional Disorder", "Digestive Problems"]

//Open https://automationfc.github.io/multiple-fields/
WebUI.openBrowser("https://automationfc.github.io/multiple-fields/")

//Maximize window
WebUI.maximizeWindow()

//Check to checkbox follow list data that prepared at step 1
for(String item in lstCheckbox) {
	//Get element of these checkboxes
	WebElement eleCheckbox = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Repo_Checkbox/chk_CheckboxByText',['text':item]),2)
	
	//Check status of these checkboxes
	boolean isChecked = eleCheckbox.isSelected()
	
	//If checkbox is not checked -> check to checkbox
	if (isChecked == false) {
		WebUI.check(findTestObject('Object Repository/Repo_Checkbox/chk_CheckboxByText',['text':item]))
	}
}

//Delay 2s
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()