package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	ChromeDriver driver; //null
	public Login(ChromeDriver driver) //1234
	{
		this.driver = driver; //1234
		
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get("https://www.apsrtconline.in/");
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
		driver.manage().window().maximize();
	}

	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}

	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}


}
