package pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose_Your_Goal_pom
{
	JavascriptExecutor je ;
	public WebDriver driver;

	@FindBy(xpath = "//ul[@class='GoalGroupNav__GoalGroupNavContainer-kdz8jf-0 HQHYn']//child::li") List<WebElement> Comp_goal_list;
	@FindBy(xpath = "//p[text()='Bank Exams']") WebElement CompgoalOpt;
	@FindBy(xpath="//p[text()='CBSE Class 12']") WebElement ClassgoalOpt;
	@FindBy(xpath = "//ul[@class='GoalGroupNav__GoalGroupNavContainer-kdz8jf-0 HQHYn']//child::li") List<WebElement> Class_goal_list;

	public Choose_Your_Goal_pom(WebDriver driver) 
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_Competativegoal() 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		je =(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,300)");
		CompgoalOpt.click();
	}

	public void click_Classgoal() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		je =(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		ClassgoalOpt.click();
	}

	public int no_of_goals_CompetativeExams() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return Comp_goal_list.size();
	}

	public int no_of_goals_Class6to12() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return Class_goal_list.size();
	}

	public String GetTitle() 
	{
		return driver.getTitle();	
	}
	
	
}
