import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Open https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html
WebUI.openBrowser("https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html")

//Maximize window
WebUI.maximizeWindow()

//Click on 'Multiple Select' dropdown control on Basic Select section
WebUI.click(findTestObject('Object Repository/Repo_Dropdown/ddl_MultiSelectMonth'))

//Select All
WebUI.click(findTestObject('Object Repository/Repo_Dropdown/ddl_SelectAll'))

//Delay 2s
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()