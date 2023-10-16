package selenium.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.baseTest.ThreadSleep;
import selenium.section5.ActionsWithElements;

import java.util.List;

public class TestOneWithRyanair {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://www.ryanair.com/gb/en");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);
        actionsWithElements.clickOnButton(".cookie-popup-with-overlay__button");
        WebElement fromInput = driver.findElement(By.cssSelector("#input-button__departure"));
        fromInput.click();
        fromInput.clear();
        fromInput.sendKeys("London");
        threadSleep.sleep(1000);

        List<WebElement> origins = new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("fsw-airport-item > span > span")));

        for (WebElement origin: origins) {
            System.out.println(origin.getText());
        }

        for (WebElement origin: origins) {
            if (origin.getText().contains("Luton")) {
                actions.moveToElement(origin).perform();
                actions.click(origin).perform();
                break;
            }
        }
        driver.close();
    }

}
