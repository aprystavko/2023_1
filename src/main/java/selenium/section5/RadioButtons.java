package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class RadioButtons {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/dropdown.html");
        actionsWithElements.clickOnRadioButton("[for='demo-priority-low']");
        threadSleep.sleep(2000);
        actionsWithElements.clickOnRadioButton("[for='demo-priority-normal']");
        threadSleep.sleep(2000);
        actionsWithElements.clickOnRadioButton("[for='demo-priority-high']");
        threadSleep.sleep(2000);
        WebDriver.closeWebDriver();
    }

}
