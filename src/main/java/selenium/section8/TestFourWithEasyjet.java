package selenium.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.baseTest.ThreadSleep;

import java.util.List;

public class TestFourWithEasyjet {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        ThreadSleep threadSleep = new ThreadSleep();
        driver.get("https://www.easyjet.com/en");

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.ESCAPE).keyUp(Keys.CONTROL).perform();

        driver.findElement(By.id("ensCloseBanner")).click();
        action.keyDown(Keys.CONTROL).sendKeys(Keys.ESCAPE).keyUp(Keys.CONTROL).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.stop();");

        driver.findElement(By.cssSelector("input[name='origin']")).click();
        for (int i = 0; i < 20; i++) {
            driver.findElement(By.cssSelector("input[name='origin']")).sendKeys(Keys.BACK_SPACE);
        }

        driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");

        List<WebElement> origins = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li > a > span")));

        for (WebElement origin : origins) {
            if (origin.getText().contains("Luton")) {
                origin.click();
                System.out.println("Click on element: " + origin);
            }
        }

        driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("a");

        List<WebElement> destinations = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 li > a > span")));

        for (WebElement destination : destinations) {
            if (destination.getText().contains("Antalya")) {
                destination.click();
                System.out.println("Click on element: " + destination);
            }
        }

        driver.close();
    }

}