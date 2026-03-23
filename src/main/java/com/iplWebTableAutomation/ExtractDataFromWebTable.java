package com.iplWebTableAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtractDataFromWebTable {

	public static void main(String[] args) {
		//Extract data from the web table
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.iplt20.com/points-table/men/2025");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//Step1: find the entire web table
		By tableLocator = By.className("ih-td-tab");
		
		WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(tableLocator));
		
		//Step2: Locate the tbody with the chaining of webelement
		By tbodyLocator = By.id("pointsdata");
		
		WebElement tbody = table.findElement(tbodyLocator);
		
		//Step3: Find All table rows
		By tableRowLocator = By.tagName("tr");
		List<WebElement> tableRowList = tbody.findElements(tableRowLocator);
		System.out.println(tableRowList.size());
		
		List<Team> teamList = new ArrayList<Team>();
		for(WebElement row : tableRowList) {
			By tableDataRowLocator = By.tagName("td");
			List<WebElement> tableDataList = row.findElements(tableDataRowLocator);
			
//			for(WebElement tableData :tableDataList) {
//				System.out.println(tableData.getText());
//			}
			
			//Access data using Team pojo class
			double nrr = Double.parseDouble(tableDataList.get(7).getText());
			int pts = Integer.parseInt(tableDataList.get(10).getText());
			Team team = new Team(tableDataList.get(0).getText(), tableDataList.get(2).getText(), nrr, pts);
			teamList.add(team);
		}
		
		for(Team data : teamList) {
			System.out.println(data);
		}
		
		// Using Java 8 Stream to find the team with the maximum points
		
		int maxPts = teamList.stream()
				.mapToInt(Team::getPoints)
				.max()
				.orElse(0); // Handles the case if the list is empty
		
		// 2. Filter all teams that have those max points
		List<Team> topTeams = teamList.stream()
		    .filter(t -> t.getPoints() == maxPts)
		    .collect(Collectors.toList());

		System.out.println();
		System.out.println("Teams with the highest points (" + maxPts + "):");
		topTeams.forEach(System.out::println);

		driver.close();
	}

}
