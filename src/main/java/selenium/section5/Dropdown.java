package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;
import org.openqa.selenium.Keys;

public class Dropdown {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        Actions webElementActions = new Actions(driver);

        driver.get("https://automationtesting.co.uk/dropdown.html");
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();

        webElementActions.selectMenuItem("select#cars", "Volkswagen");
        threadSleep.sleep(1000);
        webElementActions.selectMenuItem("select#cars", "Suzuki");
        threadSleep.sleep(1000);
        webElementActions.selectMenuItem("select#cars", "Honda");

        webElementActions.indianMethod("select#cars", "Volkswagen");

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
