package selenium2.tests.dropdowntests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium2.base.TestUtilities;
import selenium2.pages.DropdownPage;
import selenium2.pages.WelcomePageObject;

public class DropdownTest extends TestUtilities {
	
	@Test
	public void optionTwoTest() {
		log.info("Starting optionTwoTest");

		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();

		// Click on Dropdown link
		DropdownPage dropdownPage = welcomePage.clickDropdownLink();

		// Select Option 2
		dropdownPage.selectOption(2);

		// Verify Option 2 is selected
		String selectedOption = dropdownPage.getSelectedOption();
		Assert.assertTrue(selectedOption.equals("Option 2"),
				"Option 2 is not selected. Instead selected - " + selectedOption);
	}

}
