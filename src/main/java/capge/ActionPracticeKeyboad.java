package capge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionPracticeKeyboad {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationteststore.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15L));
		
		By filterSearchLocator = By.id("filter_keyword");
		
		WebElement filterSearchTextbox = wait.until(ExpectedConditions.visibilityOfElementLocated(filterSearchLocator));
		filterSearchTextbox.sendKeys("Hello");
//		filterSearchTextbox.sendKeys(Keys.CONTROL + "a");
		
		//Perform keyboard actions using Actions class
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); //select the text
		action.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform(); //cut the text
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform(); //paste the text
		action.keyDown(Keys.SHIFT).sendKeys("Shilpa").keyUp(Keys.SHIFT).perform(); //enter new text with capital small the text

		//Mouse hover operation using mouseMoment method
		WebElement apparelSubCat = driver.findElement(By.xpath("//ul[contains(@class,'categorymenu')]//a[contains(text(),'Apparel')]"));
		action.moveToElement(apparelSubCat).perform();
		
		driver.close();
	}

}
