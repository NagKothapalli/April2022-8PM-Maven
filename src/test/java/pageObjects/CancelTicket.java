package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import appUtilities.Base;
import gUtilities.ReadProperties;

public class CancelTicket
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public CancelTicket(Base base) //1234
	{
		this.driver = base.driver; //1234
		prop = base.data;
		utils = base.utils; //1234
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
