package com.pwc.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.util.TestUtil;

public class ClientPage extends BaseClass {
	
	
	@FindBy(xpath ="//a[text()='ABC Company']") 
	public WebElement Client;
	
	@FindBy(xpath ="//*[contains(text(),'Clients')]")
	public WebElement Header;
	
	
	//Initializing Page Objects
	public ClientPage()
	{
    //this.driver= driver;
	 PageFactory.initElements(driver, this);
	}
	
	public String VerifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void ClickOnCompany()
	{
     System.out.println("Click on ABC Company");
		Client.click();
		
	}
}
