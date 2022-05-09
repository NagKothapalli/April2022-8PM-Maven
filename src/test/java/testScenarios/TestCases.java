package testScenarios;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

public class TestCases
{
	ChromeDriver driver; //null
	Login login ; //1234
	Home home ;
	TicketStatus ticketStatus ;
	CancelTicket cancelTicket ;
	TrackService trackService ;
	public TestCases()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //1234
		login = new Login(driver); //1234
		home = new Home(driver);
		ticketStatus = new TicketStatus(driver);
		cancelTicket = new CancelTicket(driver);
		trackService = new TrackService(driver);
	}
	
	
	//BookTicket , Print , Check Status , Cancel Ticket
	@Test
	public void bookTicketAndPrint()
	{
		System.out.println("TestCase : BookTicketAndPrint ");
		//launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookTicketAndCheckStatus()
	{
		System.out.println("TestCase : BookTicketAndCheckStatus ");
		//launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
		
	}
	@Test
	public void bookTicketAndCancelTicket()
	{
		System.out.println("TestCase : BookTicketAndCancelTicket ");
		//launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelBusTicket();
		login.logoutFromApplication();
		login.closeApplication();
		
	}
	@Test
	public void bookTicketAndTrackService()
	{
		System.out.println("TestCase : BookTicketAndTrackService ");
		//launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		trackService.navigateToTrackService();
		trackService.trackBusService();
		login.logoutFromApplication();
		login.closeApplication();
		
	}
	@Test
	public void bookTicketCheckStatusAndPrint()
	{
		System.out.println("TestCase : BookTicketCheckStatusAndPrint ");
		//launch , login , bookTicket , print , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();		
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}

}
