package selenium.section6;

import selenium.baseTest.WebDriver;
import selenium.section5.ActionsWithElements;

public class ImplicitWait {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/loader.html");
        System.out.println(actionsWithElements.buttonStatus("[onclick]"));
        actionsWithElements.clickOnButton("[onclick]");

        WebDriver.closeWebDriver();
    }

}
