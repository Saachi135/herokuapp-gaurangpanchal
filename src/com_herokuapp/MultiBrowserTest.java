package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "firefox";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Browser not found");
        }
        // input url
        driver.get(baseurl);

        // get title
        String title = driver.getTitle();
        System.out.println(title);

        // print the url
        driver.getCurrentUrl();

        // print page source
        driver.getPageSource();

        //enter email to email field
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("ABC@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abcdeft");

        //close the browser
        driver.close();

    }

}
