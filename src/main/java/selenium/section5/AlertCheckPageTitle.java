package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class AlertCheckPageTitle {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://automationtesting.co.uk/popups.html");
        actions.clickOnButton("[onclick='alertTrigger\\(\\)']");
        driver.switchTo().alert().accept();
        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
