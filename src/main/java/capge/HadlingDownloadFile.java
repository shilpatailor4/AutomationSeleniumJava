package capge;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HadlingDownloadFile {

	public static void main(String[] args) {
		
		String downloadFilePath = System.getProperty("user.dir") + "/downloadedFiles/DownloadDemo-master.zip";
		
		HashMap<String, Object> chromePerfs = new HashMap<String, Object>();
		chromePerfs.put("download.default_directory", downloadFilePath);
		chromePerfs.put("profile.default_content_setting.popup", 0);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", chromePerfs);
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.xpath("//a[text()='ZIP file']")).click();
		
		//verify files is dowbloaded ot not
		File file = new File(downloadFilePath);
		
		if(file.exists()) {
			System.out.println("File downloaded");
		}else {
			System.out.println("File not downloaded");
		}
		
		

	}

}
