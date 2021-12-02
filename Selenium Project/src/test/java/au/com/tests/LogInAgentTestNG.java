package au.com.tests;

import au.com.mavenelenium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInAgentTestNG {
WebDriver driver;

    @Test
    public void logInElementsPresentTest() {
        WebDriver driver = DriverFactory.open("chrome");
        driver.get("https://www.phptravels.net/login");


        //To check whether the email box is present or not
        boolean logInEmailBox = driver.findElement(By.name("email")).isDisplayed();
        // to check passwordbox is present or not
        boolean passwordBox = driver.findElement(By.name("password")).isDisplayed();

        Assert.assertTrue(logInEmailBox, "email text box present");
        Assert.assertTrue(passwordBox, "password text box present");
        //Assert.assertTrue(!passwordBox, "password text box not present");

    }
        @BeforeMethod
                public void setUP() {
            System.out.println("Open browser");
            driver = DriverFactory.open("chrome");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing Browser");
        driver.close();
    }
}
