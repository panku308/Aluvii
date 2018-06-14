import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

Random rnd = new Random()

System.currentTimeMillis()

randomNumber = (10000 + rnd.nextInt(100000))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sessionqa.aluvii.com/employee/Login/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login/input_UserName'), 'ceo@aluvii.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), 'Admin@123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Dashboard/a_Register Management'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Register Management Dashboard/a_Products'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Register Management Dashboard/span_Select Option'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Register Management Dashboard/li_Add Product'))

WebUI.delay(3)

ProductName = ('Selenium' + System.currentTimeMillis())

WebUI.setText(findTestObject('Page_Register Management Dashboard/input_ProductName'), ProductName)

WebUI.click(findTestObject('Page_Register Management Dashboard/a_'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Register Management Dashboard/a_Beverages'))

WebUI.setText(findTestObject('Page_Register Management Dashboard/textarea_ProductDescription'), String.valueOf('Selenium' + 
        System.currentTimeMillis()))

WebUI.click(findTestObject('Page_Register Management Dashboard/a_Pricing'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Register Management Dashboard/input_UnitPrice'), '5')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Register Management Dashboard/a_Sales Tax'))

WebUI.click(findTestObject('Page_Register Management Dashboard/td'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Register Management Dashboard/SelectOption'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Register Management Dashboard/li_Tourism'))

WebUI.click(findTestObject('Page_Register Management Dashboard/input_AddProduct'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Register Management Dashboard/Product_ID_Column'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Register Management Dashboard/Product_ID_Column'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Register Management Dashboard/Product_ProductName_Column'), ProductName)

WebUI.closeBrowser()

