package selenium2.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

    private final By usernameLocator = By.id("username");
    private final By passwordLocator = By.name("password");
    private final By logInButtonLocator = By.tagName("button");
    private final By errorMessageLocator = By.id("flash");

    public LoginPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public SecureAreaPage logIn(String username, String password) {
        log.info("Executing LogIn with username [" + username + "] and password [" + password + "]");
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
        return new SecureAreaPage(driver, log);
    }

    public void negativeLogIn(String username, String password) {
        log.info("Executing Negative LogIn with username [" + username + "] and password [" + password + "]");
        type(username, usernameLocator);
        type(password, passwordLocator);
        click(logInButtonLocator);
    }

    public void waitForErrorMessage() {
        waitForVisibilityOf(errorMessageLocator, 5);
    }

    public String getErrorMessageText() {
        return find(errorMessageLocator).getText();
    }

}
