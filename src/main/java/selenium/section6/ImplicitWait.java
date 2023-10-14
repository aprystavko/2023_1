package selenium.section6;

import selenium.baseTest.WebDriver;
import selenium.section5.Actions;

public class ImplicitWait {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://automationtesting.co.uk/loader.html");
        System.out.println(actions.buttonStatus("[onclick]"));
        actions.clickOnButton("[onclick]");

        WebDriver.closeWebDriver();
    }

}
