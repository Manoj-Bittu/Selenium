package day_21_iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_iFrame_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame("secondframe");
		driver.findElement(By.name("name1")).sendKeys("Manoj");
		driver.findElement(By.name("rep")).click();
		
		driver.switchTo().defaultContent();
		WebElement frm = driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(frm);
		driver.findElement(By.name("check")).click();
		
		
	}

}
