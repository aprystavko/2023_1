package selenium.section4;

import org.openqa.selenium.By;
import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class FindById {

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("https://automationtesting.co.uk/buttons.html");
        driver.findElement(By.id("btn_one")).click();

        threadSleep.sleep(1000);

        WebDriver.closeWebDriver();
    }

}
