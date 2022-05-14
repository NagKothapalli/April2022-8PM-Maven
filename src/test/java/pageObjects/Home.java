package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import appUtilities.Base;
import gUtilities.ReadProperties;

public class Home
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public Home(Base base) //1234
	{
		this.driver = base.driver; //1234
		prop = base.data;
		utils = base.utils; //1234
	}
	
	public void navigateToHome()
	{
		System.out.println("RC : Navigate to Home");	
		utils.clickElement("//a[@title='Home']");
	}
	public void bookTicket()
	{
		System.out.println("RC : Book Ticket");
		utils.typeText("//input[@name='source']", prop.getData("FromCity"));
		utils.fixedWait(1);
		utils.clickEnter();
		utils.typeText("//input[@name='destination']", prop.getData("ToCity"));
		utils.fixedWait(1);
		utils.clickEnter();
		utils.clickElement("//input[@name='txtJourneyDate']","Home");
		utils.clickElement("//a[text()='"+prop.getData("JDate")+"']");
		//utils.clickElement("//input[@value='Check Availability']");
		utils.jsClick("//input[@value='Check Availability']");
	}
	
	public void printTicket()
	{
		System.out.println("RC : Print Ticket");
	}

}
