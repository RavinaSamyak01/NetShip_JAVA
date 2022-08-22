package logoutDiv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class Importorder extends BaseInit {

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
          
//       //select billing ac   
//        WebElement billingac = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpClient\"]")));
//          jse.executeScript("arguments[0].click();", billingac);
//          Select list1 = new Select(billingac);
//          list1.selectByValue("950693");
//          System.out.println("Select billing account import order");
//          logger.info("Select billing account import order");
//          Thread.sleep(2000);
//  
//	   //callback shipper check box
//        driver.findElement(By.xpath("//label[contains(@class,'packageDetails packageDetails2 margin-right-10')]//input[contains(@id,'chkbCallbackShipper')]")).click();
//	      System.out.println("select check box callback shipper");
//          logger.info("select check box callback shipper");	      
//       //verify file check box
//	    driver.findElement(By.xpath("//label[contains(@class,'packageDetails packageDetails2')]//input[contains(@id,'chkbVerifyFile')]")).click();
//	      System.out.println("select check box verify file");
//	      logger.info("select check box verify file");
	   //open browser    
	    driver.findElement(By.xpath("//*[@id=\"btnBrowse\"]")).click();
	      System.out.println("select browser");
	      logger.info("select browser");
       //select file
	    WebElement selectfile = driver.findElement(By.xpath("//*[@id=\"file\"]"));
	      selectfile.sendKeys("C:\\Users\\tgandhi\\eclipse-workspace\\Netship_s\\resources\\ImportOrderDemo (2).xls");
	      Thread.sleep(2000);
	      System.out.println("select file");
	      logger.info("select file");
          Thread.sleep(2000);
          
       //upload   
  		WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnUpload")));
  		jse.executeScript("arguments[0].click();",upload);
  		  System.out.println("file upload successfully");
  		  logger.info("file upload successfully");
  		  Thread.sleep(3000);
  		  
  	   //continue
  		WebElement continueb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnContinue\"]")));
  		jse.executeScript("arguments[0].click();",continueb);
  		  System.out.println("click continue");
  		  logger.info("click continue");
  		  Thread.sleep(2000);
  		  
  		  
  	   //generate import order link text
  		WebElement Olinktext = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Generated Import Order")));
  		jse.executeScript("arguments[0].click();",Olinktext);
  		System.out.println("open Generate import order");
  		logger.info("open Generate import order");
  		Thread.sleep(5000);
  	   
  	   //close popup
  		WebElement closeg = driver.findElement(By.xpath("//*[@id=\"idanchorclose\"]"));
  		jse.executeScript("arguments[0].click();",closeg);
  		System.out.println("close the import order popup");
  		logger.info("close the import order popup");
  		Thread.sleep(3000);
  		
        //back to active order
        WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
        jse.executeScript("arguments[0].click();",back);
          System.out.println("Back to active order screen");
          logger.info("Back to active order screen");
          Thread.sleep(3000);
	}
}
