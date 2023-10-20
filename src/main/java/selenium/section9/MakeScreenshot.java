package selenium.section9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MakeScreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationtesting.co.uk/");
        driver.manage().window().maximize();
        takeSnapShot(driver);
    }

    public static void takeSnapShot(WebDriver webdriver) throws IOException {
        File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./logs/screenshots/" + timestamp() + ".png");
        FileUtils.copyFile(srcFile, destFile);
    webdriver.quit();
    }

    public static String timestamp() {
        return new SimpleDateFormat("dd-MM--yyyy HH-mm-ss").format(new Date());
    }


}

