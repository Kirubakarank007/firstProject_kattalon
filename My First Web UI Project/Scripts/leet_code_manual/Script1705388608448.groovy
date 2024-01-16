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

WebUI.openBrowser('https://leetcode.com/accounts/login/?next=%2Fproblemset%2F')

WebUI.setText(findTestObject('leet_code_manual/Page_Account Login - LeetCode/input_Premium_login'), 'kirubakaran02002@gmail.com')

WebUI.setText(findTestObject('leet_code_manual/Page_Account Login - LeetCode/input_Premium_password'), 'Kiruba++0070')

WebUI.click(findTestObject('leet_code_manual/Page_Account Login - LeetCode/div_Sign In'))

WebUI.click(findTestObject('leet_code_manual/Page_Problems - LeetCode/img_Store_h-full w-full rounded-full object-cover'))

WebUI.verifyElementPresent(findTestObject('leet_code_manual/Page_Problems - LeetCode/a_KIRUBAKARAN_K'), 0)

WebUI.click(findTestObject('leet_code_manual/Page_Problems - LeetCode/li_Sign Out'))

