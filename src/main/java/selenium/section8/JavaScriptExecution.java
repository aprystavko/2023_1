package selenium.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import selenium.baseTest.ThreadSleep;

public class JavaScriptExecution {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        ThreadSleep threadSleep = new ThreadSleep();

        driver.get("https://automationtesting.co.uk/buttons.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById(\"btn_one\").style.border = \"thick solid #0000FF\";");

        driver.get("https://automationtesting.co.uk");
        driver.findElement(By.cssSelector(".close-cookie-warning")).click();
        js.executeScript("window.scrollBy(0,800)");
        threadSleep.sleep(2000);

        driver.close();
    }

}
