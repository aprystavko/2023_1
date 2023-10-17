package selenium.section8;

import org.openqa.selenium.By;
import selenium.baseTest.ThreadSleep;

import java.util.ArrayList;

public class BrowserTabs {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        ThreadSleep threadSleep = new ThreadSleep();
        driver.get("https://automationtesting.co.uk");
        driver.findElement(By.cssSelector(".toggle")).click();
        driver.findElement(By.cssSelector("[href='browserTabs\\.html']")).click();


        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector("[type]")).click();
        }
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println("There are "+tabs.size() + " tabs open");
        for (String handle : tabs) {
            driver.switchTo().window(handle);
            threadSleep.sleep(1500);
            System.out.println(handle);
        }
        driver.switchTo().window(tabs.get(0));
        driver.quit();
    }

}




