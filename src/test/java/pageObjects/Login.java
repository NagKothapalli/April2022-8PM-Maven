package pageObjects;

import org.openqa.selenium.WebDriver;
import appUtilities.ApplicationUtilities;
import gUtilities.ReadProperties;

public class Login
{
	WebDriver driver; //null
	ReadProperties prop;
	ApplicationUtilities utils;
	public Login(WebDriver driver2) //1234
	{
		this.driver = driver2; //1234
		prop = new ReadProperties("TestData/ApsrtcDev.properties");
		utils = new ApplicationUtilities(driver2); //1234
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get(prop.getData("URL"));
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
		driver.manage().window().maximize();
	}

	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
		utils.clickElement("//a[@title='Home']");
	}

	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}


}
