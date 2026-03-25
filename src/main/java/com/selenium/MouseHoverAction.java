package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseHoverAction {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://tutorialsninja.com/demo/");

		// Perform mouse hover action
		Actions action = new Actions(driver);

		WebElement desctopEle = driver.findElement(By.xpath("//a[text()='Desktops']"));
		action.moveToElement(desctopEle).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]")).click();
		
		Assert.assertEquals(driver.getTitle(), "Mac");
		
		driver.close();
	}
}
