package com.pwc.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
import com.pwc.qa.util.TestUtil;

public class ClientIdTest extends BaseClass {
	
	ClientPage clientid;
	TestUtil testUtil;
	LoginPage loginpage;
	
	
	
	@BeforeMethod
	public void setup()
	{
        //StartBrowser();
		testUtil = new TestUtil();
		clientid= new ClientPage();
		loginpage= new LoginPage();
		/*loginpage.EnterMail(prop.getProperty("Email"));
		loginpage.ClickOnNext();
		loginpage.EnterPass(prop.getProperty("Password"));
		loginpage.ClickOnLogin();
		*/
		
		
	}
	
	@Test
	public void ABCCompany()
	{
		try
		{
			clientid.ClickOnCompany();
			String header=clientid.VerifyUrl();
			Assert.assertEquals(header, "https://start4.quovantis.com/authoring/clients/1/surveys");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
			
		}
		 
	}
	
	
}
