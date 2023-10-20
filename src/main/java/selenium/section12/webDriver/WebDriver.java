package selenium.section12.webDriver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebDriver {
    private static org.openqa.selenium.WebDriver webDriver;

    public org.openqa.selenium.WebDriver getWebDriver(String browser) {
        ChromeOptions options = new ChromeOptions();

        if (webDriver == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                options.addArguments("--start-maximized");

                // start browser session in incognito
                // options.addArguments("--incognito");

                // remove "Chrome is being controlled by automated test software."
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

                // set download directory
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("download.default_directory", "/src/main/resources");
                options.setExperimentalOption("prefs", prefs);

                options.setPageLoadStrategy(PageLoadStrategy.NONE);
                webDriver = new ChromeDriver(options);
                webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                webDriver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                webDriver = new EdgeDriver();
            } else {
                throw new IllegalArgumentException("Invalid browser name: " + browser);
            }
        }
        return webDriver;
    }

    public static void closeWebDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver = null;
        }
    }
}
