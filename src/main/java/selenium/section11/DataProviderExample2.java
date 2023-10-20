package selenium.section11;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 extends BaseTest {

    @DataProvider(name = "testData")
    public static Object[][] testData(){
        return new Object[][]{
                {"test", "test123"},
                {"test1", "test123"},
                {"test2", "test123"}
        };
    }

    @Test(dataProvider = "testData")
    public void login(String username, String password){
        driver.get("https://automationtesting.co.uk/loginPortal.html?");
        driver.findElement(By.cssSelector("input#login_text")).sendKeys(username);
        driver.findElement(By.cssSelector("input#login_password")).sendKeys(password);
        driver.findElement(By.cssSelector("[onclick]")).click();
        driver.switchTo().alert().accept();
    }
}
