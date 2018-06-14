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

Random rnd = new Random()

randomNumber = (10000 + rnd.nextInt(100000))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sessionqa.aluvii.com/employee/Login/Login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login/input_UserName'), 'ceo@aluvii.com')

WebUI.setText(findTestObject('Page_Login/input_Password'), 'Admin@123')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Dashboard/a_Manage Memberships'))

WebUI.delay(4)

WebUI.mouseOver(findTestObject('Page_Manage Memberships/span_k-icon  k-i-arrow-60-down'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Manage Memberships/a_Create New Account'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Manage Memberships/input_GuestAccountName'), String.valueOf('Selenium' + System.currentTimeMillis()))

Email_ID = (('Selenium' + System.currentTimeMillis()) + '@gmail.com')

WebUI.sendKeys(findTestObject('Page_Manage Memberships/input_PrimaryEmail'), Email_ID)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Manage Memberships/input_PrimaryPhone'), '8015566689')

WebUI.setText(findTestObject('Page_Manage Memberships/input_StreetAddress1'), String.valueOf(System.currentTimeMillis()))

WebUI.setText(findTestObject('Page_Manage Memberships/input_ZipCode'), '94097')

WebUI.setText(findTestObject('Page_Manage Memberships/input_City'), 'Orem')

WebUI.setText(findTestObject('Page_Manage Memberships/input_State'), 'UT')

WebUI.click(findTestObject('Page_Manage Memberships/input_nextButton'))

WebUI.setText(findTestObject('Page_Manage Memberships/input_FirstName'), String.valueOf('Selenium' + System.currentTimeMillis()))

WebUI.setText(findTestObject('Page_Manage Memberships/input_LastName'), String.valueOf('Selenium' + System.currentTimeMillis()))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Manage Memberships/input_nextButton_1'))

WebUI.delay(20)

WebUI.click(findTestObject('Page_Manage Memberships/Page_Manage Memberships/input_btnCancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.clearText(findTestObject('Page_Manage Memberships/SearchBox'))

WebUI.sendKeys(findTestObject('Page_Manage Memberships/SearchBox'), Email_ID)

WebUI.click(findTestObject('Page_Manage Memberships/SearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Page_Manage Memberships/Member_Email_Column'), Email_ID.toLowerCase())

WebUI.closeBrowser()

