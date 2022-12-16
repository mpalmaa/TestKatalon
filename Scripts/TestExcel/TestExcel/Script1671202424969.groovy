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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.delay(2)

WebUI.setText(findTestObject('ElementosExcel/Page_ToolsQA/input_Full Name_userName'), Nombre)

WebUI.setText(findTestObject('ElementosExcel/Page_ToolsQA/input_Email_userEmail'), Email)

WebUI.setText(findTestObject('ElementosExcel/Page_ToolsQA/textarea_Current Address_currentAddress'), CAddress)

WebUI.setText(findTestObject('ElementosExcel/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), PAddress)

WebUI.click(findTestObject('ElementosExcel/Page_ToolsQA/button_Submit'))

//Comparar
VarNombre = WebUI.getText(findTestObject('ElementosExcel/Page_ToolsQA/input_Full Name_userName'))

VarEmail = WebUI.getText(findTestObject('ElementosExcel/Page_ToolsQA/input_Email_userEmail'))

VarCA = WebUI.getText(findTestObject('ElementosExcel/Page_ToolsQA/textarea_Current Address_currentAddress'))

VarPA = WebUI.getText(findTestObject('ElementosExcel/Page_ToolsQA/textarea_Permanent Address_permanentAddress'))

if (VarNombre == Nombre) {
    println('El elemento tiene match correcto')
} else {
    println('El elemento está erróneo')
}

if (VarEmail == Email) {
    println('El elemento tiene match correcto')
} else {
    println('El elemento está erróneo')
}

if (VarCA == CAddress) {
    println('El elemento tiene match correcto')
} else {
    println('El elemento está erróneo')
}

if (VarPA == PAddress) {
    println('El elemento tiene match correcto')
} else {
    println('El elemento está erróneo')
}

WebUI.takeScreenshot("C:\\Users\\Public\\Images\\ResultExcel.png")

WebUI.delay(2)
WebUI.closeBrowser()