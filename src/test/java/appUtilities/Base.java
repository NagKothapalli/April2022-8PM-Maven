package appUtilities;

import org.openqa.selenium.WebDriver;

import gUtilities.ReadProperties;

public class Base  //WebDriver , AppUtilitiy , GeneralUtility
{
	public WebDriver driver;
	public ReadProperties config;
	public ReadProperties data;
	public ApplicationUtilities utils; 
	public Base()  //Box
	{
		driver = new DriverSetUp().getWebDriver(); //1234
		config = new ReadProperties("TestData/Config.properties");
		String env = config.getData("Environment");
		data = new ReadProperties("TestData/Apsrtc"+env+".properties");
		utils = new ApplicationUtilities(driver); 
		System.out.println("*****************Execution Details******************* ");
		System.out.println("Execution Type :" + config.getData("ExecutionType"));
		if(config.getData("ExecutionType").equalsIgnoreCase("Remote"))
		{
			System.out.println("Operating System  :" + config.getData("Environment"));
			System.out.println("Browser Version :" + config.getData("Environment"));
			System.out.println("Screen Resolution :" + config.getData("Environment"));
		}
		System.out.println("Environment Name :" + config.getData("Environment"));
		System.out.println("Browser Name :" + config.getData("Browser"));
		System.out.println("***************************************************** ");
	}
	

}
