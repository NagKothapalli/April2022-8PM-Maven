package com.April2022_8PM_Maven;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
	String expectedValue = "Gmail";
	ChromeDriver driver; //null
	public AppTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//It will open an empty google chrome browser  ,SessionID = 1234
	}
	@Test
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");		
		driver.get("https://gmail.com"); //1234.
		String actualValue = driver.getTitle();
		System.out.println("Title of the application :" + actualValue);
		System.out.println("Current URL :" + driver.getCurrentUrl());
		String sessionID = driver.getWindowHandle();
		System.out.println("Session ID of the window : " + sessionID);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
