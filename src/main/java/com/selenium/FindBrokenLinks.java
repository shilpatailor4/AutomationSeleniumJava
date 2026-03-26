package com.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		//Set the broken link attibute to increase every time
		int noOfBrokenLinks=0;
		
		//Find all links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("All links on the page: " + allLinks.size());
		
		//find the 'href' attribute and check the links if not href then not possible to check broken link
		for(WebElement link : allLinks) {
			String hrefAttValue = link.getAttribute("href");
			if(hrefAttValue == null || hrefAttValue.isEmpty()) {
				System.out.println("Not possible to check broken links when href attribute if null or empty");
				continue;
			}
			
			try {
				URL urlLink = new URL(hrefAttValue);
				HttpURLConnection conn = (HttpURLConnection) urlLink.openConnection();
				conn.connect();
				
				int responseCode = conn.getResponseCode();
				
				if(responseCode >= 400) {
					System.out.println("Broken Links ==> " + hrefAttValue + " ==> Response Code:: " + responseCode);
					noOfBrokenLinks++;
				}else {
					System.out.println("Not Broken Links ==> " + hrefAttValue + " ==> Response Code:: " + responseCode);
				}
			}catch(Exception e) {
				
			}
		}
		
		driver.close();

	}

}
