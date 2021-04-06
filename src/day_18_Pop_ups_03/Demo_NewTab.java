package day_18_Pop_ups_03;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_NewTab {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Tour Packages")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		String irctc = it.next();
		String tourPackage = it.next();
		driver.switchTo().window(tourPackage);
		driver.findElement(By.linkText("Login")).click();
		driver.close();
		driver.switchTo().window(irctc);
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru");
	}

}
