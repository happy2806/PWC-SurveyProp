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

public class SurveyPropTest extends BaseClass{
	
	LoginPage loginpage;
	//ClientPage clientpage;
	ClientPage clientid;
	TestUtil testUtil;
	CreateSurveyPage CSP;
	SurveyPropertiesPage survey;
	
	
	@BeforeMethod
	public void setup()
	{
		//StartBrowser();
		testUtil = new TestUtil();
		clientid= new ClientPage();
		CSP = new CreateSurveyPage();
		survey= new SurveyPropertiesPage();
		loginpage = new LoginPage();
		/*loginpage.CheckLoginCred(prop.getProperty("Email"), prop.getProperty("Password"));
		testUtil.switchToFrame();
		clientid.ClickonCompany();
		testUtil.switchToFrame();
		CSP.CreateSurvey();
		*/
		
	}
	
	
	@Test
	public void SurveyPropTest()
	{
	  try
	  {
		  survey.ClickOnNew();
		  System.out.println("Welcome to New Survey Page");
		  survey.ClickOnNext();
		  
	  }
	 catch(Exception e)
	  {
		 e.printStackTrace();
		 System.out.println(e);
	  }
	  
	  String url = survey.ValidateCreateSurveyUrl();
	  Assert.assertEquals(url, "https://start4.quovantis.com/authoring/surveys/create");
	}
	
}
