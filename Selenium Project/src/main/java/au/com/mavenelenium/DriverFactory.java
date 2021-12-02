package au.com.mavenelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver open(String browserType) {

        if (browserType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\afiar\\Selenium\\geckodriver.exe");
            return new FirefoxDriver();
        } else {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\afiar\\Selenium\\chromedriver.exe");
            // define web browser object & instantiated it
            return new ChromeDriver();


        }
    }
}
