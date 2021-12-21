package com.pwc.qa.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.pages.ClientPage;
import com.pwc.qa.pages.CreateSurveyPage;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.pages.PropertiesPage;
import com.pwc.qa.pages.Survey;
import com.pwc.qa.pages.SurveyPropertiesPage;
import com.pwc.qa.util.TestUtil;

public class Properties extends BaseClass {
	
	LoginPage loginpage;
	ClientPage clientid;
	TestUtil testUtil;
	CreateSurveyPage CSP;
	SurveyPropertiesPage survey;
	Survey sv;
	PropertiesPage Property;
	
	
	
	@BeforeMethod
	public void setup()
	{
		StartBrowser();
		testUtil = new TestUtil();
		clientid= new ClientPage();
		CSP = new CreateSurveyPage();
		survey= new SurveyPropertiesPage();
		sv = new Survey();
		Property = new PropertiesPage();
		loginpage = new LoginPage();
		loginpage.CheckLoginCred(prop.getProperty("Email"), prop.getProperty("Password"));
		//testUtil.switchToFrame();
		clientid.ClickonCompany();
	//	testUtil.switchToFrame();
		CSP.CreateSurvey();
		//testUtil.switchToFrame();
		survey.ClickonCreateSurvey();
		//testUtil.switchToFrame();
		sv.EnterSurveyName(prop.getProperty("SurveyName"));
		
	}
	@Test
	public void ValidateProp()
	{    
	  
	 
	  Property.ValidateSurveyProp();
	 // String PageTitle = Property.ValidateUrl();
	 // Assert.assertEquals(PageTitle,"https://start4.quovantis.com/authoring/surveys/3602/operations/properties");
	  
	}
	
	@Test(priority= 2)
	
	public void Name()
	{
	Property.ValidateName(prop.getProperty("SurveyName"));
		Assert.assertEquals(, false);
	}
	
	@AfterTest
	
	public void teardown()
	{ 
		quitBrowser(driver);
	}



}
