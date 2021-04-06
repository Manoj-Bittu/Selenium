package demo_Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoxpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("Goa (GOI)")).click();
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

	}

}
