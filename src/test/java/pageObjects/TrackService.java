package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class TrackService
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public TrackService(WebDriver driver2) //1234
	{
		this.driver = driver2; //1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
		utils = new ApplicationUtilities(driver2); //1234
	}
	public void navigateToTrackService()
	{
		System.out.println("RC : Navigate to TrackService");
		utils.clickElement("//a[@title='Track Service']");
	}
	public void trackBusService()
	{
		System.out.println("RC : Track BusService");
		utils.typeText("//input[@name='serviceCode']", "12343567");
	}

}
