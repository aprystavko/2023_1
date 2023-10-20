package selenium.section11;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.baseTest.WebDriver;
import selenium.section5.ActionsWithElements;

public class BaseTest {
    private static final String BROWSER_NAME = "chrome";
//    private static final String URL = "https://automationtesting.co.uk/index.html";
    private static final String URL = "https://trello.com";
    org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver(BROWSER_NAME);
    ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

    @BeforeSuite
    public void setup() {
        driver.get(URL);
    }

    @AfterSuite
    public void end() {
        WebDriver.closeWebDriver();
    }

}
