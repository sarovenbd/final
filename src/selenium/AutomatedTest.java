package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/student_user/Downloads/chromedriver_linux64/chromedriver");

        WebDriver driver = new ChromeDriver();

        //test 1
//        driver.get("https://saucedemo.com");
//        driver.manage().window().maximize();
//        
////        Thread.sleep(3000);
//        driver.findElement(By.id("user-name")).sendKeys("sdfsdf");
//        driver.findElement(By.id("password")).sendKeys("sdfsdf");
//        
//        driver.findElement(By.id("login-button")).click();
//
//        String actual = driver.getTitle();
//        
//        String expected = "Swag Labs";
//        driver.close();
//        
//        if (actual.equalsIgnoreCase(expected)) {
//            System.out.println("Test Successfull");
//        } else {
//            System.out.println("Test failed!!");
//        }
//        
        //test 2
//        driver.get("https://saucedemo.com");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("user-name")).sendKeys("sdfsdf");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        
//        driver.findElement(By.id("login-button")).click();
//        
//        String actual1 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
//        
//        String expected1 = "Epic sadface: Username and password do not match any user in this service";
//
//        
//        driver.close();
//        
//        if (actual1.equalsIgnoreCase(expected1)) {
//            System.out.println("Test Successfull");
//        } else {
//            System.out.println("Test failed!!");
//        }
//        
        //test 3
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("sdfsdf");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

//        String actual3 = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();

        String actual3 = driver.getTitle();
        
        String expected3 = "Swag Labs";

        driver.close();

        if (actual3.equalsIgnoreCase(expected3)) {
            System.out.println("Test Successfull");
        } else {
            System.out.println("Test failed!!");
        }

    }

}
