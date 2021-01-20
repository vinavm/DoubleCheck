package PageObjects;

import BasePackage.BasePage;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AcknowledgementPO extends BasePage
{

    public AcknowledgementPO(WebDriver driver) throws IOException {

        super(driver);
    }

    ReadExcel readExcel = new ReadExcel("Data.xlsx", "AdminEmail");

    public String Url = readExcel.readValues("Url");
    
    public String amt_fees = readExcel.readValues("TransactionFee");
    public String lblwarning_acknowedegment =readExcel.readValues("Acknowedgement Warning");
    
    
    
    
    
    
    public By chk_box = By.xpath(".//*[@class='check is-link']");
    public By btn_Send = By.xpath(".//*[text()='Send']");
    public By btn_print = By.xpath(".//*[text()='Print']");
    public By txt_amtdue = By.xpath("//span[contains(text(),'$3,176.97')]");
    public By txt_cash = By.xpath("//div[contains(text(),'$3,176.97')]");
    public By btn_email = By.xpath(".//*[text()='Send Email']");
    public By btn_SMS = By.xpath(".//*[text()='Send SMS']");
    public By btn_resendmail = By.xpath("//span[contains(text(),'Resend Email')]");
    public By btn_resendtext = By.xpath("//span[contains(text(),'Resend Text')]");
    public By radiobtn_SMS = By.xpath(".//*[text()='SMS']");
    public By txt_SMS = By.xpath(".//*[@autocomplete='on']");
    public By btn_creditcard = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]");
    public By lbl_transactionfees= By.xpath("//td[contains(text(),'$20.00')]");
    public By lbl_acknowedgement = By.xpath(".//*[text()='Please acknowledge all items above in order to select payment']");
    public By checkbox_returnpayee = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]");
    public By checkbox_fraud= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]");
    public By amt_rupee = By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div/div[3]/div/section/div[1]/div/div[2]/div[1]/div[1]/div[1]/div[3]");
    public By amt_fraud= By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div/div[3]/div/section/div[1]/div/div[2]/div[1]/div[2]/div[1]/div[3]");
    public By amt_selectedtopay= By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/div/div[3]/div/section/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[3]");
    public By emailtxt_notification = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/span[1]/i[1]");
  
    public By btn_close= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/i[1]");
    public By lbl_status = By.xpath("//div[contains(text(),'Payment Pending')]");
    public By btn_Cash = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/button[1]/span[1]");
    public By checkbx_cash = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/span[1]");
    public By btn_confirmpayment = By.xpath("//button[contains(text(),'Confirm Payment')]");
    public By btn_available = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]/span[1]");
    public By checkbx_balance = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/label[1]/span[1]");
    public By drp_State= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/div[1]/div[5]/div[3]/span[1]/div[1]/div[1]/span[1]/select[1]");
    public By checkboxcash_warningmessage= By.xpath("//div[contains(text(),'I confirm that I have received the Cash deposit re')]");
    public By return_Chkboxavailablebalance = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[1]");
    public By popup_fraudconfirmation = By.xpath("//div[contains(text(),'By Selecting Report Fraud you are acknowledging th')]");
    public By btn_fraudulent = By.xpath("//button[contains(text(),'Report as Fraudulent')]");
    public By fraud_confirmationmessage = By.xpath("//p[contains(text(),'Your item changes have been submitted.')]");
    
}
