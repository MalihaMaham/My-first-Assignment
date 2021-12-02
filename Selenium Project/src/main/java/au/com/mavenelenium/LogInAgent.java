package au.com.mavenelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInAgent {

    public static void main(String[] args) {

        String name = "Agent@gmail.com";
        String password = "Selenium@2021";
        String browserType = "chrome";


        WebDriver driver;

        // Import WebDriver
        driver = DriverFactory.open(browserType);

        driver.get("https://www.phptravels.net/login");
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Web Elements

        WebElement emailElement = driver.findElement(By.name("email"));
        WebElement passwordElement = driver.findElement(By.name("password"));
        WebElement cookieElement = driver.findElement(By.id("cookie_stop"));

        WebElement logInElement = driver.findElement(By.className("ladda-button"));


        //Fill out form

        emailElement.sendKeys(name);
        passwordElement.sendKeys(password);
        cookieElement.click();
        logInElement.click();

// try implement implicit and explicit
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.close();
    }
}
