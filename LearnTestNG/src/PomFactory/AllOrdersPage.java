package PomFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOrdersPage 
{
  WebDriver driver;
  
  @FindBy(linkText = "Check All") WebElement CheckAllLink;
  @FindBy(linkText = "Uncheck All") WebElement UnCheckAllLink;
  @FindBy(linkText= "Logout") WebElement LogoutLink;
public AllOrdersPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void CheckAll() 
{
  CheckAllLink.click();	
}
public void UncheckAll() 
{
	UnCheckAllLink.click();
}
public void logout() throws InterruptedException 
{
  LogoutLink.click();
  Thread.sleep(500);
  driver.quit();
}

}
