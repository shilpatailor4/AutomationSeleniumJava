package com.qa.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) {
		// Find the broken links on the web page
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://google.com/");
		
		int noOfBrokenLink = 0;
		
		//find the all the links on the web page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Size of all links: " + allLinks.size());
		
		//find the href attribute link
		for(WebElement link : allLinks) {
			String hrefAttValue = link.getAttribute("href");
			if(hrefAttValue == null || hrefAttValue.isEmpty()) {
				System.out.println("Not possible to check te broken links because they are null or empty.");
				continue;
			}
			
			try {
				URL url = new URL(hrefAttValue);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.connect();
				int responseCode = conn.getResponseCode();
				
				if(responseCode >= 400) {
					System.out.println("Links are broken: => " + responseCode + " => " + hrefAttValue);
					noOfBrokenLink++;
				}else {
					System.out.println("Links are not broken: => " + responseCode + " => " + hrefAttValue);
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		driver.close();

	}

}
