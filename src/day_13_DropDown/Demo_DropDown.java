package day_13_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement lang= driver.findElement(By.xpath("//select[@id='Skills']"));
		Select single = new Select(lang);
		single.selectByIndex(5);
		
	}

}
