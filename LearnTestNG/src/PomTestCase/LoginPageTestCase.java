package PomTestCase;

import org.testng.annotations.Test;

import Libraries.Utility;
import pom.AllOrdersWeb;
import pom.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LoginPageTestCase 
{
	String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	WebDriver driver = Utility.launchApplication(1, baseUrl);
	LoginPage lg = new LoginPage(driver);
	AllOrdersWeb allOrders = new AllOrdersWeb(driver);
	String expectedTitle ="Web Orders";
	String actualTitle = null;

	@Test
	public void getTitleTestCase() 
	{
		Assert.assertEquals(actualTitle, expectedTitle);
		allOrders.CheckAll();
		allOrders.UncheckAll();
	}
	
	@BeforeTest
	public void initialization() 
	{ 
		lg.LoginToApplication("Tester","test"); 
		actualTitle = allOrders.GetPageTitle();
	}
	
	@AfterTest
	public void stop() throws InterruptedException 
	{
		allOrders.pageLogout();
	}
}
