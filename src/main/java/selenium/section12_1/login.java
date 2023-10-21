package selenium.section12_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;

    @BeforeSuite
    public void setup() throws InterruptedException, IOException {

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                "./src/main/java/selenium/section12_1/config.properties");
        prop.load(data);

        if (prop.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        driver.get(prop.getProperty("url"));
    }

    @Test
    public void signIn() throws InterruptedException {
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        Thread.sleep(2000);
        driver.quit();
    }
}
