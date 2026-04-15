package com.qa.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//switch to the iframe
		WebElement frameId = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameId);
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("shilpa tailor");

	}

}
