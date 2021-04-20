package pom_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyLogin {
	
  @Test
  public void verify() {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Login log = new Login(driver);
	  log.typeUserName();
	  log.typePassword();
	  log.clickButton();
  }
}
