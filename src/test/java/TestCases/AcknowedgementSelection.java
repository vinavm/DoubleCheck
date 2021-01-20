package TestCases;


import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AccountManagePO;
import PageObjects.AcknowledgementPO;
import PageObjects.DFELoginPO;
import PageObjects.DecisionFAccountManagePO;
import PageObjects.DecisionFAcknowdegementPO;
import PageObjects.GmailHomePO;
import PageObjects.LoginPagePO;
import PageObjects.ReportsPO;

import com.relevantcodes.extentreports.LogStatus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AcknowedgementSelection extends BaseTest {


        int Flag =1;



        @Test(enabled=false)
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
            
            
            // Step 3: Search record from search list
            
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
            ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            commonMethods.refreshPage();
            
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
    
        @Test(enabled=false)
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
            
            // Step 3: Search record from search list
            
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
            ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);

            
            commonMethods.refreshPage();

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

        @Test(enabled=false)
        public void CashPaymentWarningMessage() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("DCC:-931 To validate teller is able to see I confirm that I have received the Cash deposit required to cover the total amount due. warning message for cash");
                ExtentTestManager.getTest().assignCategory("Payment Category");
                log.info("Checkbox warning message for cash payment test case execution  Started");
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
            
            
            // Step 3: Search record from search list
            
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
            ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            commonMethods.refreshPage();
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(accoutmanage.drpdown_1, "Member to Pay"),"Unable to select member to pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select member to pay dropdown value from member decision dropdown","Test Data: Member to pay");
            
            

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

            
     // Step 10: Select checkbox item reported as fraud
            
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.btn_Cash),"Unable to click on cash payment button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Select cash button option","Selected cash button option");

            
            // Step 11: Select cash option checkbox
            
            Assert.assertTrue(commonMethods.getText(acknowledgment.checkboxcash_warningmessage),"I confirm that I have received the Cash deposit required to cover the total amount due.");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify warning message for cash payment method","Verified warning message for cash payment method");


            
            
        }   
 
        

        @Test(enabled=false)
        public void VerifyAmountbeingReturn() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("DCC:-949 To validate amount to being return to payee should show same value in MC and Decision fe");
                ExtentTestManager.getTest().assignCategory("Acknowledgment Category");
                log.info("Return to Payee amount verify test case execution  Started");
            }

            Thread.sleep(15000);
            CommonMethods commonMethods = new CommonMethods(driver);
            LoginPagePO loginpage = new LoginPagePO(driver);
            AccountManagePO accoutmanage = new AccountManagePO(driver);
            AcknowledgementPO acknowledgment = new AcknowledgementPO(driver);
            DFELoginPO dfeloginpage = new DFELoginPO(driver);
            DecisionFAccountManagePO  defaccoutmanage = new DecisionFAccountManagePO(driver);
            DecisionFAcknowdegementPO defacknowedegement = new DecisionFAcknowdegementPO(driver);
            
            
            commonMethods.openUrl(dfeloginpage.Url);

            
            // Step 2 : Refresh page to get data of user's account

           // commonMethods.refreshPage();
            
            
            
            Thread.sleep(15000);
            // Step 3: Search record from search list
            
            
         //   Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
         //   ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            // Step 2 : Click on get started button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(dfeloginpage.btn_getstarted),"Unable to click on get started button button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on get started button","Test Data:" +dfeloginpage.accountname);

            // Step 3: Click on skip button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(dfeloginpage.btn_skip),"Unable to click on skip button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on get started button","Clicked on skip button");

            
            
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_1, "Credit Union Decision"),"Unable to select i will pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select i will pay dropdown value from member decision dropdown","Test Data: i will pay");
            
            

            // Step 4: Select i will pay dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_2, "Credit Union Decision"),"Unable to select i will pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select i will pay dropdown value from member decision dropdown","Test Data: i will pay");
            
            

            // Step 5: Select i will pay dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_3, "Return to Payee"),"Unable to select i will pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select i will pay dropdown value from member decision dropdown","Test Data: i will pay");
            
            

            // Step 6: Select i will pay dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_4, "Return to Payee"),"Unable to select i will pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select i will pay dropdown value from member decision dropdown","Test Data: i will pay");
            
            
            

            // Step 7: Select i will pay dropdown value from member decision dropdown
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_5, "Return to Payee"),"Unable to select i will pay value from dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Select i will pay dropdown value from member decision dropdown","Test Data: i will pay");
            


            //Step 9:Click on review button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(defaccoutmanage.btn_review),"Unable to click on review button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on review button","Clicked on review button");

            // Step 10 : Verify item being return to payee amount
            
            
            Assert.assertTrue(commonMethods.getText(defacknowedegement.txt_cash),"$3,176.97");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify item being return to payee amount in DC","Verified item being return to payee amount in DC");

            
            

            // Step 1 :Open Url for execution
            commonMethods.openUrl(loginpage.Url);

            
            // Step 2 : Refresh page to get data of user's account

            commonMethods.refreshPage();
            
            
            // Step 3: Search record from search list
            
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
            ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            commonMethods.refreshPage();
            
            
            commonMethods.scrollPageByJs();


            //Step 9:Click on review button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(accoutmanage.btn_review),"Unable to click on review button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on review button","Clicked on review button");

        
            
            Assert.assertTrue(commonMethods.getText(defacknowedegement.txt_cash),"$3,176.97");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify item being return to payee amount in MC","Verified item being return to payee amount in MC");

         
        
}
  
        @Test(enabled=false)
        public void ConfirmDecisionPopUpAllFraud() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("DCC -998:-MC - Fraud Confirmation Message change");
                ExtentTestManager.getTest().assignCategory("Acknowledgment Category");
                log.info("All fraud decision selection test case execution  Started");
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
            
            
            // Step 3: Search record from search list
            
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
            ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            commonMethods.refreshPage();
            
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
            
            
            Assert.assertTrue(commonMethods.getText(acknowledgment.popup_fraudconfirmation),"By Selecting Report Fraud you are acknowledging that the member has identified these item(s) as fraudulent.");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify fraud confirmation pop up","Verified fraud confirmation pop up");

            
        }
        
        @Test(enabled=false)
        public void ConfirmationMessageForFraud() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("DCC -998:-MC - To validate teller is able to see confirmation message if user select all decision as fraud");
                ExtentTestManager.getTest().assignCategory("Acknowledgment Category");
                log.info("All fraud decision selection test case execution  Started");
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
            
            
            // Step 3: Search record from search list
            
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
            ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
            
            
            // Step 2 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);


            // Step 3: Select report fraud dropdown value from member decision dropdown
            
            commonMethods.refreshPage();
            
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
            
            // Step 12 : Verify on print button
           
            Assert.assertTrue(commonMethods.verifyElementIsEnable(acknowledgment.btn_print),"Unable to verify print button is enable");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify print button is enable","Verfied print button is enable");
            
            // Step 13: Verify frud confirmation pop up
            
            Assert.assertTrue(commonMethods.getText(acknowledgment.popup_fraudconfirmation),"By Selecting Report Fraud you are acknowledging that the member has identified these item(s) as fraudulent.");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify fraud confirmation pop up","Verified fraud confirmation pop up");

            // Step 14: Click on print button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.btn_print),"Unable to click on print button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on print button","Click on print button");
            
            commonMethods.SwitchToPrintWindow();
            
            // Step 15: Click on fraudulent button
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.btn_fraudulent), "Unable to click on report as fraudulent button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on report as fraudulent button","Clicked on report as fraudulent button");

            // Step 16: Verify confirmation message for fraud
            
            Assert.assertTrue(commonMethods.getText(acknowledgment.fraud_confirmationmessage),"Your item changes have been submitted.");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Verify fraud decision confirmation message","Verified fraud decision confirmation message");

            // Step 17 : Roll back transaction

           commonMethods.CreditCardPaymentRollback();
            
        }
        @Test
		    public void AllFraudDecisionCompleteScenario() throws Exception {
		        if (Flag > 0) {
		            ExtentTestManager.getTest().getTest().setName("DCC -976:- DFE- To Verify To validate teller is able to complete pending all fraud decision transaction from MC.");
		            ExtentTestManager.getTest().assignCategory("DFE Category");
		            log.info("DFE All options are marked as fraud test case execution  Started");
		        }
		
		        Thread.sleep(15000);
		        CommonMethods commonMethods = new CommonMethods(driver);
		        DFELoginPO dfeloginpage = new DFELoginPO(driver);
		        LoginPagePO loginpage = new LoginPagePO(driver);
		        AcknowledgementPO acknowledgment = new AcknowledgementPO(driver);
		        DecisionFAccountManagePO  defaccoutmanage = new DecisionFAccountManagePO(driver);
		        DecisionFAcknowdegementPO defacknowedegement = new DecisionFAcknowdegementPO(driver);
		
		        commonMethods.openUrl(dfeloginpage.Url);
		
		        
		        // Step 2 : Refresh page to get data of user's account
		
		       // commonMethods.refreshPage();
		        
		        
		        
		        Thread.sleep(15000);
		        // Step 3: Search record from search list
		        
		        
		     //   Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
		     //   ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
		        
		        
		        // Step 2 : Click on get started button
		
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(dfeloginpage.btn_getstarted),"Unable to click on get started button button");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on get started button","Test Data:" +dfeloginpage.accountname);
		
		   // Step 3: Click on skip button
		        
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(dfeloginpage.btn_skip),"Unable to click on skip button");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on skip button","Clicked on skip button");
		
		        
		        
		        Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_1, "Report Fraud"),"Unable to select fraud report value from dropdown list");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
		        
		        
		
		        // Step 4: Select report fraud dropdown value from member decision dropdown
		        
		        Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_2, "Report Fraud"),"Unable to select fraud report value from dropdown list");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
		        
		        
		
		        // Step 5: Select report fraud dropdown value from member decision dropdown
		        
		        Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_3, "Report Fraud"),"Unable to select fraud report value from dropdown list");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
		        
		        
		
		        // Step 6: Select report fraud dropdown value from member decision dropdown
		        
		        Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_4, "Report Fraud"),"Unable to select fraud report value from dropdown list");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
		        
		        
		        
		
		        // Step 7: Select report fraud dropdown value from member decision dropdown
		        
		        Assert.assertTrue(commonMethods.selectValFromDropDown(defaccoutmanage.drpdown_5, "Report Fraud"),"Unable to select fraud report value from dropdown list");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Select report fraud dropdown value from member decision dropdown","Test Data: Report Fraud");
		        
		
		
		        //Step 9:Click on review button
		
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(defaccoutmanage.btn_review),"Unable to click on review button");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on review button","Clicked on review button");
		
		    
		        // Step 10: Click on  checkbox item report as fraud
		        
		       
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(defacknowedegement.checkbx_reportfruad),"Unable to check item report as fraud checkbox");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Check item report as fruad checkbox","Checked item report as fraud checkbox");
		
		       
		        // Step 11: Verify submit button should be enable 
		        
		        Assert.assertTrue(commonMethods.verifyElementIsEnable(defacknowedegement.btn_Submit),"Submit button is disable");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify submit button is enabled","Verified submit button is enabled");
		
		       // Step 12: Click on submit button
		        
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(defacknowedegement.btn_Submit),"Unable to click on submit button");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on submit button","Clicked on submit button");
		       
		        // Step 13: Verify confirm decision pop up
		        
		        Assert.assertTrue(commonMethods.getText(defacknowedegement.popup_confirmdecision),"Confirm Decision");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify confirm Decision pop up","Verified confirm decision pop up");
		        
		        // Step 14: Verify report as fraudulent btn text
		        
		        Assert.assertTrue(commonMethods.getText(defacknowedegement.btn_reportfraudulent),"Report as Fraudulent");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify report as fraudulent button","Verified report as fraudulent button");
		        
		        //Step 15 : Click on report fraud button
		        
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(defacknowedegement.btn_reportfraudulent),"Unable to click on fraudulent button");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on fraudulent button","Clicked on fraudulent button");
		       
		        // Step 16 : Verify confirmation message for all fraud transaction.
		        
		        Assert.assertTrue(commonMethods.getText(defacknowedegement.confirmmessage_allfraud),"confirmmessage_allfraud");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify confirmation message for all fraud trnasaction","Verified confirmation message for all fraud trnasaction");
		
		        
		     commonMethods.openUrl(loginpage.Url);
		
		        
		        // Step 2 : Refresh page to get data of user's account
		
		        commonMethods.refreshPage();
		        
		        
		        // Step 3: Search record from search list
		        
		        
		        Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_accountseacrh,loginpage.accountname));
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Search account name in search field","Test Data:" +loginpage.accountname);
		        
		        
		        // Step 2 : Click on manage button
		
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
		        ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button","Test Data:" +loginpage.accountname);
		
		        
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.chk_box),"Unable to click on review button");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Select item reported as fraud checkbox","Selected item reported as fraud checkbox");
		
		        
		       
		        // Step 12 : Verify on print button
		       
		        Assert.assertTrue(commonMethods.verifyElementIsEnable(acknowledgment.btn_print),"Unable to verify print button is enable");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify print button is enable","Verfied print button is enable");
		        
		        // Step 13: Verify frud confirmation pop up
		        
		        Assert.assertTrue(commonMethods.getText(acknowledgment.popup_fraudconfirmation),"By Selecting Report Fraud you are acknowledging that the member has identified these item(s) as fraudulent.");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify fraud confirmation pop up","Verified fraud confirmation pop up");
		
		        // Step 14: Click on print button
		        
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.btn_print),"Unable to click on print button");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on print button","Click on print button");
		        
		        commonMethods.SwitchToPrintWindow();
		        
		        // Step 15: Click on fraudulent button
		        Assert.assertTrue(commonMethods.clickOnLinkOrButton(acknowledgment.btn_fraudulent), "Unable to click on report as fraudulent button");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on report as fraudulent button","Clicked on report as fraudulent button");
		
		        // Step 16: Verify confirmation message for fraud
		        
		        Assert.assertTrue(commonMethods.getText(acknowledgment.fraud_confirmationmessage),"Your item changes have been submitted.");
		        ExtentTestManager.getTest().log(LogStatus.PASS, "Verify fraud decision confirmation message","Verified fraud decision confirmation message");
		
		        // Step 17 : Roll back transaction
		
		       commonMethods.CreditCardPaymentRollback();
		        
		        
		
		    
		    }        
}


