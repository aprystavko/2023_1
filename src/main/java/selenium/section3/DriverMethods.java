package selenium.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import selenium.baseTest.WebDriver;

public class DriverMethods {

    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("http://google.com");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("Hello");
        searchInput.sendKeys(Keys.ENTER);

        String currentUrl = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        System.out.println("Title: " + currentTitle + "; " + "URL: " + currentUrl);
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
//        System.out.println(driver.getPageSource());

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Simulate pressing "Ctrl" (or "Command" on Mac) + "t" to open a new tab
        actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();

        // Switch to the new tab (by switching to the last window handle)
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Navigate to a different website in the new tab
        driver.get("https://www.example.com");



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebDriver.closeWebDriver();
    }
}

