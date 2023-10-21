package selenium.section12_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class login extends BasePage{

    @Test
    public void signIn() throws InterruptedException, IOException {
        driver = getDriver();
        driver.get(getUrl());
        driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
        driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
        driver.findElement(By.cssSelector("button#submit-login")).click();
        System.out.println("user has logged in");
        Thread.sleep(2000);
        driver.quit();
    }
}
