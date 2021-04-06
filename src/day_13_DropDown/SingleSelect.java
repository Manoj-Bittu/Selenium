package day_13_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement single =driver.findElement(By.id("city")); 
		Select sd = new Select(single);
		sd.selectByIndex(2);
		Thread.sleep(2000);
		sd.selectByValue("2");
		
		List<WebElement> allOptions = sd.getOptions();
//		int op = allOptions.size();
		WebElement option = allOptions.get(0);
		String txt = option.getText();
		System.out.println(txt);
		
		Thread.sleep(5000);
		driver.close();
	}

}
