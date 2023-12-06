package selenium2.tests.alerttests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium2.base.TestUtilities;
import selenium2.pages.JavaScriptAlertsPage;
import selenium2.pages.WelcomePageObject;


public class AlertsTests extends TestUtilities {

    @Test
    public void jsAlertTest() {
        log.info("Starting jsAlertTest test");
        WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
        welcomePage.openPage();
        JavaScriptAlertsPage alertPage = welcomePage.clickAlertLink();
        alertPage.openJSAlert();
        Assert.assertTrue(alertPage.getAlertText().equals("I am a JS Alert"),
                "Alert message is not expected. \nShould be 'I am a JS Alert', but it is '" + alertPage.getAlertText() + "'");
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResultText(), "You successfully clicked an alert");
    }

    @Test
    public void jsConfirmTest() {
        log.info("Starting jsConfirmTest test");
        WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
        welcomePage.openPage();
        JavaScriptAlertsPage alertPage = welcomePage.clickAlertLink();
        alertPage.openJSConfirm();
        Assert.assertTrue(alertPage.getAlertText().equals("I am a JS Confirm"),
                "Alert message is not expected. \nShould be 'I am a JS Confirm', but it is '" + alertPage.getAlertText() + "'");
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResultText(), "You clicked: Ok");
    }

    @Test
    public void jsDismissTest() {
        log.info("Starting jsDismissTest test");
        WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
        welcomePage.openPage();
        JavaScriptAlertsPage alertPage = welcomePage.clickAlertLink();
        alertPage.openJSConfirm();
        Assert.assertTrue(alertPage.getAlertText().equals("I am a JS Confirm"),
                "Alert message is not expected. \nShould be 'I am a JS Confirm', but it is '" + alertPage.getAlertText() + "'");
        alertPage.dismissAlert();
        Assert.assertEquals(alertPage.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void jsPromptTest(){
        log.info("Starting jsPromptTest test");
        WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
        welcomePage.openPage();
        JavaScriptAlertsPage alertPage = welcomePage.clickAlertLink();
        alertPage.openJSPrompt();
        Assert.assertTrue(alertPage.getAlertText().equals("I am a JS prompt"),
                "Alert message is not expected. \nShould be 'I am a JS prompt', but it is '" + alertPage.getAlertText() + "'");
        alertPage.typeTextIntoAlert("Hello alert, Alex here");
        Assert.assertEquals(alertPage.getResultText(), "You entered: Hello alert, Alex here");
    }

}
