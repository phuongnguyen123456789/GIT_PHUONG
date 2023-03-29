import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import common.Utilities

//Open browser and navigate to https://atlassian.design./components/tooltip/examples
WebUI.openBrowser('https://atlassian.design./components/tooltip/examples')

//Maximize window
WebUI.maximizeWindow()

//Hover to button "Hover over me"
WebUI.mouseOver(findTestObject('Object Repository/Repo_ATLASSIAN/btn_HoverOverMe'))

//Verify tooltip "Hello World" displayed
//WebUI.verifyElementText(findTestObject('Object Repository/Repo_ATLASSIAN/lbl_Tooltip'), 'Hello World')
String toolTip = WebUI.getText(findTestObject('Object Repository/Repo_ATLASSIAN/lbl_Tooltip'))
WebUI.verifyEqual(toolTip, 'Hello World')

//Get background color of "Hover over me" button when hovering on it
String backgroundColor = WebUI.getCSSValue(findTestObject('Object Repository/Repo_ATLASSIAN/btn_HoverOverMe'), 'background')

//Convert backgroundColor 
String newBackgroundColor = Utilities.convertRGBAToHex(backgroundColor)

//Verify backgroud color of hover is displayed correctly
WebUI.verifyEqual(newBackgroundColor, '#0055cc')

//Close browser
WebUI.closeBrowser()
