package selenium.section5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ActionsWithElements {
    private final org.openqa.selenium.WebDriver driver;

    public ActionsWithElements(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkboxStatus(String checkboxLocator) {
        return driver.findElement(By.cssSelector(checkboxLocator)).isSelected();
    }

    public boolean isElementVisibleByCssLocator(String cssLocator) {
        return driver.findElement(By.cssSelector(cssLocator)).isDisplayed();
    }

    public boolean buttonStatus(String buttonLocator) {
        return driver.findElement(By.cssSelector(buttonLocator)).isEnabled();
    }

    public void clickOnCheckbox(String checkboxLocator) {
        boolean checkboxStatus = checkboxStatus(checkboxLocator);
        if (checkboxStatus) {
            driver.findElement(By.cssSelector(checkboxLocator)).click();
            System.out.println("Click on checkbox: " + checkboxLocator);
        } else {
            System.out.println("Can't uncheck");
        }
    }

    public void clickOnElement(WebElement locator) {
        if (locator.isDisplayed() && locator.isEnabled()) {
            locator.click();
            System.out.println("Click on element: " + locator);
        } else {
            System.out.println("Can't click on element: " + locator);
        }
    }

    public void clickOnButton(String buttonLocator) {
        boolean buttonStatus = buttonStatus(buttonLocator);
        if (buttonStatus) {
            driver.findElement(By.cssSelector(buttonLocator)).click();
            System.out.println("Click on button: " + buttonLocator);
        } else {
            System.out.println("Can't click on disabled button: " + buttonLocator);
        }
    }

    public void selectMenuItem(String menuLocator, String menuItem) {
        Select menuItems = new Select(driver.findElement(By.cssSelector(menuLocator)));
        menuItems.selectByVisibleText(menuItem);
        System.out.println("Menu item is selected: " + menuLocator + "with value: " + menuItem);
        menuItems.getFirstSelectedOption();
    }

    public void indianMethod(String menuLocator, String menuItem) {
        Select menuItems = new Select(driver.findElement(By.cssSelector(menuLocator)));
        menuItems.getFirstSelectedOption();
        System.out.println(menuItems.isMultiple());
    }

    public void clickOnRadioButton(String buttonLocator) {
        boolean radioButtonStatus = driver.findElement(By.cssSelector(buttonLocator)).isDisplayed();
        if (radioButtonStatus) {
            driver.findElement(By.cssSelector(buttonLocator)).click();
            System.out.println("Click on radio button: " + buttonLocator);
        } else {
            System.out.println("Can't click on clicked radio button: " + buttonLocator);
        }
    }

    public void click(String cssLocator) {
        driver.findElement(By.cssSelector(cssLocator)).click();
        System.out.println("Click on element: " + cssLocator);
    }


}
