package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckAmountInCart {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://automationtesting.co.uk/index.html");
        actions.click(".close-cookie-warning span");
        threadSleep.sleep(2000);
        actions.click(".toggle");
        driver.findElement(By.linkText("TEST STORE")).click();
        threadSleep.sleep(2000);
        actions.click("[alt='Hummingbird printed t-shirt']");
        threadSleep.sleep(2000);
        driver.findElement(By.cssSelector("#quantity_wanted")).clear();
        driver.findElement(By.cssSelector("#quantity_wanted")).sendKeys("5");
        actions.click("#quantity_wanted");
        threadSleep.sleep(2000);
        actions.clickOnButton(".add-to-cart.btn.btn-primary");
        threadSleep.sleep(2000);

        String currentAmount = driver.findElement(By.cssSelector(".product-total > .value")).getText();
        Assert.assertEquals(currentAmount, "$102.60");

        WebDriver.closeWebDriver();
    }

}
