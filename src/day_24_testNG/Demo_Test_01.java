package day_24_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Test_01 {
  
	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}
	
	@Test(priority=1)
	public void createCustomer() {
		System.out.println("Create Customer");
	}
	
	@Test(priority=2)
	public void about() {
		System.out.println("About Page");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
}
