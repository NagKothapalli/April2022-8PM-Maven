package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class Home
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public Home(WebDriver driver) //1234
	{
		this.driver = driver; //1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
		utils = new ApplicationUtilities(driver); //1234
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
		utils.clickElement("//input[@name='txtJourneyDate']");
		utils.clickElement("//a[text()='"+prop.getData("JDate")+"']");
		utils.clickElement("//input[@value='Check Availability']");
	}
	
	public void printTicket()
	{
		System.out.println("RC : Print Ticket");
	}

}
