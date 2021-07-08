package com.unacademy.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartLearningPageFactory 
{
	public WebDriver driver;
	JavascriptExecutor je ;
	
	@FindBy(xpath = "//div//section//child::div[2]//div//div//child::section//child::div[1]//child::div[2]//a//button[text()='Start learning']") WebElement startlearningcompetativecmd;
	@FindBy(xpath = "//div//section//child::div[2]//div//div//child::section//child::div[2]//child::div[2]//a//button[text()='Start learning']") WebElement startlearningclass6to12cmd;

	public StartLearningPageFactory(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void clickStartLearnComptitiveCmd() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		startlearningcompetativecmd.click();
	}

	public void clickStartLearnClass6to12Cmd() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,250)");
		Thread.sleep(1000);
		startlearningclass6to12cmd.click();
	}

	public String gettitle() 
	{
		return driver.getTitle();
	}
}
