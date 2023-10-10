package selenium.section4;

import org.openqa.selenium.By;
import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class Locators {

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("http://teststore.automationtesting.co.uk/");
        driver.findElement(By.linkText("ACCESSORIES")).click();

        threadSleep.sleep(1000);
        WebDriver.closeWebDriver();
    }


}
