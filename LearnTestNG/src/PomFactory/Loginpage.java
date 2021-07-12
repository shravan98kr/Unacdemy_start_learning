package PomFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
   WebDriver driver;
   @FindBy(how = How.ID,using ="ctl00_MainContent_username") WebElement txtUserName;
   @FindBy(id = "ctl00_MainContent_password") WebElement txtPassword;
   @FindBy(name = "ctl00$MainContent$login_button") WebElement cmdLogin;
public Loginpage(WebDriver driver) 
{
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void enterUserName(String uName) 
{
	txtUserName.sendKeys(uName);
}

public void enterPassword(String Pass) 
{
	txtUserName.sendKeys(Pass);
}   
public void clickLogin() 
{
  cmdLogin.click();	
}

public String  getPageTitle() 
{
  return driver.getTitle();	
}

public void LoginToApplication(String uName,String Pass) 
{
	this.enterUserName(uName);
	this.enterPassword(Pass);
	this.clickLogin();
}
   
}


