package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class Buttons {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/buttons.html");
        System.out.println(actionsWithElements.buttonStatus("button#btn_four"));
        System.out.println(actionsWithElements.buttonStatus("button#btn_three"));
        actionsWithElements.clickOnButton("button#btn_four");
        actionsWithElements.clickOnButton("button#btn_three");

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
