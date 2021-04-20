package day_19_ActionClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement course = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions act = new Actions(driver);
		act.moveToElement(course).perform();
		Thread.sleep(2000);
		
		WebElement st = driver.findElement(By.xpath("//span[text()='Software Testing']"));
		act.moveToElement(st).perform();
		WebElement mt = driver.findElement(By.linkText("Manual Testing"));
		act.contextClick(mt).perform();
		act.sendKeys("T").perform();
		

		
//		act.contextClick(course).perform();
//		Thread.sleep(2000);
//		act.sendKeys("T").perform();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		String main = it.next();
		String nxt = it.next();
		
		driver.switchTo().window(nxt);
		driver.findElement(By.linkText("KRN Informatix")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

}
