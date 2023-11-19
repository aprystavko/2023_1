package selenium2.tests.checkboxespagetests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium2.base.TestUtilities;
import selenium2.pages.CheckboxesPage;
import selenium2.pages.WelcomePageObject;

import static selenium2.base.TextValues.*;

public class CheckboxesTests extends TestUtilities {

    @Test
    public void selectingTwoCheckboxesTest() {
        log.info(START_selectingTwoCheckboxesTest);

        WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
        welcomePage.openPage();

        CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();

        checkboxesPage.selectAllCheckboxes();

        Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(), ASSERT_selectingTwoCheckboxesTest);
    }

}
