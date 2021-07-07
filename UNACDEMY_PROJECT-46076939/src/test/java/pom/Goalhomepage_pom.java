package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goalhomepage_pom 
{
	public WebDriver driver ;
	JavascriptExecutor je ;
	
	@FindBy(xpath = "//button[text()='Bank Exams']") WebElement Competative_goalhomedropdown;
	@FindBy(xpath = "//button[text()='CBSE Class 12']") WebElement Class_goalhomedropdown;
	@FindBy(xpath="//h3[text()='Prepare with Top Educators']") WebElement Prepare_with_top_educator_header;
	@FindBy(xpath="//h3[text()='Batches for syllabus completion']") WebElement Batches_for_syllabus_completion_header;
	@FindBy(xpath="//h3[text()='Courses starting soon']") WebElement Courses_starting_soon_header;
	@FindBy(xpath="//h3[text()='Best of all time']") WebElement Best_of_all_time_header;
	@FindBy(xpath="//h3[text()='Comprehensive syllabus']") WebElement Comprehensive_syllabus_header;
	@FindBy(xpath="//h3[text()='Track your preparation']") WebElement Track_your_preparation_header;
	@FindBy(xpath ="//h1[text()='Live Classes']" ) WebElement Live_class_header;
	@FindBy(xpath = "//h2[text()='Get the learning app']") WebElement Application_header;
	@FindBy(xpath = "//div//a[2]//div[@class='ThirdSection__CardWrapper-sc-152fs7x-7 cOlgES']") WebElement videosrc;
	@FindBy(xpath = "//h4[@class='H4-sc-1i4prm5-0 ThirdSection__GreenH4-sc-152fs7x-11 hrggIX lSJbR']") WebElement Seeall_link;
	@FindBy(xpath = "//div//child::section[3]//div//div[@class='CardCarousel__CarouselWrapper-sc-1e0lpax-4 jllRha']//div//div//child::div[1][@class='CardCarousel__ItemWrap-sc-1e0lpax-10 jiodVp']") WebElement Topeducatorprofile;
	@FindBy(xpath = "//div//child::section[8]//div//div[@class='CardCarousel__CarouselWrapper-sc-1e0lpax-4 jllRha']//div//div//child::div[2][@class='CardCarousel__ItemWrap-sc-1e0lpax-10 jiodVp']") WebElement subject_syllabus;
	@FindBy(xpath = "//div//child::a[2]//img[@class='LearnOnTheGo__Img-dlb5bo-6 aLSN']\r\n") WebElement Google_play_icon;
	@FindBy(xpath = "//div//child::section[3]//div//div[@class='CardCarousel__CarouselWrapper-sc-1e0lpax-4 jllRha']//div//div//child::div[2][@class='CardCarousel__ItemWrap-sc-1e0lpax-10 jiodVp']") WebElement Batch_for_syllabus_completion;
	@FindBy(xpath = "//div//child::section[4]//div//div[@class='CardCarousel__CarouselWrapper-sc-1e0lpax-4 jllRha']//div//div//child::div[1][@class='CardCarousel__ItemWrap-sc-1e0lpax-10 jiodVp']") WebElement Course_starting_soon;
	@FindBy(xpath = "//div//child::section[6]//div//div[@class='CardCarousel__CarouselWrapper-sc-1e0lpax-4 jllRha']//div//div//child::div[1][@class='CardCarousel__ItemWrap-sc-1e0lpax-10 jiodVp']") WebElement Best_Of_All_Course;
	@FindBy(xpath = "//div//child::section[8]//div//div[@class='CardCarousel__CarouselWrapper-sc-1e0lpax-4 jllRha']//div//div//child::div[1][@class='CardCarousel__ItemWrap-sc-1e0lpax-10 jiodVp']") WebElement Test_Track_your_preparation;
	@FindBy(xpath = "//h2[text()='Learn on the phone or the computer']") WebElement application_header;
	@FindBy(xpath = "//div[@class='BreadCrumbs__Wrapper-hbycnr-2 gRtBGg']//child::div[1]") WebElement homeNavigtor;
	public Goalhomepage_pom(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
    public void scroll_to_Prepare_with_top_educator_header() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Prepare_with_top_educator_header);
		
	}
    public void scroll_to_Batches_for_syllabus_completion_header() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Batches_for_syllabus_completion_header);
		
	}
    public void scroll_to_Courses_starting_soon_headerCourses_starting_soon_header() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Courses_starting_soon_header);
		
	}
    public void scroll_to_Best_of_all_time_header() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Best_of_all_time_header);
		
	}
    public void scroll_to_Comprehensive_syllabus_header() throws InterruptedException 
    {
    	Thread.sleep(2000);
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Comprehensive_syllabus_header);
		
	}
    public void scroll_to_Track_your_preparation_header() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Track_your_preparation_header);
		Thread.sleep(2000);
	}
    public void scroll_to_Live_class_header() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Live_class_header);
		Thread.sleep(2000);
	}
    public void scroll_to_Application_header() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",Application_header);
		Thread.sleep(2000);
	}
    public void scroll_to_application_header() throws InterruptedException 
    {
    	je =(JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView();",application_header);
		Thread.sleep(2000);
	}
    
	public boolean isgoalselected_in_compitative_exams() 
	{
	
		return Competative_goalhomedropdown.isDisplayed();
	}

	public boolean isgoalselected_in_class6to12() 
	{
		return Class_goalhomedropdown.isDisplayed();
	}

	public boolean isPrepare_with_top_educator_header_displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Prepare_with_top_educator_header);
		return Prepare_with_top_educator_header.isDisplayed();
	}

	public boolean isBatches_for_syllabus_completion_header_diaplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Batches_for_syllabus_completion_header);
		return Batches_for_syllabus_completion_header.isDisplayed();  
	}

	public boolean isCourses_starting_soon_header_diaplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Courses_starting_soon_header);
		return Courses_starting_soon_header.isDisplayed();
	}

	public boolean isBest_of_all_time_header_displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Best_of_all_time_header);
	
		return Best_of_all_time_header.isDisplayed();  
	}

	public boolean isComprehensive_syllabus_header_displayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Comprehensive_syllabus_header);
		Thread.sleep(2000);
		return Comprehensive_syllabus_header.isDisplayed();  
	}

	public boolean isTrack_your_preparation_header_displayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Track_your_preparation_header);
		Thread.sleep(2000);
		return Track_your_preparation_header.isDisplayed();  
	}

	public boolean isLive_class_header_displayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Live_class_header);
		Thread.sleep(2000);
		return Live_class_header.isDisplayed();  
	}

	public boolean isApplication_header_displayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Application_header);
		Thread.sleep(2000);
		return Application_header.isDisplayed();  
	}
	public boolean isapplication_header_displayed() throws InterruptedException
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",application_header);
		Thread.sleep(2000);
		return application_header.isDisplayed();  
	}

	public void click_on_video() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Live_class_header);
		Thread.sleep(2000);
		videosrc.click();
	}
	

	public void click_seeAlllink() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Live_class_header);
		Thread.sleep(2000);
		Seeall_link.click();
	}

	public void  click_on_profile() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Prepare_with_top_educator_header);
		Thread.sleep(2000);
		Topeducatorprofile.click();
	}

	public void click_on_subject() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Comprehensive_syllabus_header);
		Thread.sleep(2000);
		subject_syllabus.click();
	}

	public void click_on_google_icon() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Application_header);
		Thread.sleep(2000);
		Google_play_icon.click();
	}

	public void click_on_batch() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Batches_for_syllabus_completion_header);
		Thread.sleep(2000);
		Batch_for_syllabus_completion.click();
	}

	public void click_on_course() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Courses_starting_soon_header);
		Thread.sleep(2000);
		Course_starting_soon.click();
	}

	public void click_on_bestcourse() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Best_of_all_time_header);
		Thread.sleep(2000);
		Best_Of_All_Course.click();
	}
	public void click_on_test() throws InterruptedException 
	{
		je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView();",Track_your_preparation_header);
		Thread.sleep(2000);
		Test_Track_your_preparation.click();
	}
	
	public String GetTitle() throws InterruptedException 
	{
		Thread.sleep(2000);
	  return driver.getTitle();	
	}
    
	public void navigation() throws InterruptedException 
	{
	   Thread.sleep(4000);
	   driver.navigate().back();
	}
	
	public void CloseMeth() 
	{
	  driver.quit();	
	}
	
	public void click_homenavigator() throws InterruptedException 
	{
		Thread.sleep(2000);
	    homeNavigtor.click();
	}
}
