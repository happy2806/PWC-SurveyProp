package com.pwc.qa.util;

import java.util.Random;

import com.pwc.qa.base.BaseClass;

public class TestUtil extends BaseClass {
	
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 5;
	
	
	public static void switchToFrame()
	{
		driver.switchTo();
	}

}
