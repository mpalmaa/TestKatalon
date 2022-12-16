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
import java.util.List;
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import com.kms.katalon.core.configuration.RunConfiguration

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demre.cl/publicaciones/modelos-resoluciones-pruebas')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TestDownload/Page_Modelos de Pruebas - DEMRE/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/TestDownload/Page_Modelo de Prueba de Comprensin Lectora_f2d623/span_PDF (2,67Mb)'))

WebUI.takeScreenshot("C:\\Users\\Public\\Images\\Download.png")

WebUI.delay(3)

WebUI.closeBrowser()

//Flujo en test Qa

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/upload-download')

WebUI.uploadFile(findTestObject('TestDownload/ToolsQaUpload/UploadButton'), 'C:\\Users\\Miguel\\Downloads\\2023-22-03-31-modelo-comprension-lectora-p2023.pdf')

WebUI.takeScreenshot("C:\\Users\\Public\\Images\\Upload.png")

//Validar si archivo se cargo exitosamente.

if(WebUI.verifyElementPresent(findTestObject('Object Repository/TestDownload/ToolsQaUpload/nameArchiveUpload'),0)==true){
	
	print('El documento fue cargado exitosamente!')
}else {
	
	print('Problema con la carga!')
}


WebUI.delay(3)

WebUI.closeBrowser()

