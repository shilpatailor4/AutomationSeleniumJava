package com.qa.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// Multiple window handle
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://automationteststore.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on the element social link
		driver.findElement(By.xpath("//div[@class='header_block']//a[@title='Facebook']")).click();
		
		//Fetch the main window id
		String mainWindow = driver.getWindowHandle();
		
		//find the all windows id
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String win : allWindows) {
			if(!win.equals(mainWindow)) {
				driver.switchTo().window(win);
				Thread.sleep(2000);
				System.out.println("Child page title:: " +driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		System.out.println("Parent window title: " + driver.getTitle());
		driver.close();

	}

}
