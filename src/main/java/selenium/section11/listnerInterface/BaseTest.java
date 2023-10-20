package selenium.section11.listnerInterface;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.baseTest.WebDriver;
import selenium.section5.ActionsWithElements;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest implements ITestListener {
    private static final String BROWSER_NAME = "chrome";
    private static final String URL = "http://teststore.automationtesting.co.uk/login?back=my-account";
    org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver(BROWSER_NAME);
    ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test has passed from ITestListener interface!");
    }

    public void onTestFailure(ITestResult result) {
        takeSnapShot(driver);
    }

    @BeforeSuite
    public void setup() {
        driver.get(URL);
    }

    public static void takeSnapShot(org.openqa.selenium.WebDriver driver){
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
