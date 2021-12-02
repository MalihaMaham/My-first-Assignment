package au.com.mavenelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreateDemoUser {

    public static void main(String[] args) {

        String name = "demoA@gmail.com";
        String password = "Selenium@21";
        String browserType = "chrome";
        WebDriver driver;


        // Import ,
        driver = DriverFactory.open(browserType);

        // navigating to the website
        driver.get("https://phptravels.org/index.php?rp=/login");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.name("username")).sendKeys(name);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
        driver.findElement(By.name("rememberme")).click();


        //driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        driver.findElement(By.id("login")).click();

        driver.close();

    }

}
