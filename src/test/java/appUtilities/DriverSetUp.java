package appUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import gUtilities.ReadProperties;

public class DriverSetUp
{
	ReadProperties configData;
	WebDriver driver;
	public DriverSetUp()
	{
		configData = new ReadProperties("TestData/Config.properties");
	}
	
	public WebDriver getDriver()
	{
		if(configData.getData("Browser").equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else if(configData.getData("Browser").equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\JarFiles\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(configData.getData("Browser").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Softwares\\JarFiles\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	

}
