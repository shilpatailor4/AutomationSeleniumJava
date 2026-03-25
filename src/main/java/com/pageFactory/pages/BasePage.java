package com.pageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	
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
	
	@AfterMethod
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
