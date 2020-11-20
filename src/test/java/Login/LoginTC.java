package Login;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.LoginPagePO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTC extends BaseTest {


        int Flag =1;



        @Test
        public void VerifyAcknowedgementSelection() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("Once User select the Acknowledgement the Send and Print buttons should be activated");
                ExtentTestManager.getTest().assignCategory("Acknowledgment Category");
                log.info("Acknowledgement selection test case execution  Started");
            }

            Thread.sleep(15000);
            CommonMethods commonMethods = new CommonMethods(driver);
            LoginPagePO loginpage = new LoginPagePO(driver);

            // Open Url for execution



            Assert.assertTrue(commonMethods.openUrl(loginpage.Url));
            driver.navigate().refresh();






            // Step 1 : Click on manage button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_manage),"Unable to click on manage button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on manage button");


            // Step 2 : Select report to default option from dropdown

            Select select = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]/select[1]")));
            select.selectByValue("FRAUD");

            ExtentTestManager.getTest().log(LogStatus.PASS,"Select Value from");

            Select select1 = new Select(driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/span[1]/select[1]")));
            select1.selectByValue("FRAUD");





            // Step 2 : Scroll Down Page to view Review button

            commonMethods.scrollPageByJs();


            //Step 3:Click on review button

            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_review),"Unable to click on review button");
            ExtentTestManager.getTest().log(LogStatus.PASS, "Click on review button");

            // Step 4 Check on

        }
    }



