package com.qa.selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowserWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(500, 1000);
		
		driver.manage().window().setSize(d);
	}

}
