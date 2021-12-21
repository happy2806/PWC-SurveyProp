package com.pwc.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	
	@FindBy(id ="email") 
	public WebElement Email;
	
	@FindBy(id = "next") 
	public WebElement Next;
	
	@FindBy(id ="password") 
	public WebElement pass;
	
	@FindBy(id ="login") 
	public WebElement LoginButton;
	
	@FindBy(xpath ="//span[@class=\"primary-text-color m-l-5 font-14\"]")
	public WebElement Logo;
	
	//Initializing the page objects
	
	public LoginPage() 
	{
	PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String ValidateLoginTitle()
	{
		return driver.getTitle();
	}
	
	
	public  void  EnterMail(String loginemail)
	{
		System.out.println("Enter you Login Email");
		Email.sendKeys(loginemail);
		
	}
	
	public void ClickOnNext() 
	{
		System.out.println("Click on Next Button to Enter the Password");
		Next.click();
	}
	
	public void EnterPass(String loginpass)
	{
		System.out.println("Enter you Login Password");
		pass.sendKeys(loginpass);
	}
	
	public void ClickOnLogin() 
	{
		System.out.println("Click on Login Button");
		LoginButton.click();
	System.out.println("Login is Successful")	;
	}
	
}
