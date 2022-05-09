package pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class TicketStatus
{
	ChromeDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public TicketStatus(ChromeDriver driver) //1234
	{
		this.driver = driver; //1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
		utils = new ApplicationUtilities(driver); //1234
	}
	public void navigateToTicketStatus()
	{
		System.out.println("RC : Navigate to TicketStatus");
		utils.clickElement("//a[@title='Ticket Status']");
	}
	public void checkTicketStatus()
	{
		System.out.println("RC : Check TicketStatus");
		utils.typeText("//input[@class='searchTktCancel'  and @name='id']", "12343567");
	}

}
