package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;
import org.openqa.selenium.Keys;

public class Dropdown {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements webElementActionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/dropdown.html");
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();

        webElementActionsWithElements.selectMenuItem("select#cars", "Volkswagen");
        threadSleep.sleep(1000);
        webElementActionsWithElements.selectMenuItem("select#cars", "Suzuki");
        threadSleep.sleep(1000);
        webElementActionsWithElements.selectMenuItem("select#cars", "Honda");

        webElementActionsWithElements.indianMethod("select#cars", "Volkswagen");

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
