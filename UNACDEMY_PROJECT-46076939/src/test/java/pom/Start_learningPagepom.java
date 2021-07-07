package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Start_learningPagepom 
{
	public WebDriver driver;
	JavascriptExecutor je ;
	
	@FindBy(xpath = "//div//section//child::div[2]//div//div//child::section//child::div[1]//child::div[2]//a//button[text()='Start learning']") WebElement Compitative_Start_learning;
	@FindBy(xpath = "//div//section//child::div[2]//div//div//child::section//child::div[2]//child::div[2]//a//button[text()='Start learning']") WebElement Class_Start_learning;

	public Start_learningPagepom(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickStartLearnCompCmd() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		Compitative_Start_learning.click();
	}

	public void clickStartLearnClassCmd() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		Class_Start_learning.click();
	}

	public String gettitel() 
	{
		return driver.getTitle();
	}
}
