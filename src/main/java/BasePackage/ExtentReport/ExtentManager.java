package BasePackage.ExtentReport;



import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;

public class ExtentManager {
    static ExtentReports extent;
    static final String configFilePath = System.getProperty("user.dir") + "src/main/resources/config.xml";
    //static final String configFilePath = "E:\\D\\Project\\GreenHouses\\src\\main\\resources\\config.xml";


    public ExtentManager() {
    }

    public static synchronized ExtentReports getReporter() {
        if (extent == null) {
            extent = new ExtentReports("Reports/TestReports.html", true);
            extent.addSystemInfo("Nop-Commerce", "QA Environment");
            extent.addSystemInfo("Author", "Pravin");
            try{
                extent.loadConfig(new File(configFilePath));
            }catch (Exception e){
                System.out.println("File Not Found");
            }
            System.out.println(configFilePath);
        }
        return extent;
    }
}

