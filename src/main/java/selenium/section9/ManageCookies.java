package selenium.section9;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;
import selenium.section5.ActionsWithElements;

import java.util.Iterator;
import java.util.Set;

public class ManageCookies {

    public static org.openqa.selenium.WebDriver driver = selenium.baseTest.WebDriver.getWebDriver("chrome");
    ActionsWithElements actionsWithElements = new ActionsWithElements(driver);
    static ThreadSleep threadSleep = new ThreadSleep();

    public static void openTestStore() {
        driver.get("https://automationtesting.co.uk/index.html");
        driver.findElement(By.cssSelector(".close-cookie-warning")).click();
        driver.findElement(By.cssSelector(".toggle")).click();
        driver.findElement(By.linkText("TEST STORE")).click();
    }

    public static void addProductToCard() {
        driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
        driver.findElement(By.cssSelector("[data-button-action]")).click();
        threadSleep.sleep(3000);
        driver.findElement(By.cssSelector(".cart-content-btn [data-dismiss]")).click();
    }

    public static void main(String[] args) {
        openTestStore();
        addProductToCard();
        Set<Cookie> siteCookies = driver.manage().getCookies();
        Iterator itr = siteCookies.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        threadSleep.sleep(3000);

        driver.manage().deleteAllCookies();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        driver.navigate().refresh();
        threadSleep.sleep(3000);
        System.out.println("No cookies");
        WebDriver.closeWebDriver();
    }
}


