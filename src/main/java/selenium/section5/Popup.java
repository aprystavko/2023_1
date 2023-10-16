package selenium.section5;

import selenium.baseTest.ThreadSleep;
import selenium.baseTest.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class Popup {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        org.openqa.selenium.WebDriver driver = WebDriver.getWebDriver("chrome");
        ActionsWithElements actionsWithElements = new ActionsWithElements(driver);

        driver.get("https://automationtesting.co.uk/popups.html");
        actionsWithElements.click("[onclick='popup\\(\\)']");
//        threadSleep.sleep(2000);

        String mainHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterate = handles.iterator();

        while (iterate.hasNext()) {
            String childHandle = iterate.next();
            if (!mainHandle.equalsIgnoreCase(childHandle)){
                driver.switchTo().window(childHandle).close();
            }
//            threadSleep.sleep(2000);
            driver.switchTo().window(mainHandle);
        }

        actionsWithElements.clickOnButton("[onclick='alertTrigger\\(\\)']");
        driver.switchTo().alert().accept();
//        threadSleep.sleep(2000);

        WebDriver.closeWebDriver();
    }
}
