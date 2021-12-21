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

public class CreateSurveyTest extends BaseClass{
	
	LoginPage loginpage;
	
	ClientPage clientid;
	TestUtil testUtil;
	CreateSurveyPage CSP;

	

	
	@BeforeMethod
	public void setup()
	{
		//StartBrowser();
		testUtil = new TestUtil();
		clientid= new ClientPage();
		CSP = new CreateSurveyPage();
	      loginpage = new LoginPage();
		//loginpage.CheckLoginCred(prop.getProperty("Email"), prop.getProperty("Password"));
		//testUtil.switchToFrame();
		//clientid.ClickonCompany();
		
	}
	@Test
	public void ClickonCreate()
	{
		try
		{
	  CSP.CreateSurvey();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 Assert.assertTrue(CSP.ValidateCompanyName());
	  
	}
	
	/*@AfterMethod
	public void teardown()
	{ 
		quitBrowser(driver);
	}
*/

}
