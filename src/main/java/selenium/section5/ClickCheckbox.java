package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class ClickCheckbox {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://automationtesting.co.uk/dropdown.html");
        System.out.println();
        actions.clickOnCheckbox("[for='cb_red']");
        actions.clickOnCheckbox("[for='cb_green']");
        actions.clickOnCheckbox("[for='cb_red']");
        actions.clickOnCheckbox("[for='cb_red']");

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
