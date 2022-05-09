package pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class CancelTicket
{
	ChromeDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public CancelTicket(ChromeDriver driver) //1234
	{
		this.driver = driver; //1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
		utils = new ApplicationUtilities(driver); //1234
	}
	public void navigateToCancelTicket()
	{
		System.out.println("RC : Navigate to CancelTicket");
		utils.clickElement("//a[@title='Cancel Ticket']");
	}
	public void cancelBusTicket()
	{
		System.out.println("RC : Cancel BusTicket");
		utils.typeText("//input[@class='searchTktCancel'  and @name='id']", "12343567");
	}

}
