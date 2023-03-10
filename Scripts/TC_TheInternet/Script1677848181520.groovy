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

