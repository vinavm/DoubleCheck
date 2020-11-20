package TestCases;


import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AccountManagePO;
import PageObjects.AcknowledgementPO;
import PageObjects.LoginPagePO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AcknowedgementSelection extends BaseTest {


        int Flag =1;



        @Test(priority=0)
        public void VerifyAcknowedgementSelection() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("DCC -759:- Once User select the Acknowledgement the Send and Print buttons should be activated");
                ExtentTestManager.getTest().assignCategory("Acknowledgment Category");
                log.info("Acknowledgement selection test case execution  Started");
            }

            Thread.sleep(15000);
            CommonMethods commonMethods = new CommonMethods(driver);
            LoginPagePO loginpage = new LoginPagePO(driver);
            AccountManagePO accoutmanage = new AccountManagePO(driver);
            AcknowledgementPO acknowledgment = new AcknowledgementPO(driver);

            // Step 1 :Open Url for execution
            commonMethods.openUrl(loginpage.Url);

            
            // Step 2 : Refresh page to get data of user's account

            commonMethods.refreshPage();
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data: Harsh Patel");


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_1, "Report Fraud"),"Unable to select fraud report value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
            
            

            // Step 4: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_2, "Report Fraud"),"Unable to select fraud report value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
            
            

            // Step 5: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_3, "Report Fraud"),"Unable to select fraud report value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
            
            

            // Step 6: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_4, "Report Fraud"),"Unable to select fraud report value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
            
            
            

            // Step 7: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_5, "Report Fraud"),"Unable to select fraud report value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
            
            
            // Step 8 : Scroll Down Page to view Review button

            commonMethods.scrollPageByJs();


            //Step 9:Click on review button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(accoutmanage.btn_review),"Unable to click on review button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on review button","Clicked on review button");

            // Step 10: Select checkbox item reported as fraud
            
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.chk_box),"Unable to click on review button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Select item reported as fraud checkbox","Selected item reported as fraud checkbox");

            
            // Step 11 : Make Sure send button and print button should be enabled.
            
            
            Assert.assertTrue(commonMethods.verifyElementIsEnable(acknowledgment.btn_Send),"Unable to verify send button is enable");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify send button is enable","Verfied send button is enable");
            
           
            Assert.assertTrue(commonMethods.verifyElementIsEnable(acknowledgment.btn_print),"Unable to verify print button is enable");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify print button is enable","Verfied print button is enable");
            
            
        }
    
        @Test(priority=1)
        public void VerifyCashAmountandOverdueAmount()throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("DCC-761:- To Validate Cash Paymenet amout and total overdue amount should be same");
                ExtentTestManager.getTest().assignCategory("Acknowledgment Category");
                log.info("Cash Payment amount and over due amount test case execution  Started");
            }

            Thread.sleep(15000);
            CommonMethods commonMethods = new CommonMethods(driver);
            LoginPagePO loginpage = new LoginPagePO(driver);
            AccountManagePO accoutmanage = new AccountManagePO(driver);
            AcknowledgementPO acknowledgment = new AcknowledgementPO(driver);

            // Step 1 :Open Url for execution
            commonMethods.openUrl(loginpage.Url);

            
            // Step 2 : Refresh page to get data of user's account

            commonMethods.refreshPage();
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data: Harsh Patel");


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_1, "Member to Pay"),"Unable to select fraud report value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Member To Pay");
            
            

            // Step 4: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_2, "Member to Pay"),"Unable to select Member to Pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Member To Pay");
            
            

            // Step 5: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_3, "Member to Pay"),"Unable to select Member to Pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Member To Pay");
            
            

            // Step 6: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_4, "Member to Pay"),"Unable to select Member to Pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Member To Pay");
            
            
            

            // Step 7: Select report fraud dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_5, "Member to Pay"),"Unable to select Member to Pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Member To Pay");
            
            
            // Step 8 : Scroll Down Page to view Review button

            commonMethods.scrollPageByJs();


            //Step 9:Click on review button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(accoutmanage.btn_review),"Unable to click on review button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on review button","Clicked on review button");

            // Step 10: Verify amount due and total cash amount should be same.
            
            Assert.assertEquals(commonMethods.getText(acknowledgment.txt_amtdue), commonMethods.getText(acknowledgment.txt_cash));
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify amountdue and cash amount arre equal","Verified amount due and cash amount are equal");
            
            
            
        }

}




