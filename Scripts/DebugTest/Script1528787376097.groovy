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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sessionqa.aluvii.com/employee')

WebUI.setText(findTestObject('Debug/Page_Login/input_UserName'), 'ceo@aluvii.com')

WebUI.setText(findTestObject('Debug/Page_Login/input_Password'), 'Admin@123')

WebUI.click(findTestObject('Debug/Page_Login/button_Login'))

WebUI.click(findTestObject('Debug/Page_Dashboard/span_Register Management'))

WebUI.delay(30)

WebUI.switchToFrame(findTestObject('ProductFrame/Page_Register Management Dashboard/iframe_This page requires fram'), 30)

WebUI.click(findTestObject('Page_Register Management Dashboard/UnitPriceIncreaseArrow'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sessionqa.aluvii.com/employee')

WebUI.setText(findTestObject('Page_Register Management Dashboard/Page_Login/input_UserName'), 'ceo@aluvii.com')

WebUI.setText(findTestObject('Page_Register Management Dashboard/Page_Login/input_Password'), 'Admin@123')

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Dashboard/span_Register Management'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/a_ID'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/span_k-icon k-i-sort-asc-sm'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/a_ID'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/a_ID'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/a_ID'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/html_var loadTime  0loadTime'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/html_var loadTime  0loadTime'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Page_Register Management Dashboard/a_Products'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Product_ID_Column'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Product_ID_Column'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Product_ProductName_Column'))

WebUI.click(findTestObject('Page_Register Management Dashboard/Product_ProductName_Column'))

WebUI.closeBrowser()

