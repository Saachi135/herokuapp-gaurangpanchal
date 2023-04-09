package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // 1. Setup chrome browser
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //assigning variable
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);

        //3. Print the title of the page
        String title = driver.getTitle();

        // printing title
        System.out.println(title);

        //we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the current url
        System.out.println("Current Url: " + driver.getCurrentUrl());

        // print the page source
        System.out.println("Print page source: " + driver.getPageSource());

        // Enter the email to email field
        // Find element for email field
        WebElement email = driver.findElement(By.id("username"));
        // find password element and input email to the field
        email.sendKeys("Gaurang@yahoo.com");

        // Enter the password to password
        // find password element
        WebElement password = driver.findElement(By.name("password"));
        // input the password to the field
        password.sendKeys("12345ABC");

        // close the browser
        driver.close();


    }

}
