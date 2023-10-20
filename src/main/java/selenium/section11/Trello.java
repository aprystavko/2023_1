package selenium.section11;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Trello extends BaseTest {

    @Test
    public void printValue(){
        driver.findElement(By.cssSelector("[class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("******@gmail.com");
        driver.findElement(By.cssSelector("button#login-submit > .css-178ag6o")).click();
        Assert.fail();
    }

}
