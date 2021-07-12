package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllOrdersWeb 
{
	WebDriver driver;
	By CheckAllLink  = By.linkText("Check All");
	By UncheckAllLink = By.linkText("Uncheck All");
	By cmdDelete = By.id("ctl00_MainContent_btnDelete");
	By logoutLink = By.linkText("Logout");

	public AllOrdersWeb(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}


	public void CheckAll() 
	{
		driver.findElement(CheckAllLink).click();
	}
	public void UncheckAll() 
	{
		driver.findElement(UncheckAllLink).click();
	}
	public void DeleteButt() 
	{
		driver.findElement(cmdDelete).click();	
	}
	public String GetPageTitle()
	{
		return driver.getTitle();
	}
	public void pageLogout() throws InterruptedException 
	{
		driver.findElement(logoutLink).click();
		Thread.sleep(500);
		driver.quit();
	}
}
