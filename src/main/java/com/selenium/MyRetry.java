package com.selenium;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
	
	int count = 0;
	int limit = 3;  //Retry upto 3 times
	
	public boolean retry(ITestResult result) {
		if(count < limit) {
			count++;
			return true;
		}
		return false;
	}
}


//>>>>>>>>>>>>>>>>>>>>>>>>>

/* 
 * In the Test class add this retry class
 * 
 * @Test(retryAnalyzer=MyRetry.class)
 * public class testFalkyFeature(){
 *              // test code
 *              
 *   }           
 * 
 * */
