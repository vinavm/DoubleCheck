package BasePackage;


import BasePackage.ExtentReport.*;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseTest {

    public WebDriver driver;
    public Logger log = Logger.getLogger("Test");

    public BaseTest() {

    }

    public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {
        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }

   @Parameters({"browserName", "localDriverPath"})
   @BeforeClass(alwaysRun = true)
   public void beforeClass(@Optional("chrome") String browserName, @Optional("C:\\Program Files\\chromedriver.exe") String localDriverPath) {
       getLocalDriver(browserName, localDriverPath);

       this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       this.driver.manage().window().maximize();
   }

    @Parameters({"browserName"})
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(@Optional("firefox") String browserName, Method method) {
        ExtentTestManager.startTest("Method Name: " + method.getName());
        //ExtentTestManager.getTest().log(LogStatus.INFO, "Open Browser and navigate to " + this.driver.getCurrentUrl(), "Browser Name: " + browserName);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("TEST STARTED # " + method.getAnnotation(Test.class).description());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


   private void getLocalDriver(String browserName, String driverPath) {
       if (browserName.equalsIgnoreCase("chrome")) {
           System.setProperty("webdriver.chrome.driver", driverPath);
           
           ChromeOptions options = new ChromeOptions();
           options.addArguments("user-data-dir=Profile 3");
           options.addArguments("--start-maximized");
           driver = new ChromeDriver(options);
           
           
          
           
       } else if (browserName.equalsIgnoreCase("firefox")) {
           System.setProperty("webdriver.gecko.driver", driverPath);
           this.driver = new FirefoxDriver();
       } else if (browserName.equalsIgnoreCase("ie")) {
           this.driver = new InternetExplorerDriver();
       }
   }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result, Method method) throws Exception {
        String fileName;
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String testSRes;
        Date endDateTime;
        String testDescription;
        String dateEndInString;
        if (result.getStatus() == 2) {
            endDateTime = new Date();
            DateFormat shortDf = DateFormat.getDateTimeInstance(3, 3);
            testDescription = shortDf.format(endDateTime).replace("/", "_");
            testDescription = testDescription.replace(" ", "_");
            testDescription = testDescription.replace(":", "_");
            dateEndInString = "SC_error__" + testDescription;
            fileName = System.getProperty("user.dir") + "\\Reports\\failure_screenshots\\" + dateEndInString + ".png";
            takeSnapShot(this.driver, fileName);
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshot" + ExtentTestManager.getTest().addScreenCapture("failure_screenshots\\" + dateEndInString + ".png"));
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable().getMessage());
            ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
            testSRes = "FAIL";
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
            testSRes = "SKIP";
        } else {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
            testSRes = "PASS";
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("TEST COMPLETED # [ " + testSRes + " ] " + method.getAnnotation(Test.class).description());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
        ExtentManager.getReporter().flush();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Browser Closed");
        Thread.sleep(2000);
    }

    @AfterClass(alwaysRun = true)
    public void terminateReport() {
        driver.quit();
    
    }

    public WebDriver getDriver() {

        return  driver;
    }

}
