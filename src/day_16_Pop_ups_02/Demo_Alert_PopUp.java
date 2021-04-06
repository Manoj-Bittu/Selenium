package day_16_Pop_ups_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();

	}

}
