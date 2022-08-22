package logoutDiv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class Contactus extends BaseInit {

	@Test
	public void contactusnews() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		JavascriptExecutor jse = (JavascriptExecutor)driver;//scrool,click
		
    //contact us
     WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divUsername\"]")));
     jse.executeScript("arguments[0].click();",user);
	   System.out.println("open username dropdown");
	   Thread.sleep(2000);
	 WebElement contact = driver.findElement(By.xpath("//*[@id=\"idContactus\"]"));
	 jse.executeScript("arguments[0].click();",contact);
	   System.out.println("Click to contact us");
	   logger.info("Click to contact us");
	   Thread.sleep(4000);
	   
       //back to active order
       WebElement backa = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
       jse.executeScript("arguments[0].click();",backa);
         System.out.println("Back to active order screen");
         logger.info("Back to active order screen");
         Thread.sleep(3000);
	
	//news & announcements
     WebElement usern = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
     jse.executeScript("arguments[0].click();",usern);
	   System.out.println("open username dropdown");
	   Thread.sleep(2000);
	 WebElement news = driver.findElement(By.xpath("//*[@id=\"idNews\"]"));
	 jse.executeScript("arguments[0].click();",news);
	   System.out.println("news & announcements click");
	   logger.info("news & announcements click");
	   Thread.sleep(2000);
	   
       //back to active order
       WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
         jse.executeScript("arguments[0].click();",back);
         System.out.println("Back to active order screen");
         logger.info("Back to active order screen");
         Thread.sleep(3000);


	}
}
