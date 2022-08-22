package logoutDiv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class Viewinvoice extends BaseInit {
 
	@Test
	public void Viewinvoice() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor)driver;//scrool,click
	WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
	Actions actions = new Actions(driver);
	    
	   //Billing
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();",user);
		System.out.println("open username dropdown");
		   Thread.sleep(2000);
			   
	    //view invoice
	     WebElement viewI = driver.findElement(By.id("idViewInvoice"));
	     jse.executeScript("arguments[0].click();",viewI); 
		   System.out.println("click View invoice");
		   logger.info("click View invoice");
		   Thread.sleep(4000);
		   
	}

}
