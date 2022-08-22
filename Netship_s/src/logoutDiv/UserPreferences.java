package logoutDiv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;
import base.extentreports;

public class UserPreferences extends BaseInit {
	
    @Test
	public void userPrefrences() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		
	    //Preferences
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();",user);
		System.out.println("open username dropdown");
		   Thread.sleep(2000);
			   
	    //user prefrences
	     WebElement userP = driver.findElement(By.id("idUserPreferences"));
	     jse.executeScript("arguments[0].click();",userP); 
		   System.out.println("click user preferences");
		   logger.info("open user preferences");
		   Thread.sleep(4000);
     
		//save
		 WebElement save = driver.findElement(By.xpath("//*[@id=\"hrefImgSave\"]"));
		 jse.executeScript("arguments[0].click();",save);
		   System.out.println("save user prefrences details");
		   logger.info("save user prefrences details");
		   Thread.sleep(2000);
		   
	    //back to active order
	     driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]")).click();
	       System.out.println("Back to active order screen");
	       logger.info("Back to active order screen");
	       Thread.sleep(3000);
	}

}
