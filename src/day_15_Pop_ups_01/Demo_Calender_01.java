package day_15_Pop_ups_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Calender_01 {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String year = "2021";
		String month = "July";
		String date = "25";
		
		driver.findElement(By.id("onward_cal")).click();
		
		while(true)
		{
			String monthYear = driver.findElement(By.className("monthTitle")).getText();
			
			String arr[] = monthYear.split(" ");
			String mon= arr[0];
			String yr = arr[1];
			if(mon.equals(month) && yr.equals(year))
			break;
			else
				driver.findElement(By.xpath("//button[text()='>']")).click();
		
		}
		
		List<WebElement> dt = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

		for(WebElement ele:dt)
		{
			String data =ele.getText();
			if(data.equals(date))
			{
				ele.click();
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.id("onward_cal")).click();
		String month1 = "Apr";
		String date1 = "11";
		String year1 = "2021";
		
		while(true)
		{
			String monthYear = driver.findElement(By.className("monthTitle")).getText();
			
			String arr[] = monthYear.split(" ");
			String mon= arr[0];
			String yr = arr[1];
			if(mon.equals(month1) && yr.equals(year1))
			break;
			else
				driver.findElement(By.xpath("//button[text()='<']")).click();
		
		}
		
		List<WebElement> dt1 = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
		for(WebElement ele:dt1)
		{
			String data =ele.getText();
			if(data.equals(date1))
			{
				ele.click();
			}
		}

	}

}
