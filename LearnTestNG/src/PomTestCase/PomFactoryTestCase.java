package PomTestCase;

import org.openqa.selenium.WebDriver;

import Libraries.Utility;
import PomFactory.AllOrdersPage;
import pom.LoginPage;

public class PomFactoryTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		WebDriver driver = Utility.launchApplication(1, baseUrl);
		String expectedTitle ="Web Orders";
		String actualTitle = null;
		
		LoginPage login = null;
		AllOrdersPage allOrders = null;
		
		login = new LoginPage(driver);
		allOrders = new AllOrdersPage(driver);
		
		login.LoginToApplication("Tester", "test");
		
		actualTitle = login.getPageTitle();
		
	if (actualTitle.contentEquals(expectedTitle)) 
	{
	  allOrders.CheckAll();
	  Thread.sleep(500);
	  allOrders.UncheckAll();
	  Thread.sleep(500);
	  allOrders.logout();
	} 
	else 
	{
      driver.quit();
	}
	}

}
