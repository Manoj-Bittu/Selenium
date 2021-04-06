package day_13_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement multi = driver.findElement(By.id("cities"));
		Select s = new Select(multi);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("3");
		Thread.sleep(2000);
		s.selectByVisibleText("Delhi");
		Thread.sleep(3000);
		s.deselectByValue("3");

	}

}
