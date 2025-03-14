package com.selenium.test_demo;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookloginAutomation {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(options);

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        FacebookLogin facebookLogin = new FacebookLogin(driver);
        facebookLogin.login("ebinkbaby@gmail.com","worldcup2011");
		

	}

}
