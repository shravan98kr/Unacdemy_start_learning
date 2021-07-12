package Package1;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Libraries.Utility;

public class TestCase1 
{
	String expectedTitle ="Web Orders Login";
	String actualTitle = null;
  @Test
  public void verfiyLoginpage() 
  {
	  String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	  WebDriver driver = Utility.launchApplication(1, baseUrl);
	  actualTitle = Utility.getTitle(driver);
     
	  Assert.assertEquals(actualTitle, expectedTitle);
	 driver.quit();
  }
}
