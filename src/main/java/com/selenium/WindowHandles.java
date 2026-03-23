package com.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// Handling the multiple windows
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		
		//click on the new window open element
		driver.findElement(By.xpath("//div[@id='HTML5']//a[@id='link2']")).click();
		
		//find the parent window id
		String parentWindow = driver.getWindowHandle();
		
		//find the all open windows id and switch to the next open window
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window : allWindows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				System.out.println("Child window title: "+driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title: " + driver.getTitle());
		
		driver.quit();

	}

}
