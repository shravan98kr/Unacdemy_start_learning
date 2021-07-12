package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestCase4 {
  @Test
  public void tc1() 
  {
	  System.out.println("I am test case 1. ");
  }
  @Test
  public void tc2() 
  {
	  System.out.println("I am test case 2. ");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("This is @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod()
  {
   System.out.println("This is @AfterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("This is @BeforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("This is @afterClass()");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("This is @beforeTest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("This is @AfterSuite");
  }

}
