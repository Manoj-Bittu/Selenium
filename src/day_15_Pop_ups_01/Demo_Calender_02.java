package day_15_Pop_ups_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Calender_02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("(//td[text()='31'])[2]")).click();

		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='return_cal']")).click();
		driver.findElement(By.xpath("(//td[@class='next'])[2]")).click();
		driver.findElement(By.xpath("(//td[text()='2'])[2]")).click();
		
		driver.close();
	}

}
