package com.unacademy.testng;

import org.testng.annotations.Test;

import com.unacademy.library.ExcelUtility;
import com.unacademy.library.Utility;
import com.unacademy.pom.ChooseYourGoalPageFactory;
import com.unacademy.pom.GoalHomePagePageFactory;
import com.unacademy.pom.StartLearningPageFactory;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNg 
{
	public ChooseYourGoalPageFactory goalpage;
	public GoalHomePagePageFactory homepage;
	public StartLearningPageFactory startlearningpage;
	public ExcelUtility excelutil = new ExcelUtility();
	public Utility util = new Utility();

	@BeforeMethod(groups = {"one","two"})
	public void initialization() throws IOException, InterruptedException 
	{
		System.setProperty(util.getWebDriver(),util.getExecutor());
		WebDriver driver=new ChromeDriver();
		goalpage= new ChooseYourGoalPageFactory(driver);
		homepage = new GoalHomePagePageFactory(driver);
		startlearningpage = new StartLearningPageFactory(driver);
		driver.manage().window().maximize();
		driver.get(util.getBaseUrl());
		util.waitMetod(2);
	}

	@AfterMethod(groups = {"one","two"})
	public void termination() 
	{
		homepage.quit();
	}

	@DataProvider(name ="excel-data1")
	public Object[][] excelDP1() throws IOException
	{
		//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
		Object[][] arrObj =excelutil.getExcelData(util.getExcelSheetPath(),util.getExcelSheet1Name());
		return arrObj;
	}

	@DataProvider(name ="excel-data2")
	public Object[][] excelDP2() throws IOException
	{
		//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
		Object[][] arrObj =excelutil.getExcelData(util.getExcelSheetPath(),util.getExcelSheet2Name());
		return arrObj;
	}

	@Test(dataProvider ="excel-data1",groups = "one")
	public void choosingGoalInCompitativeExams(String goal,String educator,String syllabus,String app) throws InterruptedException   
	{
		startlearningpage.clickStartLearnComptitiveCmd();
		Assert.assertEquals(goalpage.noOfGoals(),util.noOfGoalsInExams()); 
		goalpage.clickOnGoal(goal);
		util.waitMetod(4);
		Assert.assertEquals(homepage.getTitle().contains(goal.substring(0,5)),true);
		homepage.scrollToLiveClassHeader();

		//Exploring different features in goal home page
		homepage.scrollToPrepareWithTopEducatorHeader();
		homepage.scrollToBatchesForSyllabusCompletionHeader();
		homepage.scrollToCoursesStartingSoonHeader();
		homepage.scrollToBestOfAllTimeHeader();
		homepage.scrollToComprehensiveSyllabusHeader();
		homepage.scrollToTrackYourPreparationHeader();
		homepage.scrollToApplicationHeader();

		Assert.assertEquals(homepage.isLiveClassHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isPrepareWithTopEducatorHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBatchesForSyllabusCompletionHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isCoursesStartingSoonHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBestOfAllTimeHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isComprehensiveSyllabusHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isTrackYourPreparationHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isApplicationHeaderDisplayed(),true);

		//Exploring Prepare With Top Educator Section
		homepage.scrollToPrepareWithTopEducatorHeader();
		Assert.assertEquals(homepage.isPrepareWithTopEducatorHeaderDisplayed(),true);
		homepage.clickOnProfile(educator);
		util.waitMetod(3);
		Assert.assertEquals(homepage.getTitle().contains(educator),true);
		homepage.navigation();
		//Exploring Comprehensive Syllabus Section
		homepage.scrollToComprehensiveSyllabusHeader();
		Assert.assertEquals(homepage.isComprehensiveSyllabusHeaderDisplayed(),true);
		homepage.clickOnSubject(syllabus);
		util.waitMetod(3);
		Assert.assertEquals(homepage.getTitle().contains(syllabus),true);
		homepage.navigation();
		//Exploring Get The Learning Application Section
		homepage.scrollToApplicationHeader();
		Assert.assertEquals(homepage.isApplicationHeaderDisplayed(),true);
		homepage.clickOnAppIcon(app);
		util.waitMetod(3);
		Assert.assertEquals(homepage.getTitle().contains(goal.substring(0,5)),true);
	}

	@Test(dataProvider ="excel-data2",groups = "two")
	public void choosingGoalInClass6To12(String goal,String batch,String course,String best_course) throws InterruptedException   
	{
		startlearningpage.clickStartLearnClass6to12Cmd();
		Assert.assertEquals(goalpage.noOfGoals(),util.noOfGoalsInClass()); 
		goalpage.clickOnGoal(goal);
		util.waitMetod(4);
		Assert.assertEquals(homepage.getTitle().contains(goal.substring(0,5)),true);
		homepage.scrollToLiveClassHeader();
		//Exploring different features in goal home page
		homepage.scrollToPrepareWithTopEducatorHeader();
		homepage.scrollToBatchesForSyllabusCompletionHeader();
		homepage.scrollToCoursesStartingSoonHeader();
		homepage.scrollToBestOfAllTimeHeader();
		homepage.scrollToComprehensiveSyllabusHeader();
		homepage.scrollToTrackYourPreparationHeader();
		homepage.scrollToAppHeader();

		Assert.assertEquals(homepage.isLiveClassHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isPrepareWithTopEducatorHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBatchesForSyllabusCompletionHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isCoursesStartingSoonHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isBestOfAllTimeHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isComprehensiveSyllabusHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isTrackYourPreparationHeaderDisplayed(),true);
		Assert.assertEquals(homepage.isAppHeaderDisplayed(),true);

		//Exploring Batches For Syllabus Completion Section
		homepage.scrollToBatchesForSyllabusCompletionHeader();
		Assert.assertEquals(homepage.isBatchesForSyllabusCompletionHeaderDisplayed(),true);
		homepage.clickOnBatch(batch);
		Assert.assertEquals(homepage.getTitle().contains(batch),true);
		homepage.navigation();
		//Exploring Courses Starting Soon Section
		homepage.scrollToCoursesStartingSoonHeader();
		Assert.assertEquals(homepage.isCoursesStartingSoonHeaderDisplayed(),true);
		homepage.clickOnCourse(course);
		Assert.assertEquals(homepage.getTitle().contains(course),true);
		homepage.clickOnHomeNavigationHeader(goal);   
		//Exploring Best Of All Time Section
		homepage.scrollToBestOfAllTimeHeader();
		Assert.assertEquals(homepage.isBestOfAllTimeHeaderDisplayed(),true);
		homepage.clickOnBestcourse(best_course);
		Assert.assertEquals(homepage.getTitle().contains(best_course),true);

	}
	//two testng xml-include tags
	//parallel excetion 
	//jenkins

}
