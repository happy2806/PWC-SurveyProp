package com.pwc.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.util.TestUtil;

public class CreateSurveyPage extends BaseClass {
	
	WebDriverWait wait;
	
	@FindBy (xpath ="//span[text()='ABC Company']")
	public WebElement ABC;
	
//@FindBy(xpath ="/html/body/app-root/div/div/app-survey-listing/div/div/div/div/div[1]/div[2]/button/span[1]") WebElement Survey;
	
	
	//Initializing Page Objects
	public CreateSurveyPage()
	{
	PageFactory.initElements(driver, this);
	}


	
	public boolean ValidateCompanyName()
	{
		return ABC.isDisplayed();
	}
	public void CreateSurvey()
	{
		System.out.println("Click on Create Survey");
		wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), ' Create Survey ')]"))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		
	}

}
