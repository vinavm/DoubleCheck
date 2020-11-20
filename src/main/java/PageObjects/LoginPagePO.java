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

    public String Url = readExcel.readValues("Url");


    public By btn_review = By.xpath("//button[contains(text(),'Review')]");
    public By btn_manage = By.xpath(".//*[text()='Manage']");
    public By chk_box = By.xpath(".//*[@class='check is-link']");
   



}

