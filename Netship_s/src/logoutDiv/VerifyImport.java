package logoutDiv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class VerifyImport extends BaseInit{
	@Test
	public void importorder() throws InterruptedException {
		
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll
	WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
	
   //open username
	WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
	jse.executeScript("arguments[0].click();",user);
	  System.out.println("open username dropdown");
	  logger.info("open username dropdown");
	  Thread.sleep(2000);
	  
   //open import order	
    WebElement importO = driver.findElement(By.xpath("//*[@id=\"idNetshipImportOrder\"]"));
    jse.executeScript("arguments[0].click();",importO);
      System.out.println("open import order");
      logger.info("open import order");
      Thread.sleep(2000);

      //generate import order link text
		WebElement Olinktext = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Generated Import Order")));
		jse.executeScript("arguments[0].click();",Olinktext);
		System.out.println("open Generate import order");
		logger.info("open Generate import order");
		Thread.sleep(5000);
	}
	}
