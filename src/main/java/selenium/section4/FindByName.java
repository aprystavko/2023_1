package selenium.section4;

import org.openqa.selenium.By;
import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

public class FindByName {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("https://automationtesting.co.uk/contactForm.html");
        driver.findElement(By.name("first_name")).sendKeys("Alex");
        driver.findElement(By.name("last_name")).sendKeys("Rayden");
        driver.findElement(By.name("email")).sendKeys("ar@gmail.com");
        driver.findElement(By.name("message")).sendKeys("TBD");
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();

        threadSleep.sleep(2000);
        WebDriver.closeWebDriver();
    }

}
