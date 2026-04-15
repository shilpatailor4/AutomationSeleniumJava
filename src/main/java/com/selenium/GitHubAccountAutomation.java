package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHubAccountAutomation {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://github.com/signup");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//enter the name
		By emailLocator = By.xpath("//input[@id='email']");
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
		email.sendKeys("shilpa@gmail.com");
		
		//enter the password
		By passwordLocator = By.xpath("//input[@id='password']");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
		password.sendKeys("123456");
		
		//enter the username
		By usernameLocator = By.xpath("//input[@id='login']");
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameLocator));
		username.sendKeys("shilpa");
		
		//select te country dropdwon
		By countryDropdownLocator = By.xpath("//button[contains(@id,'country-dropdown')]");
		WebElement selectDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropdownLocator));
		selectDropdown.click();
		
		//search the country
		By searchCountryLocator = By.xpath("//input[@id='country-dropdown-panel-filter']");
		WebElement searchCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(searchCountryLocator));
		searchCountry.sendKeys("Algeria");
		
		//select the country option
		By countryOptionLocator = By.xpath("//span[contains(text(), 'Algeria')]/..");
		WebElement countryOption = wait.until(ExpectedConditions.visibilityOfElementLocated(countryOptionLocator));
		countryOption.click();
		
		//select the checkbox
		By userConsentCheckboxLocator = By.xpath("//input[@id='user_signup[marketing_consent]']");
		WebElement userConsentCheckbox = wait.until(ExpectedConditions.visibilityOfElementLocated(userConsentCheckboxLocator));
		userConsentCheckbox.click();
		
		driver.close();

	}

}
