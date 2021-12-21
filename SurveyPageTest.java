package com.pwc.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.pages.ClientPage;
import com.pwc.qa.pages.CreateSurveyPage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.pages.Survey;
import com.pwc.qa.pages.SurveyPropertiesPage;
import com.pwc.qa.util.TestUtil;

public class SurveyPageTest extends BaseClass {
	
	LoginPage loginpage;
	ClientPage clientid;
	TestUtil testUtil;
	CreateSurveyPage CSP;
	SurveyPropertiesPage survey;
	Survey sv;
	
	
	
	@BeforeMethod
	public void setup()
	{
		StartBrowser();
		testUtil = new TestUtil();
		clientid= new ClientPage();
		CSP = new CreateSurveyPage();
		survey= new SurveyPropertiesPage();
		sv = new Survey();
		loginpage = new LoginPage();
		loginpage.EnterMail(prop.getProperty("Email"));
		loginpage.ClickOnNext();
		loginpage.EnterPass(prop.getProperty("Password"));
		loginpage.ClickOnLogin();
		testUtil.switchToFrame();
		clientid.ClickOnCompany();
		testUtil.switchToFrame();
		CSP.CreateSurvey();
		testUtil.switchToFrame();
		survey.ClickOnNew();
		survey.ClickOnNext();
		
		
	}
	@Test
	public void SurveyName()
	{
	  try
	  {
		  sv.EnterSurveyName();
	      sv.ClickOnConfirm();
	      
	      
	  }
	 catch(Exception e) 
	  {
		 e.getCause();
		 e.printStackTrace();
	  }
	  
	  String NewText=sv.EnterSurveyName();
	 Assert.assertEquals(sv.ValidateSurveyTitleName(),NewText);
	 
	 
	}
	
	@AfterMethod
	
	public void teardown()
	{ 
		quitBrowser(driver);
	}


}
