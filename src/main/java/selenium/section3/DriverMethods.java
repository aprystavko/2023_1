package selenium.section3;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DriverMethods {

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("http://google.com");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("Hello cruel world");
        searchInput.sendKeys(Keys.ENTER);

        String currentUrl = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        System.out.println("Title: " + currentTitle + "; " + "URL: " + currentUrl);
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        System.out.println(driver.manage().window().getSize());

        threadSleep.sleep(1000);
        driver.get("https://blog.testproject.io/");
        System.out.println(driver.getTitle());

        threadSleep.sleep(2000);

        driver.close();
        WebDriver.closeWebDriver();
    }
}

