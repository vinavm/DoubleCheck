package BasePackage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class CommonMethods {

    public By userMenu_Btn = By.xpath("//li[@class='dropdown user user-menu']");
    public By signOut_Btn = By.xpath("//a[contains(text(),'Sign Out')]");
    private WebDriver driver;
    private JavascriptExecutor jse;

    public CommonMethods() {

    }

    public CommonMethods(WebDriver driver) {
        this.driver=driver;

    }
    public boolean clickOnLinkOrButton(By by) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.elementToBeClickable(by));
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }



    public boolean enterTextInInputField(By by, String data) {
        try {
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                generic_WebL.clear();
                generic_WebL.sendKeys(data);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw e;

        }
    }

    public boolean uploadFile(By by, String path){
        try {
            System.out.println(path);
            driver.findElement(by).sendKeys(path);
            Thread.sleep(2000);
            return true;
        }catch (Exception e){
            return false;
        }
    }



    public void writePropertiesFile(String propKey, String Value, String propFilePath) throws IOException {
        try {
            File file = new File(propFilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream in = new FileInputStream(propFilePath);
            Properties props = new Properties();
            props.load(in);
            in.close();
            FileOutputStream out = new FileOutputStream(propFilePath);
            props.setProperty(propKey, Value);
            props.store(out, null);
            out.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean uploadFile(String filePath) throws AWTException {

        Robot robot;
        try {
            StringSelection stringSelection = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            robot = new Robot();
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(500);
            robot.keyRelease(KeyEvent.VK_ENTER);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean browserFile(By by, String filePath){
        try{
            driver.findElement(by).sendKeys(filePath);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean verifyElementIsVisible(By by) {
        try {
            Thread.sleep(5000);
            WebElement generic_WebL = driver.findElement(by);
             generic_WebL.isDisplayed();
             return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean verifyElementIsEnable(By by){

        try {
            Thread.sleep(5000);
            WebElement generic_WebL = driver.findElement(by);
            generic_WebL.isEnabled();
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clearTextBox(By by) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            clickByJS(by);
            //generic_WebL.click();
            generic_WebL.clear();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clearTextBoxUsingBackSpaceKey(By by) {
        try {
            Thread.sleep(2000);
            driver.findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a"));
            driver.findElement(by).sendKeys(Keys.BACK_SPACE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean clickByJS(By by) {
        try {
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            return true;
        } catch (Exception e) {
            return false;
        }
    }




    public boolean selectValueFromDropDown(By dropDownIcon_xPath, By dropDownValues_xPath, String value) {
        try {
            WebElement dropDownIconWebL = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(dropDownIcon_xPath));
            dropDownIconWebL.click();

            Thread.sleep(2000);
            WebElement dropDownValuesWebL = driver.findElement(dropDownValues_xPath);
            List<WebElement> dropDownValues = dropDownValuesWebL.findElements(By.tagName("div"));
            for (WebElement element : dropDownValues) {
                String text = element.getText().trim();
                if (text.contains(value)) {
                    //System.out.println(text);
                    new Actions(driver).moveToElement(element).click().build().perform();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean switchToChildWindow(){
        try {
            Thread.sleep(5000);
            Set<String> windowList=driver.getWindowHandles();
            Iterator<String> iterator = windowList.iterator();
            String parentWindow = iterator.next();
            String childWindow = iterator.next();
            driver.switchTo().window(childWindow);
            Thread.sleep(2000);

            //driver.switchTo().window(parentWindow);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    public boolean openUrl(String url){
        try{
            Thread.sleep(500);
            driver.get(url);
            Thread.sleep(1000);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public boolean selectFromComboBox(By drpDownClick, By drpValue) throws Exception {
        try {
            Thread.sleep(2500);
            WebElement webElement = (new WebDriverWait(driver, 80))
                    .until(ExpectedConditions.visibilityOfElementLocated(drpDownClick));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            Thread.sleep(2500);

            WebElement value1 = new WebDriverWait(driver,80).
                    until(ExpectedConditions.visibilityOfElementLocated(drpValue));
            value1.click();

            return true;
        }catch (Exception e ){
            throw e;
        }
    }

    public boolean selectFromMultiDropDown(By drpDownClick, By drpValue) throws Exception {
        try {
            clickOnLinkOrButton(drpDownClick);
            clickOnLinkOrButton(drpValue);
            Actions act1 = new Actions(driver);
            act1.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

            return true;
        }catch (Exception e ){
            return false;
        }
    }

    public boolean selectValFromDropDown(By drpdown, String value){
        try{
            Select dropdown=new Select(driver.findElement(drpdown));
            dropdown.selectByVisibleText(value);
            return true;
        }catch (Exception e){
            return false;

        }

    }


    public boolean selectFromComboBox(By txtXpath, String value, By click) throws Exception {
        try {
            WebElement comboVal = new WebDriverWait(driver,20).
                    until(ExpectedConditions.visibilityOfElementLocated(txtXpath));
            comboVal.sendKeys(value);
            WebElement value1 = new WebDriverWait(driver,20).
                    until(ExpectedConditions.visibilityOfElementLocated(click));
            value1.click();


            return true;
        }catch (Exception e ){
            return false;
        }
    }

    public boolean clickByJSWithValue(By by, String value) {
        try {
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            webElement.sendKeys(value);

            return true;
        } catch (Exception e) {
            //return false;
            throw e;
        }
    }

    public boolean clickByJSWithValue(By by, By xpath, String value) {
        try {
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);

            WebElement textBox = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(xpath));
            textBox.sendKeys(value);

            return true;
        } catch (Exception e) {
            //return false;
            throw e;
        }
    }

    public boolean refreshPage(){
        try {
            Robot r= new Robot();
            r.keyPress(KeyEvent.VK_F5);
            r.keyRelease(KeyEvent.VK_F5);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean switchToDocuSignWindow(){
        try {
            Set handles = driver.getWindowHandles();
            String[] individualHandle = new String[handles.size()];
            Iterator it = handles.iterator();
            int i =0;
            while(it.hasNext())
            {
                individualHandle[i] = (String) it.next();
                i++;
            }

            driver.switchTo().window(individualHandle[2]);
            return true;
        }catch (Exception e){
            return false;
        }
    }




    public boolean switchTodefaultContent(){
        try{
            driver.switchTo().defaultContent();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean switchWIndowAndClick(By element){
        try {
            switchToDocuSignWindow();
            clickOnLinkOrButton(element);
            Thread.sleep(3000);
            //driver.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }



    public boolean switchToframeEnterText(By frameId, By element, String value){
        try{
            switchToframe(frameId);
            Thread.sleep(2500);
            enterTextInInputField(element, value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean switchToframeClick(By frameId, By element){
        try{
            switchToframe(frameId);
            Thread.sleep(2500);
            clickOnLinkOrButton(element);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public String getText(By by){
        return driver.findElement(by).getText();
    }

    public void scrollPageByJs(){
        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0, 250)");
    }
    public void scrollPageByJs(int x, int y){
        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
    }

    public void switchToframe(By by){
        driver.switchTo().frame(driver.findElement(by));
    }



    public void closeWindow() throws InterruptedException {
        Thread.sleep(2500);
        driver.close();
    }

    public boolean openNewTab(String url){
        try{
            jse = (JavascriptExecutor)driver;
            jse.executeScript("window.open('"+url+"' ,'_blank');");
            return true;
        }catch (Exception e){
            return false;
        }

    }
    public boolean selectMultiComboBox(By drpDownClick, By drpValue) throws Exception {
        try {
            Thread.sleep(1500);

            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(drpDownClick));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            Thread.sleep(1000);
            WebElement value1 = new WebDriverWait(driver,20).
                    until(ExpectedConditions.visibilityOfElementLocated(drpValue));
            value1.click();

            Actions act = new Actions(driver);
            act.sendKeys(Keys.TAB).build().perform();

            return true;
        }catch (Exception e ){
            throw e;
        }
    }

    public boolean signOut(By click1, By click2){
        try {
            Thread.sleep(1000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.elementToBeClickable(click1));
            generic_WebL.click();
            Thread.sleep(1000);
            WebElement generic_WebL1 = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.elementToBeClickable(click2));
            generic_WebL1.click();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

