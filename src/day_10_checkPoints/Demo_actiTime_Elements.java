package day_10_checkPoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_actiTime_Elements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://krninformatix.com/sample.html");
		boolean status = driver.findElement(By.id("rem")).isSelected();
		System.out.println(status);
	}

}
