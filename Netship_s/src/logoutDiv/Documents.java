package logoutDiv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class Documents extends BaseInit {

	@Test
	public void documents() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
	

	   //Admin  
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();",user);
		  System.out.println("open username dropdown");
		  logger.info("open username dropdown");
		  Thread.sleep(2000);
		   
	   //Documents
		WebElement doc = driver.findElement(By.id("idCustDocuments"));
		jse.executeScript("arguments[0].click();",doc);
		  System.out.println("open user documents");
		  logger.info("open documents");
		  
		   
	   //edit documents
		WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.id("hlkNewFile")));
		jse.executeScript("arguments[0].click();",edit);
		  Thread.sleep(2000);
		  
	   //save doc validation	
		WebElement savev = driver.findElement(By.xpath("//*[@id=\"hlkSaveShipPkg\"]"));
		jse.executeScript("arguments[0].click();",savev);
		  Thread.sleep(2000);		   
		  
	   //doc name
		driver.findElement(By.id("txtDocName")).sendKeys("QUANTUM RI-CAN1");
		  System.out.println("doc name");
		  logger.info("doc name");
		  Thread.sleep(2000);
		   
		//doc type   
		WebElement doct = driver.findElement(By.id("drpDocType"));
		jse.executeScript("arguments[0].click();", doct);
		driver.findElement(By.id("drpDocType")).sendKeys(Keys.TAB);
		driver.findElement(By.id("drpDocType")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("drpDocType")).sendKeys(Keys.ENTER);
		  Thread.sleep(2000);
		  
		//doc date   
		driver.findElement(By.id("txtDocDate")).sendKeys("04/06/2022");
		driver.findElement(By.id("txtDocDate")).sendKeys(Keys.TAB);
		
        //Revision	
		driver.findElement(By.id("txtRevision")).sendKeys("5");
		driver.findElement(By.id("txtValidFrom")).sendKeys("04/08/2022");
		driver.findElement(By.id("txtValidFrom")).sendKeys(Keys.TAB);
		  Thread.sleep(2000);
		  
	   //upload file	  
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\tgandhi\\Pictures\\Screenshots\\Screenshot (42).png");
	 	  jse.executeScript("scroll(0,1000)");
	      System.out.println("Enter Documents details");
	 	  logger.info("Enter Documents details");
	      
	   //upload button	   
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"btnUpload\"]"));
		jse.executeScript("arguments[0].click();",button1);
	     Thread.sleep(10000);
	  	jse.executeScript("scroll(0,-1000)");
	  	System.out.println("upload document");
	  	logger.info("upload document");
	  		
	  	WebElement save = driver.findElement(By.xpath("//*[@id=\"hlkSaveShipPkg\"]"));
	  	jse.executeScript("arguments[0].click();",save);
		  Thread.sleep(2000);
	    WebElement saved = driver.findElement(By.id("chkbDocuments_1"));
	    jse.executeScript("arguments[0].click();",saved);
		  System.out.println("checked save document");
		  logger.info("document saved sucessfully");
		  Thread.sleep(2000);
	     WebElement delete = driver.findElement(By.xpath("//li[contains(@id,'ImgDelete')]//a[contains(@ng-click,'Delete')]"));
	     jse.executeScript("arguments[0].click();",delete);
		   System.out.println("delete document");
		   logger.info("document deleted sucessfully");
		   Thread.sleep(2000);
		 WebElement confirm = driver.findElement(By.id("idorderconfirmbtn"));
		 jse.executeScript("arguments[0].click();",confirm);
		   System.out.println("confirm delete button");
		   Thread.sleep(2000);
		   
		   driver.navigate().back();
		   Thread.sleep(2000);
		   
	       //back to active order
	       WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
	       jse.executeScript("arguments[0].click();",back);
	         System.out.println("Back to active order screen");
	         logger.info("Back to active order screen");
	         Thread.sleep(3000);
			  

	}

}
