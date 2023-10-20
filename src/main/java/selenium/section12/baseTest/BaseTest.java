package selenium.section12.baseTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.baseTest.WebDriver;
import selenium.section12.utils.ActionsWithElements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BaseTest implements ITestListener {
    public static final String BROWSER = "chrome";
    Properties prop = new Properties();
    FileInputStream data;

    {
        try {
            data = new FileInputStream("./src/main/java/selenium/section12/resources/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver(BROWSER);
    public ActionsWithElements actions = new ActionsWithElements(driver);
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test has passed from ITestListener interface!");
    }

    public void onTestFailure(ITestResult result) {
        takeSnapShot(driver);
    }

    @BeforeSuite
    public void setup() {
        try {
            prop.load(data);
            driver.get(prop.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeSnapShot(org.openqa.selenium.WebDriver driver) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./logs/screenshots/" + timestamp() + ".png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String timestamp() {
        return new SimpleDateFormat("dd-MM--yyyy HH-mm-ss").format(new Date());
    }

    @AfterSuite
    public void end() {
        WebDriver.closeWebDriver();
    }

}

