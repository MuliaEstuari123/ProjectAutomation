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

String email = 'estu@gmail.com'

WebUI.openBrowser('https://www.paper.id/')



if(WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Paper.id/btn_LOGIN'))) {
	
	WebUI.click(findTestObject('Object Repository/Page_Paper.id/btn_LOGIN'))
	
	WebUI.takeScreenshot()
	
	
	WebUI.setText(findTestObject('Object Repository/Page_Paper.id/input_Email'),email)
	
	WebUI.takeScreenshot()
	
	for (int i = 0; i < 3; i++) {
	
		WebUI.click(findTestObject('Object Repository/Page_Paper.id/btn_Selanjutnya'))
		
		WebUI.takeScreenshot()
	
}
	
	

} else {
	
	WS.comment('object tidak di temukan')
}


WebUI.closeBrowser()











