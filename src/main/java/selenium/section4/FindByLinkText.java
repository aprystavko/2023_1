package selenium.section4;

import org.openqa.selenium.By;
import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class FindByLinkText {

    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("https://automationtesting.co.uk");
        driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();

        threadSleep.sleep(2000);

        driver.findElement(By.linkText("Actions".toUpperCase())).click();

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }


}
