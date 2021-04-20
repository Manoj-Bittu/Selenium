package pom_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver ;
	
	By username = By.id("username");
	By password = By.name("pwd");
	By login = By.id("loginButton");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUserName() {
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword() {
		driver.findElement(password).sendKeys("manager");
	}
	
	public void clickButton() {
		driver.findElement(login).click();
	}
}
