package selenium2.tests.loginpagetests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium2.base.TestUtilities;
import selenium2.pages.LoginPage;
import selenium2.pages.WelcomePageObject;

public class NegativeLogInTests extends TestUtilities {

	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 1)
	public void negativeTest(String username, String password, String expectedErrorMessage) {
		log.info("Starting negativeTest");

		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();

		LoginPage loginPage = welcomePage.clickFormAuthenticationLink();

		loginPage.negativeLogIn(username, password);

		loginPage.waitForErrorMessage();
		String message = loginPage.getErrorMessageText();

		// Verification
		Assert.assertTrue(message.contains(expectedErrorMessage), "Message doesn't contain expected text.");
	}
}
