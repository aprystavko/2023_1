package selenium.baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BaseSeleniumTest {

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("http://teststore.automationtesting.co.uk/");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/input[2]"));
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("Hello");
        searchInput.sendKeys(Keys.ENTER);

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }
}

