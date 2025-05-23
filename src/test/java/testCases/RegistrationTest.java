package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class RegistrationTest extends BaseClass {

	@Test
	public void Verify_registartion()
	{
		HomePage hp= new HomePage(driver);
		hp.ClickRegister();
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setFirstName("vidya");
		rp.setLastName("shukla");
		rp.setEmail("vs@gmail.com");
		rp.setPassword("xyz12345");
		rp.setConfirmPassword("xyz12345");
		rp.clickRegister();
	}
}
