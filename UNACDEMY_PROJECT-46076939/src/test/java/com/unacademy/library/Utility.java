package com.unacademy.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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

	public int getNoOfGoalsInExamsSection() throws IOException
	{
		configfileinitialization();
		return Integer.parseInt((props.getProperty("noOfCompitativeGoals")));
	}

	public int getNoOfGoalsInClassSection() throws IOException
	{
		configfileinitialization();
		return Integer.parseInt((props.getProperty("noOfClassGoals")));
	}

	public String getExpectedHomeTitle(String goal) throws IOException
	{
		configfileinitialization();
		String title=null;
		switch (goal) 
		{
		case "IIT JEE":          title =props.getProperty("iitexam");
			                     break;
			                     
		case "Bank Exams":        title =props.getProperty("bankexam");
			                      break;
		case "CBSE Class 9":
			                       title =props.getProperty("cbseclass9");
			                      break;
		case "CBSE Class 12":
			                      title =props.getProperty("cbseclass12");
			                      break;

		}
        return title;
	}
	
	public String getExpectedEducatorTitle(String eductor) throws IOException
	{
		configfileinitialization();
		if(eductor=="Brijesh Jindal")
		{
			return props.getProperty("Brijesh");
		}
		else if(eductor=="Nimisha Bansal")
		{
			return props.getProperty("Nimisha");
		}
		return null;
	}
	
	public String getExpectedSyllabusTitle(String topic) throws IOException
	{
		configfileinitialization();
		if(topic=="Mathematics")
		{
			return props.getProperty("maths");
		}
		else if(topic=="Reasoning")
		{
			return props.getProperty("reasoning");
		}
		return null;
	}
	
	public String getExpectedApplicationTitle(String app) throws IOException
	{
		configfileinitialization();
		if (app=="Play Store") 
		{
			return props.getProperty("google");
		} 
		else if(app=="appStore") 
		{
			return props.getProperty("ios");
		}
		return null;
	}
	
	public String getExpectedBatchTitle(String batch) throws IOException
	{
		configfileinitialization();
		if (batch=="Target 22 Batch: Full NCERT Syllabus") 
		{
			return props.getProperty("target22class9");
		} 
		else if(batch=="MCQs Practice Batch for TERM 1 - Science") 
		{
			return props.getProperty("scienceClass12");
		}
		return null;
	}
	
	public String getExpectedCourseTitle(String course) throws IOException
	{
		configfileinitialization();
		if (course=="Course on French Literature") 
		{
			return props.getProperty("frenchClass9");
		} 
		else if(course=="Detailed Course on Reproduction") 
		{
			return props.getProperty("reproductionclass12");
		}
		return null;
	}
	
	public String getExpectedBestCourseTitle(String best_course) throws IOException
	{
		configfileinitialization();
		if (best_course=="Complete Course on English") 
		{
			return props.getProperty("completeenglishclass9");
		} 
		else if(best_course=="Detailed Course on English") 
		{
			return props.getProperty("detailedenglishclass12");
		}
		return null;
	}
}
