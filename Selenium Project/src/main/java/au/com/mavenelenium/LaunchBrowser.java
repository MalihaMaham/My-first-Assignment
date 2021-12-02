package au.com.mavenelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LaunchBrowser {
//do not need main
    public static void  main (String[] args) {
        String browserType = "chrome";
        WebDriver driver;

        //5 Define the web driver
        driver = DriverFactory.open(browserType);
        driver.get("https://www.phptravels.com/demo/");

        //7. Locate & Click Login button
        driver.findElement(By.xpath("/html/body/header/div/nav/a[6]")).click();
         driver.quit();
    }

}
