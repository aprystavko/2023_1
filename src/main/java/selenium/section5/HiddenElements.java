package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class HiddenElements {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/hiddenElements.html");
        boolean paragraph1 = actionsWithElements.isElementVisibleByCssLocator("div#main  p");
        boolean paragraph2 = actionsWithElements.isElementVisibleByCssLocator("#main [class] p:nth-child(3)");
        System.out.println(paragraph1);
        System.out.println(paragraph2);
        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }
}
