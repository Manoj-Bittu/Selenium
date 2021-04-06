package day_10_checkPoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_actiTime_Text_CheckPoint {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.actiTime.com");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(3000);
	String expected = "Enter Time-Track";
	String text = driver.findElement(By.xpath("//td[@class='pagetitle'][1]")).getText();

	if(text.equals(expected)) {
		System.out.println("Pass");
	} else {
		System.out.println("Fail");
	}
	}

}
