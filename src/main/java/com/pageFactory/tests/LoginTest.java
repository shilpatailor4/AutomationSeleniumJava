package com.pageFactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageFactory.pages.LandingPage;
import com.pageFactory.pages.LoginPage;

public class LoginTest{

	WebDriver driver;
	LoginPage loginPage; // Reference to your Page Factory class
	LandingPage landingPage;
	
	@BeforeMethod
	public void setUp() {
		
		// 1. Initialize Driver
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		driver = new ChromeDriver(option);
		driver.get("https://tutorialsninja.com/demo");
		
		// 2. Initialize the Page Object
		loginPage = new LoginPage(driver);
		landingPage = new LandingPage(driver);
	}
	
	
	@Test(priority = 1, description = "Verify successful login with valid credentials")
	public void testSuccessfullyLogin() {

		// 3. Perform Actions using Page Object methods
		landingPage.myAccount().click();
		landingPage.loginOption();
		loginPage.loginToApp("shilpa.tailor@globallogic.com", "12345678");
		
		//verify current page url after login successful
		Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/account");
		
		//logout to app
		loginPage.verifyLogout();
	}
	
	@Test(priority = 2, description = "Verify unsuccessful login with invalid details")
	public void testInvalidLogin() {		
		landingPage.myAccount().click();
		landingPage.loginOption();
		loginPage.loginToApp("shilpa@gmail.com", "123456");
		
		//Verify error message if unsuccessful login
		
		String msg = loginPage.verifyErorr("Warning: No match for E-Mail Address and/or Password.");
		System.out.println(msg);
		Assert.assertEquals(msg, "Warning: No match for E-Mail Address and/or Password.");
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}	
}
