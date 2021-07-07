package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\AppFearure\\Unacademy_Start_Learning_Competative_Exams.feature",
                 glue = {"stepDefinations"},
                 dryRun = false,
                 monochrome = true)
public class TestRunner 
{
  
}








































//tags
//and => @Sanity and @Regression, "@Sanity and @Regression","@Sanity","@Regression"
//or => @Sanity or @Regression, "@Sanity or @Regression"
//not => not @@Sanity , "not @Sanity"