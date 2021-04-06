package day_14_MultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_MultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int si = allLinks.size();
		for (int i = 0; i < si; i++) {
			WebElement link = allLinks.get(i);
			String txt = link.getText();
			System.out.println(txt);
		}
		driver.close();
	}

}
