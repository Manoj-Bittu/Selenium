package day_10_checkPoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_actiTime_Title_CheckPoint {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actiTime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expected = "actiTIME - Login";
		String actual = driver.getTitle();
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
