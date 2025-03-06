package com.selenium.test_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin {
    private WebDriver driver;
    private String baseUrl = "https://www.facebook.com/";

    
    // Constructor
    public FacebookLogin(WebDriver driver) {
        this.driver = driver;
        driver.get(baseUrl);
    }

    // Login method
    public void login(String email, String password) {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
    }

    // Validate if login was successful
    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("facebook.com");
    }
}
