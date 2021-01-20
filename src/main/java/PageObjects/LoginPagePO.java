package PageObjects;

import BasePackage.BasePage;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class LoginPagePO extends BasePage
{

    public LoginPagePO(WebDriver driver) throws IOException {

        super(driver);
    }

    ReadExcel readExcel = new ReadExcel("Data.xlsx", "AdminEmail");

    public String Url = readExcel.readValues("UrlMC");
    public String accountname = readExcel.readValues("AccountName");
    public String NorecordAccountname = readExcel.readValues("NorecordAccountname");
    public String GmailUrl = readExcel.readValues("GmailUrl");
    
   


    public By btn_review = By.xpath("//button[contains(text(),'Review')]");
    public By btn_manage = By.xpath(".//*[text()='Manage']");
    public By chk_box = By.xpath(".//*[@class='check is-link']");
    public By txt_accountseacrh = By.xpath(".//*[@placeholder='Search by account #, name or phone number']");
    public By menu_reports = By.xpath("//a[contains(text(),'Reports')]");
   



}

