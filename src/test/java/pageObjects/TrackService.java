package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import appUtilities.Base;
import gUtilities.ReadProperties;

public class TrackService
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public TrackService(Base base) //1234
	{
		this.driver = base.driver; //1234
		prop = base.data;
		utils = base.utils; //1234
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
