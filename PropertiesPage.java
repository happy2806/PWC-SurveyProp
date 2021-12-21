package com.pwc.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pwc.qa.base.BaseClass;

public class PropertiesPage extends BaseClass {
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'MORE ACTIONS')]")
	public WebElement MoreActions;
	
	//WebElement testDropDown = driver.findElement(By.cssSelector("#mat-menu-panel-1160 > div > span:nth-child(1)"));
	//Select s1= new Select(testDropDown);
	//s1.selectbyVisibilityText("Survey Properties");
	
	
	@FindBy(xpath="//*[contains(text(),'Survey Properties ')]")
	public WebElement Properties;
	
	@FindBy(xpath ="//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c144-1183 ng-pristine ng-valid cdk-text-field-autofill-monitored ng-touched']")
	public WebElement SurveyName;
	
	//Initializing Page Objects
			public PropertiesPage()
			{
			PageFactory.initElements(driver, this);
			}

			
			public String ValidateUrl()
			{
				return driver.getCurrentUrl();
			}
			public void ValidateSurveyProp()
			{		
			MoreActions.click();
			Properties.click();
				}
			
			public void ValidateName(String name)
			{
				SurveyName.sendKeys(name);
			}

}
