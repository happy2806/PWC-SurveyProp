package com.pwc.qa.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pwc.qa.base.BaseClass;
import com.pwc.qa.util.TestUtil;

public class Survey extends BaseClass {
	
	TestUtil testutil= new TestUtil();
	
	@FindBy(id= "mat-input-2") WebElement SurveyName;
	@FindBy(xpath="//*[contains(text(),'Confirm')]") WebElement Confirm;
	
	@FindBy (xpath="//span[@class='font-14 app-medium primary-text-color survey-title text-truncate ng-star-inserted']")
	public WebElement Text;
	
	
	
	//Initializing Page Objects
		public Survey()
		{
		PageFactory.initElements(driver, this);
		}
       
		
		public String ValidateSurveyTitleName()
		{ 
			return Text.getText();
		}
			
		public String EnterSurveyName()
		{
			String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
			String randomString = "";
			int length= 5;
			
			Random ran= new Random();
			//int length= ran.nextInt(15);
			
			char[] text= new char[length];
			for(int i=0;i<length;i++)
			{
				text[i]= Characters.charAt(ran.nextInt(Characters.length()));
			}
			for(int i=0;i<text.length;i++)
			{
				randomString += text[i];
			}
			
			System.out.println("Enter Survey Name");
			System.out.println(randomString);
			SurveyName.sendKeys(randomString);
			return randomString;
			
		}
		
		
		public void ClickOnConfirm()
		{
			System.out.println("Click on Confirm");
			Confirm.click();
}


		
}
