import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import common.Utilities

"Check randome some checkboxes"

//Open https://automationfc.github.io/multiple-fields/
WebUI.openBrowser("https://automationfc.github.io/multiple-fields/")

//Maximize window
WebUI.maximizeWindow()

//Get total number of checkboxes
int total = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Repo_Checkbox/chk_All'), 30).size()

//Get random some checkboxes
List<String> lstRandom = Utilities.getRandom(total, 3)

//Check random some checkboxes
for(String index in lstRandom) {
	WebUI.check(findTestObject('Object Repository/Repo_Checkbox/chk_AllByIndex',['index':index]))
}

//Delay 2s
WebUI.delay(2)

//Close browser
WebUI.closeBrowser()
