package com.unacademy.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility 
{
	String path = "C:\\Users\\SHRAVKR\\git\\Unacdemy_start_learning\\UNACDEMY_PROJECT-46076939\\config.properties";
	File configFile = new File(path);
	FileReader reader ;
	Properties props ;	
	
	public void configfileinitialization() throws IOException
	{
		reader = new FileReader(configFile);
		props = new Properties();
		props.load(reader);
	}
	
	public String getWebDriver() throws IOException
	{
		configfileinitialization();
		return props.getProperty("Web_Driver");
	}

	public String getBaseUrl() throws IOException
	{
		configfileinitialization();
		return props.getProperty("baseUrl");
	}

	public String getExecutor() throws IOException
	{
		configfileinitialization();
		return props.getProperty("executable");
	}
    
	public void scrolltoElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public String getExcelSheetPath() throws IOException
	{
		configfileinitialization();
		return props.getProperty("testDataexcelfile");
	}
	public String getExcelSheet1Name() throws IOException
	{
		configfileinitialization();
		return props.getProperty("sheet1name");
	}
	public String getExcelSheet2Name() throws IOException
	{
		configfileinitialization();
		return props.getProperty("sheet2name");
	}
	public void waitMetod(int secounds) throws InterruptedException
	{
		Thread.sleep(secounds*1000);
	}
	
	public int noOfGoalsInClass() 
	{
	   	return 5;
	}
	public int noOfGoalsInExams() 
	{
	   	return 20;
	}
}
