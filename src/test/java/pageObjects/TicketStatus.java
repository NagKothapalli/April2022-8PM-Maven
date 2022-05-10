package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class TicketStatus
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public TicketStatus(WebDriver driver2) //1234
	{
		this.driver = driver2; //1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
		utils = new ApplicationUtilities(driver2); //1234
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
