package selenium.section12.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenium.section12.baseTest.BaseTest;

@Listeners(AddToCart.class)

public class AddToCart extends BaseTest {

    @Test
    public void login() {
        actions.clickOnElement("[title] .hidden-sm-down");
        actions.addValueToInput("section input[name='email']", "aprystavko@test.com");
        actions.addValueToInput("[name='password']", "test123");
        actions.clickOnButton("button#submit-login");
    }

    @Test(dependsOnMethods = { "login" })
    public void addProductToCart(){
        actions.clickOnElement("img[alt='teststore']");
        actions.clickOnElement("img[alt='Hummingbird printed t-shirt']");
        actions.clickOnButton("[data-button-action]");
        actions.clickOnButton(".cart-content-btn [data-dismiss]");
    }

    @Test(dependsOnMethods = { "addProductToCart"})
    public void logout(){
        actions.clickOnElement(".hidden-sm-down.logout");
    }
}
