package day_14_MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_MultiCheckPoints {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int si = allCheckbox.size();
		for (int i = 0; i < si; i++) {
			WebElement check = allCheckbox.get(i);
			check.click();
		}
		driver.close();
	}

}
