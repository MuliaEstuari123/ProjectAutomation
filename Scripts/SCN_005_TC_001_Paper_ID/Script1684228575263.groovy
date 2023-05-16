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





String tipe_mitra = 'list'

String No_mitra = 'B202301964908'

String Badan_Usaha = 'list'

String Nama = 'Aditya'

String email = 'Aditya@gmail.com'

String No_Telpon = ' '



WebUI.openBrowser('') // open browser atau apps terkait aplikasi mitra tersebut


for (int i = 0; i < 3; i++) {

   if (WebUI.verifyElementClickable(findTestObject) { // pertama verify salah satu element untuk validasi object
	
	
	WebUI.selectOptionByValue(('object list option tipe mitra'),tipe_mitra) // memilih opsi list mitra sesuai test data

    WebUI.setText(findTestObject('object No Mitra'),No_mitra) // menginput no mitra sesuai test data
	
	WebUI.selectOptionByValue(('object badan usaha'),Badan_Usaha) // memilih opsi list badan usaha sesuai test data

    WebUI.setText(findTestObject('object input Nama'),Nama) // input nama sesuai test data

	WebUI.setText(findTestObject('object input email'),email) // input email sesuai test data
	
	WebUI.setText(findTestObject('object input No Telpon'),No_Telpon) // input no telpon sesuai test data
	
     } else {
	
	WS.comment('object tidak di temukan')
	
   }


 }

	

WebUI.closeBrowser() // tutup browser atau apps











