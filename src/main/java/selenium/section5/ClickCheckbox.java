package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class ClickCheckbox {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/dropdown.html");
        System.out.println();
        actionsWithElements.clickOnCheckbox("[for='cb_red']");
        actionsWithElements.clickOnCheckbox("[for='cb_green']");
        actionsWithElements.clickOnCheckbox("[for='cb_red']");
        actionsWithElements.clickOnCheckbox("[for='cb_red']");

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
