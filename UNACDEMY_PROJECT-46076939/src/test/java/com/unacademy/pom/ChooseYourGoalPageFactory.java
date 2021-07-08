package com.unacademy.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseYourGoalPageFactory
{
	JavascriptExecutor je ;
	public WebDriver driver;

	@FindBy(xpath = "//ul[contains(@class,'GoalGroupNav')]//child::li") List<WebElement> listofgoals;
	
	public ChooseYourGoalPageFactory(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGoal(String goal) 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		je =(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,300)");
		WebElement goaloption = driver.findElement(By.xpath("//p[text()='"+goal+"']"));
		goaloption.click();
	}
	
	public int noOfGoals() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return listofgoals.size();
	}

	public String getTitle() 
	{
		return driver.getTitle();	
	}
	
}
