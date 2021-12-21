package com.pwc.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.util.TestUtil;

public class SurveyPropertiesPage extends BaseClass {
	
@FindBy(xpath = "//div[@class ='survey-card bg-card m-b-30 selected']") WebElement newsurvey ;
@FindBy(xpath = "//span[contains(text(),'Next')]") WebElement Next;
	
	
	//Initializing Page Objects
	public SurveyPropertiesPage()
	{
	PageFactory.initElements(driver, this);
	}

	public String ValidateCreateSurveyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void ClickOnNew()
	{
		System.out.println("Click on New Survey Checkbox");
		newsurvey.click();
	}
	
	public void ClickOnNext()
	{
		System.out.println("Click on Next Button");
		Next.click();
}
}
