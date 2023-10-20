package selenium.section11.listnerInterface;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)

public class Listener extends BaseTest {

    @Test
    public void enterEmail() throws InterruptedException {
        Assert.fail();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
        Thread.sleep(3000);
    }

    @Test
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
        Thread.sleep(3000);
    }

}
