package com.pwc.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.pages.LoginPage;
import com.pwc.qa.util.TestUtil;

public class loginPageTest extends BaseClass
{
	
LoginPage loginpage = new LoginPage();;


@Test(priority=1)
@Parameters ({"Browser","URL"})

public void initiateBrowser(String Browser,String URL)
{
	StartBrowser(Browser);
	
	
}	
	
	
	@Test(priority=2)
	@Parameters ({"loginemail","loginpass"})
	public void LoginTest(String loginemail,String loginpass)
	{
		try
		{
			loginpage.EnterMail(loginemail);
			loginpage.ClickOnNext();
			loginpage.EnterPass(loginpass);
			loginpage.ClickOnLogin();	
			String CompanyPageTitle= loginpage.ValidateLoginTitle();
			Assert.assertEquals(CompanyPageTitle, "PwC Listen - Authoring","Title is not matched");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}



