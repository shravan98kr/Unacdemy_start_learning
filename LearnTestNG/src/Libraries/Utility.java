package Libraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility 
{
	public static WebDriver launchApplication(int browser,String baseUrl)
	{
		WebDriver driver;
		switch (browser) 
		{
		case 1:
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");		
			driver = new ChromeDriver();   		
			break;

		case 2:
			System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver-v0.29.1-win64\\geckodriver.exe");		
			driver = new FirefoxDriver();   		
			break;

		case 3:

			System.setProperty("webdriver.ie.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");		
			driver = new ChromeDriver();   		
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");		
			driver = new ChromeDriver();   		
			break;
		}
          
		driver.manage().window().maximize();
		driver.get(baseUrl);
		return driver;
	}
	public static void loginToApplication(WebDriver driver,String Uname,String Pass)
	{
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(Uname);				
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(Pass);
		driver.findElement(By.className("button")).click();
	}
	
	public static void takeScreenShot(WebDriver driver,String file) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".\\Screenshots\\"+file+".png"));
	}
	public static String getTitle(WebDriver driver) 
	{
		return driver.getTitle();
		
	}
	public static void logout(WebDriver driver)
	{
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}
}

