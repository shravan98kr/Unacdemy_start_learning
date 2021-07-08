package com.unacademy.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoalHomePagePageFactory 
{
	public WebDriver driver ;
	JavascriptExecutor je ;
	
	@FindBy(xpath="//h3[text()='Prepare with Top Educators']") WebElement preparewithtopeducatorheader;
	@FindBy(xpath="//h3[text()='Batches for syllabus completion']") WebElement batchesforsyllabuscompletionheader;
	@FindBy(xpath="//h3[text()='Courses starting soon']") WebElement coursesstartingsoonheader;
	@FindBy(xpath="//h3[text()='Best of all time']") WebElement bestofalltimeheader;
	@FindBy(xpath="//h3[text()='Comprehensive syllabus']") WebElement comprehensivesyllabusheader;
	@FindBy(xpath="//h3[text()='Track your preparation']") WebElement trackyourpreparationheader;
	@FindBy(xpath ="//h1[text()='Live Classes']" ) WebElement liveclassheader;
	@FindBy(xpath = "//h2[text()='Get the learning app']") WebElement applicationheader;
	@FindBy(xpath = "//h4[text()='See all'][@data-analytics='subscription-seeAll']") WebElement seeall_link;
	@FindBy(xpath = "//h2[text()='Learn on the phone or the computer']") WebElement appheader;
//	@FindBy(xpath = "//p[text()='CBSE Class 12']") WebElement homenavigtor;
	
	public GoalHomePagePageFactory(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
    public void scrollToPrepareWithTopEducatorHeader() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",preparewithtopeducatorheader);
		
	}
    public void scrollToBatchesForSyllabusCompletionHeader() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",batchesforsyllabuscompletionheader);
		
	}
    public void scrollToCoursesStartingSoonHeader() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",coursesstartingsoonheader);
		
	}
    public void scrollToBestOfAllTimeHeader() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",bestofalltimeheader);
		
	}
    public void scrollToComprehensiveSyllabusHeader() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",comprehensivesyllabusheader);
		
	}
    public void scrollToTrackYourPreparationHeader() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",trackyourpreparationheader);
		Thread.sleep(2000);
	}
    public void scrollToLiveClassHeader() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",liveclassheader);
		Thread.sleep(2000);
	}
    public void scrollToApplicationHeader() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",applicationheader);
		Thread.sleep(2000);
	}
    public void scrollToAppHeader() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",appheader);
		Thread.sleep(2000);
	}
    
	public boolean isPrepareWithTopEducatorHeaderDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",preparewithtopeducatorheader);
		return preparewithtopeducatorheader.isDisplayed();
	}

	public boolean isBatchesForSyllabusCompletionHeaderDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",batchesforsyllabuscompletionheader);
		return batchesforsyllabuscompletionheader.isDisplayed();  
	}

	public boolean isCoursesStartingSoonHeaderDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",coursesstartingsoonheader);
		return coursesstartingsoonheader.isDisplayed();
	}

	public boolean isBestOfAllTimeHeaderDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",bestofalltimeheader);
	
		return bestofalltimeheader.isDisplayed();  
	}

	public boolean isComprehensiveSyllabusHeaderDisplayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",comprehensivesyllabusheader);
		Thread.sleep(2000);
		return comprehensivesyllabusheader.isDisplayed();  
	}

	public boolean isTrackYourPreparationHeaderDisplayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",trackyourpreparationheader);
		Thread.sleep(2000);
		return trackyourpreparationheader.isDisplayed();  
	}

	public boolean isLiveClassHeaderDisplayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",liveclassheader);
		Thread.sleep(2000);
		return liveclassheader.isDisplayed();  
	}

	public boolean isApplicationHeaderDisplayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",applicationheader);
		Thread.sleep(2000);
		return applicationheader.isDisplayed();  
	}
	public boolean isAppHeaderDisplayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",appheader);
		Thread.sleep(2000);
		return appheader.isDisplayed();  
	}


	public void clickOnSeeAllLink() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",liveclassheader);
		Thread.sleep(2000);
		seeall_link.click();
	}

	public void  clickOnProfile(String educator) throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",preparewithtopeducatorheader);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='"+educator+"']")).click();
	}

	public void clickOnSubject(String syllabus) throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",comprehensivesyllabusheader);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='"+syllabus+"']")).click();
	}

	public void clickOnAppIcon(String app) throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",applicationheader);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='"+app+"']")).click();
	}

	public void clickOnBatch(String batch) throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",batchesforsyllabuscompletionheader);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='"+batch+"']")).click();
	}

	public void clickOnCourse(String course) throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",coursesstartingsoonheader);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='"+course+"']")).click();
	}

	public void clickOnBestcourse(String bestcourse) throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",bestofalltimeheader);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='"+bestcourse+"']")).click();
	}
	
	
	public String getTitle() throws InterruptedException 
	{
		Thread.sleep(2000);
	  return driver.getTitle();	
	}
    
	public void navigation() throws InterruptedException 
	{
	   Thread.sleep(4000);
	   driver.navigate().back();
	}
	
	public void quit() 
	{
	  driver.quit();	
	}
	
//	public void click_homenavigator() throws InterruptedException 
//	{
//		Thread.sleep(2000);
//	    homeNavigtor.click();
//	}
}
