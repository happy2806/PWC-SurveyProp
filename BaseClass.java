package com.pwc.qa.base;

import java.io.FileInputStream;
import org.testng.annotations.Parameters;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.pwc.qa.util.TestUtil;

public class BaseClass {
	
	public static WebDriver driver;
	
     
	public void StartBrowser(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\Edge\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get("URL");
		
		// return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
