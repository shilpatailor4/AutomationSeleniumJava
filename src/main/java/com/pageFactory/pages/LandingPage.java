package com.pageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//1. Locate an element using @FindBy
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginOption;
	
	public WebElement myAccount() {
		return myAccount;
	}
	
	public LoginPage loginOption() {
		loginOption.click();
		return new LoginPage(driver);
	}

}
