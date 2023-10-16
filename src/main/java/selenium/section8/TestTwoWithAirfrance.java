package selenium.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.baseTest.ThreadSleep;
import selenium.section5.ActionsWithElements;

import java.util.List;

public class TestTwoWithAirfrance {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://www.kayak.com/flight-routes/United-States-US0/United-States-US0");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        WebElement departingFrom = driver.findElement(By.cssSelector(".zEiP-origin .k_my-input"));
        departingFrom.click();
        departingFrom.clear();
        for (int i = 0; i < 20; i++) {
            departingFrom.sendKeys(Keys.BACK_SPACE);
        }
        departingFrom.sendKeys("Lo");

        List<WebElement> origins = driver.findElements(By.cssSelector(".yWDF-mod-spacing-base > ul > li"));
        for (WebElement origin: origins) {
            System.out.println(origin.getText());
        }

        for (WebElement origin: origins) {
            if (origin.getText().contains("Gatwick")) {
                actions.moveToElement(origin).perform();
                actions.click(origin).perform();
                break;
            }
        }
        driver.close();
    }

}
