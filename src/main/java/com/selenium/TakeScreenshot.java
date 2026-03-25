package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshot {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://google.com/");
		
		//set file path
		String filePath = System.getProperty("user.dir") + "/downloadedFiles/" + "SampleImage_" + System.currentTimeMillis() + ".png";
		//take screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File desFile = new File(filePath);
		
		try {
			FileUtils.copyFile(srcFile, desFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

}
