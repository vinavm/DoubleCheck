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
    public By chk_box = By.xpath(".//*[@class='check is-link']");
    public By btn_Send = By.xpath(".//*[text()='Send']");
    public By btn_print = By.xpath(".//*[text()='Print']");
    public By txt_amtdue = By.xpath("//span[contains(text(),'$3,176.97')]");
    public By txt_cash = By.xpath("//div[contains(text(),'$3,176.97')]");
   



}
