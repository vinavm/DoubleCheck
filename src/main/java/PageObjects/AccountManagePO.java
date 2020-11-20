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

    

    public By drpdown_1 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_2 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_3 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_4 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By drpdown_5 = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[2]/span[1]/select[1]");
    public By btn_review = By.xpath("//button[contains(text(),'Review')]");



}
