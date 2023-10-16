package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class AlertCheckPageTitle {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/popups.html");
        actionsWithElements.clickOnButton("[onclick='alertTrigger\\(\\)']");
        driver.switchTo().alert().accept();
        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
