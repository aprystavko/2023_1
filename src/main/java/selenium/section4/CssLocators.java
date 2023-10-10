package selenium.section4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

import javax.mail.MessagingException;

public class CssLocators {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        driver.get("https://automationtesting.co.uk/buttons.html");

        WebElement element = driver.findElement(By.cssSelector("#btn_two"));
        element.click();

        threadSleep.sleep(2000);

        try {
            SendEmail sendMail = new SendEmail("**.**.****@gmail.com", "Auto message from java", "Learn what is CSS locators: " + element);
            sendMail.sendEmail();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        WebDriver.closeWebDriver();
    }

}
