package PageObjects;

import BasePackage.BasePage;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AccountManagePO extends BasePage
{

    public AccountManagePO(WebDriver driver) throws IOException {

        super(driver);
    }

    ReadExcel readExcel = new ReadExcel("Data.xlsx", "AdminEmail");
    
    
    public String Overdrafttooltip = readExcel.readValues("OverdraftTooltip");
    public String Timetoacttooltip = readExcel.readValues("TimeToactTooltip");
    public String Amountduetooltip = readExcel.readValues("AmountdueTooltip");

    

    public By drpdown_1 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_2 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_3 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_4 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_5 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By btn_review = By.xpath("//button[contains(text(),'Review')]");
    public By btn_commuhistory = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]");
    public By btn_reset = By.xpath("//button[contains(text(),'Reset All')]");
    public By tooltip_overdraft = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/div[2]/span[1]/i[1]");
    public By tooltip_timetoact=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]/div[2]/span[1]/i[1]");
    public By tooltip_amtdue=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[2]/div[2]/span[1]/i[1]");
    public By txt_amountdue= By.xpath("//span[contains(text(),'$0.00')]");


}
