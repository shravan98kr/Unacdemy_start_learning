package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestCase3 
{
	String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	WebDriver driver;
	String expectedTitle1 ="Web Orders Login";
	String expectedTitle2 ="Web Orders";
	String actualTitle1 = null;
	String actualTitle2 = null;
  @Test(priority = 1)
  public void verifyLoginpage() 
  {
	  actualTitle1 = driver.getTitle();
		Assert.assertEquals(actualTitle1, expectedTitle1);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");				
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.className("button")).click();
  }
  @Test(priority = 2)
  public void verifyHomepage()
  {
	  actualTitle2  = driver.getTitle();
	  Assert.assertEquals(actualTitle2, expectedTitle2);
  }
  @BeforeTest
  public void initialization() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

  @AfterTest
  public void stop() 
  {
	  driver.findElement(By.linkText("Logout")).click();
  }

}
