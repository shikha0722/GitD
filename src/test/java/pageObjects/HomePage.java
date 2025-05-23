package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement lnkRegister;
	
	
	public void ClickRegister()
	{
		lnkRegister.click();
	}
	
}
