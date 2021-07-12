package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	By textUserName = By.id("ctl00_MainContent_username");
	By textPassword = By.id("ctl00_MainContent_password");
	By cmdclick  = By.name("ctl00$MainContent$login_button");
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void enterUsername(String uname)
	{
		driver.findElement(textUserName).sendKeys(uname);
	}

	public void enterPass(String Pword) 
	{
		driver.findElement(textPassword).sendKeys(Pword);
	}

	public void clickbutt()
	{
		driver.findElement(cmdclick).click();
	}

	public String getPageTitle() 
	{
		return driver.getTitle();	
	}

	public void LoginToApplication(String uname,String Pword)
	{
		enterUsername(uname);
		enterPass(Pword);
		clickbutt();
	}

}
