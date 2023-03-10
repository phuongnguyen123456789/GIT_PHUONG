import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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


