package pom_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(name="pwd")
	WebElement Password;
	
	@FindBy(id="loginButton")
	WebElement click;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeUserName() {
		UserName.sendKeys("admin");
	}
	
	public void typePassword() {
		Password.sendKeys("manager");
	}

	public void clickButton() {
		click.click();
	}
}
