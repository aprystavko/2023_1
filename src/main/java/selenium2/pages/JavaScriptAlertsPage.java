package selenium2.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePageObject {

    private By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    /**
     * Open JS Alert
     */
    public void openJSAlert() {
        log.info("Clicking on 'Click for JS Alert' button to open alert");
        click(jsAlertButton);
    }

    /**
     * Open JS confirm alert
     */
    public void openJSConfirm() {
        log.info("Clicking on 'Click for JS Confirm' button to open alert");
        click(jsConfirmButton);
    }

    /**
     * Open JS prompt alert
     */
    public void openJSPrompt() {
        log.info("Clicking on 'lick for JS Prompt' button to open alert");
        click(jsPromptButton);
    }

    /**
     * Switch to alert and press OK
     */
    public void acceptAlert() {
        log.info("Switching to alert and pressing OK");
        Alert alert = switchToAlert();
        alert.accept();
    }

    /**
     * Switch to alert and press Cancel
     */
    public void dismissAlert() {
        log.info("Switching to alert and pressing OK");
        Alert alert = switchToAlert();
        alert.dismiss();
    }

    public String getResultText() {
        String result = find(resultText).getText();
        log.info("Result text: " + result);
        return result;
    }

    /**
     * Type text into alert and press OK
     */
    public void typeTextIntoAlert(String text) {
        Alert alert = switchToAlert();
        alert.sendKeys(text);
        alert.accept();
    }

    /**
     * Switch to alert and get message
     */
    public String getAlertText() {
        Alert alert = switchToAlert();
        String alertText = alert.getText();
        log.info("Alert says: " + alertText);
        return alertText;
    }

}
