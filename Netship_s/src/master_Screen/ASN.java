package master_Screen;
import base.BaseInit;
import base.extentreports;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ASN  extends BaseInit{
	
	
  @Test
  public void asn() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
	  JavascriptExecutor jse = (JavascriptExecutor)driver;//scrool,click
	  Actions actions = new Actions(driver);
	  
	  Thread.sleep(2000);
	WebElement asn = driver.findElement(By.xpath("//*[@id=\"imgcreateasn\"]"));
	jse.executeScript("arguments[0].click();",asn);
	  System.out.println("Click on create ASN");
	  logger.info("Click on create ASN");
	  Thread.sleep(4000);
	  
   //Account list	  
	WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ddlClient\"]")));  
	jse.executeScript("arguments[0].click();",account);
	  Select list = new Select(account);
	  list.selectByValue("string:950693");
	  System.out.println("select account");
      logger.info("select account");
	  Thread.sleep(4000);
	  
   //Location list
	WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ddlfsl\"]")));
	jse.executeScript("arguments[0].click();",location);
	  Select list1 = new Select(location);
	  list1.selectByValue("string:5509");
	  System.out.println("select location");
	  logger.info("select location");
	  Thread.sleep(4000);
	  
	//ASN Ref
	 driver.findElement(By.xpath("//*[@id=\"txtasnref\"]")).sendKeys("01201");
	   System.out.println("Enter ASN Ref");
	   logger.info("Enter ASN Ref");
	   Thread.sleep(2000);
	   
	 //carrier Name
	  WebElement carrier = driver.findElement(By.xpath("//*[@id=\"ddlCarrier\"]"));
	  jse.executeScript("arguments[0].click();",carrier); 
	   Select list2 = new Select(carrier);
	   list2.selectByValue("string:NGL");
	    System.out.println("select carrier name");
	    logger.info("select carrier name");
        Thread.sleep(2000); 	
     
     //Tracking
      driver.findElement(By.xpath("//*[@id=\"txttrackingno\"]")).sendKeys("01");
        System.out.println("tracking number");
        logger.info("tracking number");
        Thread.sleep(2000);
        
     //Reference url
      driver.findElement(By.xpath("//*[@id=\"txtreferenceurl\"]")).sendKeys("http://stagingns.nglog.com/CreateASN");  
        System.out.println("add url");
        logger.info("add Url");
        Thread.sleep(2000);
       
     //note
      driver.findElement(By.xpath("//*[@id=\"txtnotes\"]")).sendKeys("AFTER HOURS (DELIVERY)");
        System.out.println("note");
        logger.info("note");
        Thread.sleep(4000);
        
     //ASN type
      WebElement ASNtype = driver.findElement(By.xpath("//*[@id=\"ddlASNType\"]"));
       Select select = new Select(ASNtype);
       int ASNvalue = driver.findElements(By.cssSelector("#ddlASNType>option")).size();
        System.out.println(ASNvalue);
       Random random = new Random();
       int index = random.nextInt(ASNvalue);
       select.selectByIndex(index);
       logger.info("select ASN type");
        Thread.sleep(3000);
  
     //Estimated Arrival
      driver.findElement(By.xpath("//*[@id=\"txtestdate\"]")).sendKeys("06/27/2022 15:01");
        System.out.println("Est time and date");
        logger.info("Est time and date");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@id=\"lblEstArrDttm\"]")).click();
        Thread.sleep(4000);

     //parts details
      WebElement parts = driver.findElement(By.xpath("//*[@id=\"AddNewNglId\"]")); 
      jse.executeScript("arguments[0].click();",parts);
      System.out.println("open parts pop up");
        logger.info("open parts pop up");
        Thread.sleep(2000);
        
     //part
      driver.findElement(By.xpath("//*[@id=\"txtNglFSL\"]")).sendKeys("laptop");
      WebElement partsearch = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
      jse.executeScript("arguments[0].click();",partsearch);
      Thread.sleep(2000);
      WebElement addparts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addparts_0\"]")));
      jse.executeScript("arguments[0].click();",addparts);
      WebElement saveparts = driver.findElement(By.xpath("//*[@id=\"hlkSavePart\"]"));
      jse.executeScript("arguments[0].click();",saveparts);
      System.out.println("add and save parts");
        logger.info("add and save parts");
        Thread.sleep(2000);
      
     // expand parts
      WebElement expand = driver.findElement(By.xpath("//*[@id=\"imgExpand\"]"));
      jse.executeScript("arguments[0].click();",expand);
        System.out.println("Expand parts");
        logger.info("Expand parts");
     //add child parts
      
      for (int i = 0; i < 5; i++){
    	  //click the button
    	  WebElement addquantity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AddNewNglChildPartid\"]")));
    	  jse.executeScript("arguments[0].click();",addquantity);
    	  //wait 2 seconds
    	   Thread.sleep(2000);
    	   //check that data is being generated correctly
    	  
    	 }
      System.out.println("Add multiple child parts");
      logger.info("Add multiple child parts");
      
     //save  
      WebElement save = driver.findElement(By.xpath("//*[@id=\"hlkSaveASN\"]"));
      jse.executeScript("arguments[0].click();",save);
        System.out.println("save parts");
        logger.info("save parts");
        Thread.sleep(8000);
        
     //ASN Log
        WebElement ASNL = driver.findElement(By.xpath("//*[@id=\"imgasnlog\"]"));
        jse.executeScript("arguments[0].click();",ASNL);
          System.out.println("Open ASN Log");
          logger.info("Open ASN Log");
          Thread.sleep(5000);
          
      	WebElement accountLog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpAccount\"]")));  
      	jse.executeScript("arguments[0].click();",accountLog);
  	  Select list3 = new Select(accountLog);
  	  list3.selectByValue("950693");
  	  System.out.println("select account");
  	  logger.info("select account");
  	  Thread.sleep(4000);
      
  	  //RunSearch
  	   WebElement runsearch =driver.findElement(By.xpath("//*[@id=\"btnRunSearch\"]"));
  	   jse.executeScript("arguments[0].click();",runsearch);
  	     System.out.println("click on Run Search");
  	     logger.info("click on Run Search");
  	     Thread.sleep(2000);
  	     
  	     WebElement ASN = driver.findElement(By.xpath("//*[@id=\"txtASN\"]"));
  	       ASN.sendKeys("259643");
  	       System.out.println("Enter Existing ASN");
  	       logger.info("Enter Existing ASN");
  	       Thread.sleep(2000);
  	          
//	        //search existing ASN 
//	        List<WebElement> orderdetails1 = driver.findElements(By.xpath("/html/body/div[3]/section/div[2]/div[1]/div/div/div[2]/div/div[3]/div/gridcontrol-controller/div/div/div[6]/div/div[1]/div/table/tbody/tr[1]/td[1]/a"));
//	        orderclass(orderdetails1, "get the Order Details = ");
//	        logger.info("get the Order Details = "+ orderdetails1);
//	        Thread.sleep(2000);
//	        String asn1 = driver.findElement(By.xpath("/html/body/div[3]/section/div[2]/div[1]/div/div/div[2]/div/div[3]/div/gridcontrol-controller/div/div/div[6]/div/div[1]/div/table/tbody/tr[1]/td[1]/a")).getText();
//  	      WebElement eASN = driver.findElement(By.xpath("//*[@id=\"txtASN\"]"));
//  	       eASN.sendKeys(asn1);
//  	       System.out.println("existing ASN = "+ asn1);
//  	       logger.info("existing ASN ="+ asn1);
	         
           // search asn parts
  	        WebElement searchp = driver.findElement(By.xpath("//*[@id=\"btnRunSearch\"]"));
  	        jse.executeScript("arguments[0].click();",searchp);
  	          System.out.println("Run Search");
  	          logger.info("Run search");
  	          Thread.sleep(4000);
  	          
//       //part details expand
//        WebElement expandp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hrefExpand\"]")));
//        jse.executeScript("arguments[0].click();",expandp);
//           System.out.println("Expand part details");
//          logger.info("Expand part details");
//          Thread.sleep(4000);
         
       //back to screen   
        WebElement backtoscreen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkBackToScreen\"]")));
		actions.moveToElement(backtoscreen).click().build().perform();
          System.out.println("back to screen");
          logger.info("Back to screen");
          Thread.sleep(4000);
     
      //Export button
       WebElement Export = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnExport\"]")));
       jse.executeScript("arguments[0].click();",Export);
         System.out.println("Click export button");
         logger.info("Click export button");
         Thread.sleep(2000);
         
      //back to active order
       WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
       jse.executeScript("arguments[0].click();",back);
         System.out.println("Back to active order screen");
         logger.info("Back to active order screen");
         Thread.sleep(3000);     
  }  
//public static void orderclass(List<WebElement> data,String value){
//	  
//	  for(int count = 0; count<data.size();count++) {
//		  String addedvalue = data.get(count).getText();
//		  System.out.println(value + addedvalue);
//	  }
//}
}
