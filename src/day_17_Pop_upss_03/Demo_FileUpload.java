package day_17_Pop_upss_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");

		driver.findElement(By.id("brow")).sendKeys("C:\\Users\\Bittu\\Documents\\Presentation");
	}

}
