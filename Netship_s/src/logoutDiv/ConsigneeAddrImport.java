package logoutDiv;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;
import base.extentreports;

public class ConsigneeAddrImport extends BaseInit {
 
	@Test
	public void consigneeAddrImport() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		
	//Consignee Addr Import
		
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();",user);
		  System.out.println("open username dropdown");
		  Thread.sleep(2000);
		     
	    WebElement consigneeA = driver.findElement(By.id("idConsigneeAddrImport"));
	    jse.executeScript("arguments[0].click();",consigneeA);
	      System.out.println("open Consignee Address Import");
		  logger.info("open Consignee Address Import");
		  Thread.sleep(2000);
			
	// consignee addr import upload file popup
		  WebElement importi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkImportConsigneeAddr\"]")));
		  jse.executeScript("arguments[0].click();",importi);
		  Thread.sleep(3000);
		WebElement consigneeI = driver.findElement(By.xpath("//*[@id=\"file\"]"));
		consigneeI.sendKeys("C:\\Users\\tgandhi\\eclipse-workspace\\Netship_s\\resources\\ConsigneeAddress_WihLiveData.xls");
		  System.out.println("select file for upload");
		  logger.info("select file for upload");
		  Thread.sleep(2000);
		  
	//upload button		 
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"btnUpload\"]"));
		jse.executeScript("arguments[0].click();",upload);
		  System.out.println("click on upload button");
		  logger.info("click on upload button");
		  Thread.sleep(2000);
	//close		   
		WebElement btnclose = driver.findElement(By.id("btnclose"));
		  jse.executeScript("arguments[0].click();",btnclose);   
		  System.out.println("close addres upload popup");
		  logger.info("close popup");
		  jse.executeScript("scroll(0,1000)");
		  Thread.sleep(2000);
		       
	//view sample file     
		WebElement file = driver.findElement(By.xpath("//*[@id=\"hlkViewSampleFile\"]"));
		jse.executeScript("arguments[0].click();",file);
		  System.out.println("View sample file");
		  logger.info("View sample file");
		  Thread.sleep(3000);
		  jse.executeScript("scroll(0,1000)");
			  
	//Export consignee address  
		WebElement econsignee = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkExportConsigneeAddress\"]")));  
		  jse.executeScript("arguments[0].click();",econsignee);
		  System.out.println("Export consignee addr");
		  logger.info("Export consignee addr");
		  Thread.sleep(4000);
		  
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
