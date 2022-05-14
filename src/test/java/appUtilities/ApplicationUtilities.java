package appUtilities;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	JavascriptExecutor js;
	public ApplicationUtilities(WebDriver driver) //1234
	{
		this.driver = driver;
		actions = new Actions(driver); //1234
		wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		js = (JavascriptExecutor)driver ;   
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
	public void clickElement(String myxpath,String objName)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(myxpath)));	
		TakeErrorScreenShot(objName);
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
		TakeErrorScreenShot(txt);
		driver.findElement(By.xpath(myxpath)).sendKeys(txt);
	}	
	
	public void typeText(WebElement element,String txt)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));		
		element.sendKeys(txt);
	}
	String screenshotfilepath;
	public String TakeErrorScreenShot(String fname) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			screenshotfilepath = new File(".").getCanonicalPath() + "\\ScreenShots\\" + fname
					+ new Random().nextInt(9999) + ".png";
			FileUtils.copyFile(scrFile, new File(screenshotfilepath));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scrFile = null;
		return screenshotfilepath;
	}

	public void jsClick(String myxpath)
	{
		System.out.println("JS CLICK EXECUTED");		    		
        WebElement button =driver.findElement(By.xpath(myxpath));		
        js.executeScript("arguments[0].click();", button);
	}
	public void jsScrollDown()
	{
		 //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");	

	}
	

}
