package stepDefinations;




import static org.testng.Assert.assertEquals;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Choose_Your_Goal_pom;
import pom.Goalhomepage_pom;
import pom.LiveVideoPom;
import pom.Start_learningPagepom;

public class StartLearning_Compitative_Exams_Steps
{  
	
  public WebDriver driver;
  Choose_Your_Goal_pom goal;
  Goalhomepage_pom home ;
  LiveVideoPom video;
  Start_learningPagepom start;
  String baseUrl="https://unacademy.com/?utm_source=google&utm_medium=cpc&utm_campaign=11751576405&utm_term=unacademy&utm_content={content}&gclid=CjwKCAjwz_WGBhA1EiwAUAxIcXf8YJo3gOsqGN0rJ3CRFx8f_9AxuON8k6cq443v9bmwp5le13jK7hoCT1AQAvD_BwE";
//  Properties prop;
//  FileInputStream ip;
 
	@Before
	public void Inintialization() throws IOException
	{
		//prop = new Properties();
		//ip = new FileInputStream("\\UNACDEMY_PROJECT-46076939\\config.properties");
		//prop.load(ip);
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		   goal= new Choose_Your_Goal_pom(driver);
		   home = new Goalhomepage_pom(driver);
		   video = new LiveVideoPom(driver);
		   start = new Start_learningPagepom(driver);
	}

	@Given("browser is launched")
	public void browser_is_launched()  
	{
		
		driver.manage().window().maximize();
	}

	@Given("User is on Unacdemy page")
	public void user_is_on_Unacdemy_page() 
	{
		driver.get(baseUrl);
		System.out.println(start.gettitel());
	}

	@When("user clicks on Prepare for Competitive exams Start Learning button")
	public void user_clicks_on_Prepare_for_Competitive_exams_Start_Learning_button() throws InterruptedException 
	{
	    start.clickStartLearnCompCmd();
	}

	@Then("user is on Choose your goal page where the list of topics are displayed")
	public void user_is_on_Choose_your_goal_page_where_the_list_of_topics_are_displayed()
	{
       System.out.println(goal.GetTitle());
       int expected = 19;
       Assert.assertEquals(goal.no_of_goals_CompetativeExams(), expected);
	}

	@When("user clicks on a Bank Exams to be the goal")
	public void user_clicks_on_a_Bank_Exams_to_be_the_goal() 
	{
	   goal.click_Competativegoal();
	}

	@Then("user is on goal home page")
	public void user_is_on_goal_home_page() throws InterruptedException 
	{
	   System.out.println(home.GetTitle());
	  Assert.assertEquals(home.isgoalselected_in_compitative_exams(),true);
	}

	@When("user scrolls down on home to verify different sections are present")
	public void user_scrolls_down_on_home_to_verify_different_sections_are_present() throws InterruptedException 
	{
	   home.scroll_to_Live_class_header();
	   home.scroll_to_Prepare_with_top_educator_header();
	   home.scroll_to_Batches_for_syllabus_completion_header();
	   home.scroll_to_Courses_starting_soon_headerCourses_starting_soon_header();
	   home.scroll_to_Best_of_all_time_header();
	   home.scroll_to_Comprehensive_syllabus_header();
	   home.scroll_to_Track_your_preparation_header();
	   home.scroll_to_Application_header();
	}

	@Then("user can see sections like What youll get Section,Free Live classes Section,Prepare With Top Educators and so on")
	public void user_can_see_sections_like_What_youll_get_Section_Free_Live_classes_Section_Prepare_With_Top_Educators_and_so_on() throws InterruptedException 
	{
	  Assert.assertEquals(home.isLive_class_header_displayed(),true);
	  Assert.assertEquals(home.isPrepare_with_top_educator_header_displayed(),true);
	  Assert.assertEquals(home.isBatches_for_syllabus_completion_header_diaplayed(),true);
	  Assert.assertEquals(home.isCourses_starting_soon_header_diaplayed(),true);
	  Assert.assertEquals(home.isBest_of_all_time_header_displayed(),true);
	  Assert.assertEquals(home.isComprehensive_syllabus_header_displayed(),true);
	  Assert.assertEquals(home.isTrack_your_preparation_header_displayed(),true);
	  Assert.assertEquals(home.isApplication_header_displayed(),true);
	  System.out.println("____________________________________________________________________");
	}

	@When("user scrolls to find Free Live classes section")
	public void user_scrolls_to_find_Free_Live_classes_section() throws InterruptedException
	{
	   home.scroll_to_Live_class_header();
	}

	@Then("user is on Free Live classes section")
	public void user_is_on_Free_Live_classes_section() throws InterruptedException 
	{
		 Assert.assertEquals(home.isLive_class_header_displayed(),true);
	}

	@When("user clicks on the video present in Free Live Classes Section")
	public void user_clicks_on_the_video_present_in_Free_Live_Classes_Section() throws InterruptedException
	{
	   home.click_on_video();
	}

	@Then("user is on video page")
	public void user_is_on_video_page() throws InterruptedException
	{
	    
	}

	@Then("user clicks on back arrow mark")
	public void user_clicks_on_back_arrow_mark() throws InterruptedException 
	{
	  video.ClickBack(); 
	}

	@Then("user is on Online Free Classes Page")
	public void user_is_on_Online_Free_Classes_Page() throws InterruptedException 
	{
	  video.GetTitle();   
	}

	@Then("user clicks on Home link on side bar")
	public void user_clicks_on_Home_link_on_side_bar() throws InterruptedException 
	{
      video.ClickHomeLink();
	}

	@Then("user clicks on See all link to explore all Free classes and Free Test Series")
	public void user_clicks_on_See_all_link_to_explore_all_Free_classes_and_Free_Test_Series() throws InterruptedException 
	{
        home.click_seeAlllink();	   
	}

	@When("user scrolls to find Prepare With Top Educators Section")
	public void user_scrolls_to_find_Prepare_With_Top_Educators_Section() throws InterruptedException 
	{
	   home.scroll_to_Prepare_with_top_educator_header(); 
	}

	@Then("user is on Prepare With Top Educators Section")
	public void user_is_on_Prepare_With_Top_Educators_Section() throws InterruptedException
	{
		 Assert.assertEquals(home.isPrepare_with_top_educator_header_displayed(),true);
	}

	@When("user clicks on profile of Nimisha Bansal")
	public void user_clicks_on_profile_of_Nimisha_Bansal() throws InterruptedException 
	{
	   home.click_on_profile();    
	}

	@Then("user is on the profile page of the Nimisha Bansal")
	public void user_is_on_the_profile_page_of_the_Nimisha_Bansal() throws InterruptedException 
	{
	   home.GetTitle();
	}

	@When("user scrolls to find  Comprehensive syllabus section on home page")
	public void user_scrolls_to_find_Comprehensive_syllabus_section_on_home_page() throws InterruptedException 
	{
	   home.scroll_to_Comprehensive_syllabus_header();
	}

	@Then("user can see different topics in the Comprehensive syllabus section")
	public void user_can_see_different_topics_in_the_Comprehensive_syllabus_section() throws InterruptedException 
	{
		 Assert.assertEquals(home.isComprehensive_syllabus_header_displayed(),true);
	}

	@When("user clicks on the Reasoning topic")
	public void user_clicks_on_the_Reasoning_topic() throws InterruptedException 
	{
	   home.click_on_subject();    
	}

	@Then("user is navigated to the syllabus page of the respective topic")
	public void user_is_navigated_to_the_syllabus_page_of_the_respective_topic() throws InterruptedException 
	{
	   System.out.println(home.GetTitle());    
	}

	
	@When("user scrolls to find Get the Learning App Section")
	public void user_scrolls_to_find_Get_the_Learning_App_Section() throws InterruptedException 
	{
	   home.scroll_to_Application_header();    
	}

	@Then("user  can see icons to download the app from App Store and Google Play")
	public void user_can_see_icons_to_download_the_app_from_App_Store_and_Google_Play() throws InterruptedException 
	{
		 Assert.assertEquals(home.isApplication_header_displayed(),true);
	}

	@When("user clicks on Get It On Google Play icon")
	public void user_clicks_on_Get_It_On_Google_Play_icon() throws InterruptedException
	{
	  home.click_on_google_icon();    
	}

	@Then("user is on Google Play Installation Page")
	public void user_is_on_Google_Play_Installation_Page() throws InterruptedException 
	{
	    home.GetTitle();
	}

	@When("user navigates to goal home page")
	public void user_navigates_to_goal_home_page() throws InterruptedException 
	{
	    home.navigation();    
	}
	@After
	public void Home()
	{
		home.CloseMeth();
	}
	
	@When("user clicks on Prepare for Class {int} to {int} Start Learning button")
	public void user_clicks_on_Prepare_for_Class_to_Start_Learning_button(Integer int1, Integer int2) throws InterruptedException 
	{
	       start.clickStartLearnClassCmd();
	}

	@When("user clicks on a Class {int} CBSE to be the goal")
	public void user_clicks_on_a_Class_CBSE_to_be_the_goal(Integer int1) throws InterruptedException 
	{
	    goal.click_Classgoal();
	}

	@When("user scrolls down to find Batches for syllabus completion section")
	public void user_scrolls_down_to_find_Batches_for_syllabus_completion_section() throws InterruptedException 
	{
	  home.scroll_to_Batches_for_syllabus_completion_header();
	}

	@Then("user is on Choose your goal page where the list of goals of Class {int} to {int} are displayed")
	public void user_is_on_Choose_your_goal_page_where_the_list_of_goals_of_Class_to_are_displayed(Integer int1, Integer int2) 
	{
	   int expected = 5;
	   Assert.assertEquals(goal.no_of_goals_Class6to12(), expected);
	}

	@Then("user is on Goal Home page")
	public void user_is_on_Goal_Home_page() throws InterruptedException 
	{
		 System.out.println(home.GetTitle());
		  Assert.assertEquals(home.isgoalselected_in_class6to12(),true);
	}

	@When("user scrolls down on home to view different sections are present")
	public void user_scrolls_down_on_home_to_view_different_sections_are_present() throws InterruptedException
	{
		 home.scroll_to_Live_class_header();
		   home.scroll_to_Prepare_with_top_educator_header();
		   home.scroll_to_Batches_for_syllabus_completion_header();
		   home.scroll_to_Courses_starting_soon_headerCourses_starting_soon_header();
		   home.scroll_to_Best_of_all_time_header();
		   home.scroll_to_Comprehensive_syllabus_header();
		   home.scroll_to_Track_your_preparation_header();
		   home.scroll_to_application_header();
	}

	@Then("user can see sections like Free Live classes Section,Prepare With Top Educators and so on")
	public void user_can_see_sections_like_Free_Live_classes_Section_Prepare_With_Top_Educators_and_so_on() throws InterruptedException 
	{
		Assert.assertEquals(home.isLive_class_header_displayed(),true);
		  Assert.assertEquals(home.isPrepare_with_top_educator_header_displayed(),true);
		  Assert.assertEquals(home.isBatches_for_syllabus_completion_header_diaplayed(),true);
		  Assert.assertEquals(home.isCourses_starting_soon_header_diaplayed(),true);
		  Assert.assertEquals(home.isBest_of_all_time_header_displayed(),true);
		  Assert.assertEquals(home.isComprehensive_syllabus_header_displayed(),true);
		  Assert.assertEquals(home.isTrack_your_preparation_header_displayed(),true);
		  Assert.assertEquals(home.isapplication_header_displayed(),true);
	}

	@Then("user is on Batches for syllabus completion section")
	public void user_is_on_Batches_for_syllabus_completion_section() throws InterruptedException 
	{
		  Assert.assertEquals(home.isBatches_for_syllabus_completion_header_diaplayed(),true);
	}

	@When("user clicks on MCQ Practice Batch for Term-{int}")
	public void user_clicks_on_MCQ_Practice_Batch_for_Term(Integer int1) throws InterruptedException 
	{
	   home.click_on_batch();
	}

	@Then("user is on MCQs Practice Batch for TERM {int} - Science")
	public void user_is_on_MCQs_Practice_Batch_for_TERM_Science(Integer int1) throws InterruptedException 
	{
	   home.GetTitle();
	}

	@When("user scrolls down to find Courses starting soon section")
	public void user_scrolls_down_to_find_Courses_starting_soon_section() throws InterruptedException 
	{
		home.scroll_to_Courses_starting_soon_headerCourses_starting_soon_header();
	}

	@Then("user is on Courses starting soon section")
	public void user_is_on_Courses_starting_soon_section() throws InterruptedException {
		Assert.assertEquals(home.isCourses_starting_soon_header_diaplayed(),true);
	}

	@When("user clicks on Capsule course on inverse trignometry")
	public void user_clicks_on_Capsule_course_on_inverse_trignometry() throws InterruptedException 
	{
	    home.click_on_course();
	}

	@Then("user is on Capsule course on inverse trignometry page")
	public void user_is_on_Capsule_course_on_inverse_trignometry_page() throws InterruptedException {
	   home.GetTitle();
	}

	@When("user scrolls down to find Best of all time section")
	public void user_scrolls_down_to_find_Best_of_all_time_section() throws InterruptedException {
		 home.scroll_to_Best_of_all_time_header();
	}

	@Then("user is on Best of all time section")
	public void user_is_on_Best_of_all_time_section() throws InterruptedException {
		Assert.assertEquals(home.isBest_of_all_time_header_displayed(),true);
	}

	@When("user clicks on Detailed Course On English")
	public void user_clicks_on_Detailed_Course_On_English() throws InterruptedException {
	    home.click_on_bestcourse();
	}

	@Then("user is on Detailed Course On English page")
	public void user_is_on_Detailed_Course_On_English_page() throws InterruptedException {
	   home.GetTitle();
	}

	@When("user scrolls down to find Track your preparation section")
	public void user_scrolls_down_to_find_Track_your_preparation_section() throws InterruptedException {
		 home.scroll_to_Track_your_preparation_header();
	}

	@Then("user is on Track Your Preparation section")
	public void user_is_on_Track_Your_Preparation_section() throws InterruptedException {
		 Assert.assertEquals(home.isTrack_your_preparation_header_displayed(),true);
	}

	
	@When("user clicks on Acadamic Skill Set Test")
	public void user_clicks_on_Acadamic_Skill_Set_Test() throws InterruptedException {
		home.click_on_test();
	}

	@Then("user is on Acadamic Skill Set Test Enrollment Page")
	public void user_is_on_Acadamic_Skill_Set_Test_Enrollment_Page() throws InterruptedException {
		home.GetTitle();
	}


	@When("user navigates to back goal home page")
	public void user_navigates_to_back_goal_home_page() throws InterruptedException {
		home.click_homenavigator();
	}

}
