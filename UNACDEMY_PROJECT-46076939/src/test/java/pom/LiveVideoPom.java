package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveVideoPom 
{
	JavascriptExecutor je ;
  public WebDriver driver;
  @FindBy(xpath = "//a[text()='Home']") WebElement homelink;
  @FindBy(xpath = "//h1") WebElement header;
  @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root IconButton__StyledIconButton-xcqu4l-0 cHsGvS BreadCrumbs__BackButton-hbycnr-3 iYAUjf']") WebElement backcmd;
public LiveVideoPom(WebDriver driver) 
{
	super();
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
  
  public void ClickHomeLink() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  homelink.click();
  }
  
  public void ClickBack() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  je =(JavascriptExecutor) driver;
  	je.executeScript("arguments[0].scrollIntoView();",backcmd);
	backcmd.click();
  }
  
  public String GetTitle() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  return driver.getTitle();
  }
  
  public String getHeader() throws InterruptedException
  {
	  Thread.sleep(2000);
	return header.getText();
  }
  
}
