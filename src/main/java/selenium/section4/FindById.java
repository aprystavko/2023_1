package selenium.section4;

import org.openqa.selenium.By;
import selenium.baseTest.WebDriver;

public class ClickById {

    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("https://automationtesting.co.uk/buttons.html");
        driver.findElement(By.id("btn_one")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebDriver.closeWebDriver();
    }


}
