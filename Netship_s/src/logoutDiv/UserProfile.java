package logoutDiv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class UserProfile extends BaseInit {

	@Test
	public void userProfile() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		
	   //Admin
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();",user);
		  System.out.println("open username dropdown");
		  Thread.sleep(2000);
	   
	   //user profile
		WebElement userp = driver.findElement(By.id("idUserProfile"));
		jse.executeScript("arguments[0].click();",userp);
		  System.out.println("open user profile");
		  logger.info("open user profile");
		  Thread.sleep(5000);
		  jse.executeScript("scroll(0,1000)");
		  
	   //save user details
		WebElement userd = driver.findElement(By.xpath("//*[@id=\"hlkSavedTL\"]"));
		jse.executeScript("arguments[0].click();",userd);
		  System.out.println("save user details");
		  logger.info("save user details");
		  Thread.sleep(2000);
		  
	       //back to active order
		  WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActiveOrdTab\"]")));
		  jse.executeScript("arguments[0].click();",back);
	         System.out.println("Back to active order screen");
	         logger.info("Back to active order screen");	
	         Thread.sleep(3000);

	}

}
