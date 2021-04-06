package day_16_Pop_ups_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Auth_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Software Testing//Selenium//Packages//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:manager@uat-dwebge.www.deutseche-bank.de");
		
	}

}
