package appUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationUtilities
{
	//click Enter , Click Tab  , Double Click , Right Click , MouseHover etc.....
	WebDriver driver; //null
	Actions actions;
	WebDriverWait wait;	
	String name; //null
	public ApplicationUtilities(WebDriver driver) //1234
	{
		this.driver = driver;
		actions = new Actions(driver); //1234
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	}
	
	public void fixedWait(int sec)
	{
		try {
			Thread.sleep(1000 * sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	public void clickTab()
	{
		actions.sendKeys(Keys.TAB).build().perform();
	}
	public void doubleClick(WebElement element)
	{
		actions.moveToElement(element).doubleClick().build().perform();
	}
	public void rightClick(WebElement element)
	{
		actions.moveToElement(element).contextClick().build().perform();
	}
	public void mouseHover(WebElement element)
	{
		actions.moveToElement(element).build().perform();
	}
	public void clickElement(String myxpath)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath)));		
		driver.findElement(By.xpath(myxpath)).click();
	}
	public void clickElement(WebElement element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		mouseHover(element);
		element.click();
	}	
	public void typeText(String myxpath,String txt)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath)));		
		driver.findElement(By.xpath(myxpath)).sendKeys(txt);
	}	
	public void typeText(WebElement element,String txt)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));		
		element.sendKeys(txt);
	}
	

}
