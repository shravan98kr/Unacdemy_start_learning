package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestCase5 {
	String baseUrl = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    String expectedTitle = "Web Orders";
    String actualTitle = null;
    WebDriver driver;

    @Parameters({"username","password"})
    @Test
    public void verifyHomePage(String username,String password) {
        
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    
    @Parameters("browser")
    @BeforeTest
    public void initialization(String browser) {
        
        switch (browser) {
            case "ch":
                System.setProperty("webdriver.chrome.driver", "C:\\\\Softwares\\\\chromedriver_win32\\\\chromedriver.exe");        
                driver = new ChromeDriver();
                break;
                
            case "ff":
                System.setProperty("webdriver.gecko.driver", "D:\\SeleniumSoft\\geckodriver-v0.21.0\\geckodriver.exe");        
                driver = new FirefoxDriver();
                break;
                
            case "ie":
                System.setProperty("webdriver.ie.driver", "D:\\SeleniumSoft\\IE_Driver\\IEDriverServer.exe");        
                driver = new InternetExplorerDriver();
                break;
    
            default:
                System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoft\\chromedriver_90\\chromedriver.exe");        
                driver = new ChromeDriver();
                break;
            }
        
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
    }

 

    @AfterTest
    public void stop() {
        
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
