package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import appUtilities.Base;
import gUtilities.ReadProperties;

public class TicketStatus
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public TicketStatus(Base base) //1234
	{
		this.driver = base.driver; //1234
		prop = base.data;
		utils = base.utils; //1234
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
