package selenium.section8;

import org.openqa.selenium.By;
import selenium.baseTest.ThreadSleep;

public class IFrame {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        ThreadSleep threadSleep = new ThreadSleep();
        driver.get("https://automationtesting.co.uk/iframes.html");

        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".toggle")).click();
        driver.switchTo().parentFrame();
        threadSleep.sleep(1000);
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("div#movie_player > .ytp-cued-thumbnail-overlay > button")).click();
        threadSleep.sleep(3000);
        driver.close();
    }

}
