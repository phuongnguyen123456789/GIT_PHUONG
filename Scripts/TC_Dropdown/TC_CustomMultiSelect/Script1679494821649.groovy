import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html
WebUI.openBrowser("https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html")

//Maximize window
WebUI.maximizeWindow()

//Prepare some items select: 'January', 'February', 'April'
List<String> lstSelect = ["January", "February", "April"]

//Click on 'Multiple Select' dropdown control on Basic Select section
WebUI.click(findTestObject('Object Repository/Repo_Dropdown/ddl_MultiSelectMonth'))

//Select item in dropdown based on prepared data in step 2
for(String item in lstSelect) {
	//Get element of these checkboxes
	WebElement eleCheck = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Repo_Dropdown/ddl_Custom',['text':item]), 30)
	
	//Check status of these checkboxes
	boolean isChecked = eleCheck.isSelected()
	
	//If checkbox is not checked -> check to checkbox
	if(isChecked == false) {
		WebUI.click(findTestObject('Object Repository/Repo_Dropdown/ddl_Custom',['text':item]))		
	}
}

//Delay 2s
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()