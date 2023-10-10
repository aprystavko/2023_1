package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class Buttons {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        Actions actions = new Actions(driver);

        driver.get("https://automationtesting.co.uk/buttons.html");
        System.out.println(actions.buttonStatus("button#btn_four"));
        System.out.println(actions.buttonStatus("button#btn_three"));
        actions.clickOnButton("button#btn_four");
        actions.clickOnButton("button#btn_three");

        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }

}
