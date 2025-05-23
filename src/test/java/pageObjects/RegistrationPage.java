package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}

	
	@FindBy(name="Gender")
	WebElement clickbttn;
	
	@FindBy(name="FirstName")
	WebElement txtFristname;
	
	@FindBy(name="LastName")
	WebElement txtLastname;
	
	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(name="Password")
	WebElement txtpwd;
	
	@FindBy(name="ConfirmPassword")
	WebElement txtconfirmpwd;
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement clickregister ;
	
	
	public void setFirstName(String fname)
	{
		txtFristname.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtconfirmpwd.sendKeys(pwd);
	}
	
	public void clickRegister()
	{
		clickregister.click();
	}
	
	
}
