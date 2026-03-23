package com.selenium;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFileDownload {

	public static void main(String[] args) {
		
		String downloadFilePath = System.getProperty("user.dir")+"/downloadedFiles/sample.pdf";
		
		//Create HashMap and store chrome perferences
		HashMap<String, Object> chromPerfs = new HashMap<>();
		chromPerfs.put("download.default_directory", downloadFilePath);
		chromPerfs.put("profile.default_content_setting.popup", 0);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", chromPerfs);
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//a[@type='button']")).click();
		
		//Verify the downloaded file is present in the downloaded folder or not
		File file = new File(downloadFilePath);
		if(file.exists()) {
			System.out.println("File downloaded successfully.");
		}else {
			System.out.println("File is not downloaded.");
		}

	}

}
