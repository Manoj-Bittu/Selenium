package day_14_MultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_ValueAttribute {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String txt = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getAttribute("href");
		System.out.println(txt);
		driver.close();
	}

}
