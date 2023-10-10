package selenium.section5;

import org.junit.Assert;
import selenium.baseTest.WebDriver;

public class Assertions {
    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");

        driver.get("https://automationtesting.co.uk/index.html");

        String expectedPageTitle = "Homepage";
        String actualPageTitle = driver.getTitle();

        Assert.assertEquals(expectedPageTitle, actualPageTitle);
        WebDriver.closeWebDriver();
    }

}
