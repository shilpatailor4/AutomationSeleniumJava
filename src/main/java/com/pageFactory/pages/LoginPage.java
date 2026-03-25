package com.pageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	WebDriver driver;
	
	//1. Locate an element using @FindBy	
	@FindBy(id = "input-email")
	WebElement userEmail;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "(//a[text()='Logout'])[2]")
	WebElement logoutBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Warning: No match')]")
	WebElement loginError;
	
	// 2. Initialize elements in the Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// 3. Define Actions
	public void loginToApp(String email, String pwd) {
		userEmail.sendKeys(email);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void verifyLogout() {
		logoutBtn.isDisplayed();
		logoutBtn.click();
	}
	
	public String verifyErorr(String errorMsg) {
		loginError.isDisplayed();
			return errorMsg;
	}
	
}
