package selenium.section8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.baseTest.ThreadSleep;

import java.util.Random;

public class JavaScriptClick {
    private static final String[] firstNames = {"John", "Emma", "Michael", "Sophia", "William", "Olivia", "James", "Ava"};
    private static final String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson"};

    public static String generateRandomFirstName() {
        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        return firstName;
    }

    public static String generateRandomLastName() {
        Random random = new Random();
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return lastName;
    }

    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String email = "";
        Random random = new Random();
        int emailLength = 10;
        for (int i = 0; i < emailLength; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            email += allowedChars.charAt(randomIndex);
        }
        email += "@googla.net";
        return email;
    }

    public static void fillForm(WebDriver driver) {
        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys(generateRandomFirstName());
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys(generateRandomLastName());
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(generateRandomEmail());
        driver.findElement(By.cssSelector("textarea")).clear();
        driver.findElement(By.cssSelector("textarea")).sendKeys(generateRandomLastName() + " "
                + generateRandomFirstName() + " " + generateRandomEmail());

    }

    public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
        ThreadSleep threadSleep = new ThreadSleep();

        driver.get("https://automationtesting.co.uk/contactForm.html");
        fillForm(driver);
        threadSleep.sleep(3000);

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        WebElement resetButton = driver.findElement(By.cssSelector("[type='reset']"));

        submitButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Form is filled!')");
        threadSleep.sleep(3000);
        driver.switchTo().alert().accept();
        driver.navigate().back();

        fillForm(driver);
        js.executeScript("alert('Fields are reset!')");
        threadSleep.sleep(3000);
        driver.switchTo().alert().accept();
        resetButton.click();
        threadSleep.sleep(3000);

        js.executeScript("alert('JS click is working!')");
        driver.switchTo().alert().accept();
        js.executeScript("arguments[0].click(), arguments[1].click()", resetButton, submitButton);
        threadSleep.sleep(3000);
        driver.quit();
    }

}
