package day_17_Pop_upss_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demo_FileDownload {

	public static void main(String[] args) {
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/java-archive");
		
		WebDriver driver = new FirefoxDriver(prof);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[text()='Click Here'])[2]")).click();
	}

}
