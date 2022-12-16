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

//Crear Carpeta de imagenes para evidencia.
//def imgDir = RunConfiguration.getProjectDir() + "\\imagesTestEasy"


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.easy.cl/')

WebUI.delay(2)


//Se realiza scroll hasta encontrar titulo "Categoría Destacada".

WebUI.scrollToElement(findTestObject('Elementos Easy/Page_Easy.cl - Renueva el amor por tu hogar/p_Categoras destacadas'), 
    0)

//Consultar si se encuentra el elemento categorías destacadas

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Elementos Easy/Page_Easy.cl - Renueva el amor por tu hogar/p_Categoras destacadas'), 0)==true) {
	
	print(findTestObject('Object Repository/Elementos Easy/Page_Easy.cl - Renueva el amor por tu hogar/p_Categoras destacadas \n'))
	print("Se encuentra exitosamente la categoría: Categorías Destacadas \n")
	
	WebUI.takeScreenshot("C:\\Users\\Public\\Images\\elementocategoria.png")
}else {
	print("No se encuentra el objeto Categorías Destacadas!! \n")
	WebUI.takeScreenshot("C:\\Users\\Public\\Images\\NoEncuentroCategoria.png")
}
//End IF

//Ingreso a categoría Muebles.
WebUI.click(findTestObject('Elementos Easy/Page_Easy.cl - Renueva el amor por tu hogar/a_Muebles'))
WebUI.takeScreenshot("C:\\Users\\Public\\Images\\categoriaMuebles.png")

//Presionar botón "Ver más".
WebUI.doubleClick(findTestObject('Object Repository/Elementos Easy/Page_Muebles/span_Categora'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Elementos Easy/Page_Muebles/a_Ver ms'))

WebUI.getText(findTestObject('Object Repository/Elementos Easy/div categoria mueble/Page_Muebles/div_categoria_mueble'))

//Recorrer div con elementos de categoria.

text = WebUI.getText(findTestObject('Object Repository/Elementos Easy/div categoria mueble/Page_Muebles/div_categoria_mueble'))
print('Contenido: \n' + text)
WebUI.takeScreenshot("C:\\Users\\Public\\Images\\ImpresionCategoria.png")

//Acción sobre categoría "Caja Organizadora"

WebUI.click(findTestObject('Object Repository/Elementos Easy/Page_Muebles/input_(1)_Cajas Organizadoras'))

//Añadir articulo al carro.

WebUI.click(findTestObject('Object Repository/Elementos Easy/Page_Easy/div_Aadir al carro'))

//Yendo al carro de compras.
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Elementos Easy/Page_Easy/a_Ir al carro de compras'))
WebUI.takeScreenshot("C:\\Users\\Public\\Images\\CarroDeCompra.png")

//Validación carro de compras.
textCarroCompra =WebUI.getText(findTestObject('Object Repository/Elementos Easy/Page_Easy.cl - Finalizar la compra/Span Carro de Compra'))
print('Se obtiene título de carro de compra, denominado: '+textCarroCompra+'. \n' )
WebUI.takeScreenshot("C:\\Users\\Public\\Images\\CarroDeCompraTitulo.png")

//Presionar botón Comprar y luego volver al carro de compras.

WebUI.click(findTestObject('Object Repository/Elementos Easy/Page_Easy.cl - Finalizar la compra/a_Finalizar compra'))
WebUI.takeScreenshot("C:\\Users\\Public\\Images\\BackCarroDeCompra.png")
WebUI.back()
WebUI.delay(3)
WebUI.back()
WebUI.closeBrowser()