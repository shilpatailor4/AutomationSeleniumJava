package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssert {

	public static void main(String[] args) {
		
		/*Assert: implemented Hard Assertion and if test is failed then immeditaly test execution will stop and 
		 * next line of code will skipped 
		 * 
		 * 
		 * Verify implemented Soft assertion and if test fauiled then record the failed tests 
		 *  and continue the remaining test execution. And of all lines will add .assertAll();
*/
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//get the page title and verify it  (Hard assertion)
//		Assert.assertEquals(driver.getTitle(), "xyz");  // intentially failed
		
		//Soft assertion
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "xyz");
		
		driver.findElement(By.id("input-email")).sendKeys("shilpa.tailor@globallogic.com");
		driver.findElement(By.id("input-password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//except all soft assert
		soft.assertAll();
	}

}
