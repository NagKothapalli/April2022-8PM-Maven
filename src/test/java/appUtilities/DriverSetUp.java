package appUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import gUtilities.ReadProperties;

public class DriverSetUp
{
	ReadProperties configData;
	WebDriver driver;
	public DriverSetUp()
	{
		configData = new ReadProperties("TestData/Config.properties");
	}
	
	public WebDriver getWebDriver()
	{
		if(configData.getData("ExecutionType").equalsIgnoreCase("LOCAL"))
		{
			driver  = getLocalDriver();
		}
		else if(configData.getData("ExecutionType").equalsIgnoreCase("REMOTE"))
		{
			driver  = getRemoteDriver();
		}
		else
		{
			driver  = getLocalDriver();
		}
		return driver;
	}
	URL url;
	public WebDriver getRemoteDriver()
	{		
		try {
			url = new URL(configData.getData("SaucelabsURL"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("name", configData.getData("ApplicationName"));
	    capabilities.setCapability(CapabilityType.BROWSER_NAME, configData.getData("Browser"));
	    capabilities.setCapability(CapabilityType.VERSION, configData.getData("BrowserVersion"));
	    capabilities.setCapability(CapabilityType.PLATFORM, configData.getData("OS"));
	    capabilities.setCapability("screen-resolution", configData.getData("ScreenResolution"));
	    capabilities.setCapability("username", configData.getData("SaucelabsUserName"));
	    capabilities.setCapability("accessKey", configData.getData("SaucelabsAccessKey"));
		driver = new RemoteWebDriver(url,capabilities);
		return driver;
	}
	public WebDriver getLocalDriver()
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
