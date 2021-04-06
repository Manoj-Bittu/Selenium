package day_11_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSync_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actiTime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		driver.findElement(By.id("logoutLink")).click();
		
//		Wait<WebDriver> waitFluent = new FluentWait<WebDriver>(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS)
//				.ignoring((NoSuchElementException.class));
//				waitFluent.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
//				
//		driver.findElement(By.id("logoutLink")).click();

	}

}
