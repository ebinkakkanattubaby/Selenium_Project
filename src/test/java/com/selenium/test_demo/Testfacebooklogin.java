package com.selenium.test_demo;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Testfacebooklogin {
    private WebDriver driver;
    private FacebookLogin facebookLogin;

    @BeforeEach
    void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        facebookLogin = new FacebookLogin(driver);
    }

    @Test
    void testValidLogin() {
        facebookLogin.login("ebinkbaby@gmail.com", "worldcup2011");
        assertTrue(facebookLogin.isLoginSuccessful(), "Login sucessful");
    }

	/*
	 * @Test void testInvalidLogin() {
	 * facebookLogin.login("ebininvestore@gmail.com", "test@123");
	 * assertFalse(facebookLogin.isLoginSuccessful(), "Invalid login should fail!");
	 * }
	 * 
	 * @Test void testEmptyLogin() { facebookLogin.login("", "");
	 * assertFalse(facebookLogin.isLoginSuccessful(), "Empty login should fail!"); }
	 */

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
