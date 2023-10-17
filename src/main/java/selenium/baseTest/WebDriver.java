package selenium.baseTest;


import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriver {
    private static org.openqa.selenium.WebDriver webDriver;
    private final static String DRIVERS_ULR = "drivers/";
    private final static String CHROME_ULR = DRIVERS_ULR + "chromedriver.exe";
    private final static String GECKO_ULR = DRIVERS_ULR + "geckodriver.exe";
    private final static String EDGE_ULR = DRIVERS_ULR + "msedgedriver.exe";

    public WebDriver(ChromeOptions options) {
    }

    public static org.openqa.selenium.WebDriver getWebDriver(String browser) {
        ChromeOptions options = new ChromeOptions();

        if (webDriver == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", CHROME_ULR);
                options.addArguments("--start-maximized", "--disable-infobars");
//                options.addArguments("--disable-infobars");
                options.setPageLoadStrategy(PageLoadStrategy.NONE);

                webDriver = new ChromeDriver(options);
                webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", GECKO_ULR);
                webDriver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", EDGE_ULR);
                webDriver = new EdgeDriver();
            } else {
                throw new IllegalArgumentException("Invalid browser name: " + browser);
            }
        }
        return webDriver;
    }

    public static void closeWebDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
