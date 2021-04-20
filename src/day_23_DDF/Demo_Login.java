package day_23_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Demo_Excel ex = new Demo_Excel();
		int lastRow = ex.getRowNum("sheet1");
		for(int i=1;i<=lastRow;i++) {
			String un = ex.getData("sheet1", i, 0);
			String pw = ex.getData("sheet1", i, 1);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("logoutLink")).click();
		}
		

	}

}
