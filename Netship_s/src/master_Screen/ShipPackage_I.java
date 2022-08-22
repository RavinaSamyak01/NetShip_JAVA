package master_Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;

public class ShipPackage_I extends BaseInit{

	@Test
	public void shipPackage_I() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;//scroll,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		
		 //SPL parts inventory shipment 
        WebElement invs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imgShipPackage\"]")));
        jse.executeScript("arguments[0].click();",invs);
          System.out.println("open ship package");
  	    logger.info("open ship package");
  	    Thread.sleep(7000);
  	  
   //billing account ship package client (for inventory)  
    WebElement billaccountI = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpClient\"]")));  
    jse.executeScript("arguments[0].click();",billaccountI);
    	Select list1 = new Select(billaccountI);
    	  list1.selectByValue("950693");
        System.out.println("select billing account ship package client inventory");
        logger.info("select billing account ship package client inventory");
        Thread.sleep(7000);
        
    //select inventory
     WebElement inv = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"InvTab\"]")));
     jse.executeScript("arguments[0].click();",inv);
      System.out.println("Select inventory");
      logger.info("select inventory");
      Thread.sleep(2000);
      
    //Parts Search
      driver.findElement(By.xpath("//*[@id=\"txtBasicSearch\"]")).sendKeys("laptop");
        System.out.println("Enter parts name");
        logger.info("enter parts name");
        Thread.sleep(3000);
      WebElement parts = driver.findElement(By.xpath("//*[@id=\"btnBasicSearch\"]"));
      jse.executeScript("arguments[0].click();",parts);
        System.out.println("Enter and search parts");
        logger.info("Enter and search parts");
        Thread.sleep(4000);

     //Add parts   
      WebElement addparts = driver.findElement(By.xpath("//*[@id=\"addparts\"]"));
      jse.executeScript("arguments[0].click();",addparts);
        System.out.println("click to add parts");
        logger.info("click to add parts");
        Thread.sleep(3000);
        
        jse.executeScript("scroll(0,1000)");
//      driver.findElement(By.xpath("//i[contains(@class,'sprite icon-cancel ng-scope')]")).click();
//      jse.executeScript("scroll(0,-500)");
//      driver.findElement(By.xpath("//*[@id=\"addparts\"]")).click();
//        System.out.println("Remove and Add parts");
//        logger.info("Remove and Add parts");
//        jse.executeScript("scroll(0,1000)");
//        Thread.sleep(2000);
        
     //Delivery information
        WebElement delinfo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnDelInfo\"]")));
        jse.executeScript("arguments[0].click();",delinfo);
        System.out.println("click to Delivery information button");
        logger.info("click to Delivery information button");
        Thread.sleep(4000);
        
        //delivery address
        WebElement deladd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idDLAddr\"]")));
        jse.executeScript("arguments[0].click();",deladd);
        System.out.println("click delivery address");
          logger.info("Enter delivery address details");  
          Thread.sleep(2000);
          
       //quick code   
        WebElement Quickcode = driver.findElement(By.xpath("//a[contains(@id,'idquickdeliver')]//i[contains(@class,'glyphicon-search searchicon')]"));
        jse.executeScript("arguments[0].click();",Quickcode);
          System.out.println("quick code");
          logger.info("click on Quick quote icon");
          Thread.sleep(2000);
        WebElement reset = driver.findElement(By.xpath("//*[@id=\"btnReset\"]"));
        jse.executeScript("arguments[0].click();", reset);
        System.out.println("reset quick quote");
        logger.info("reset quick quote");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"txtBusinessName\"]")).sendKeys("tathya");
          System.out.println("select bussiness name");
          logger.info("select bussiness name in quick quote popup");
          Thread.sleep(2000);
        WebElement btnsearch = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
        jse.executeScript("arguments[0].click();",btnsearch);
          System.out.println("search");
          logger.info("click on search button");
          Thread.sleep(2000);
          
       //pickup phone number   
          WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtphone\"]")));
          phone.sendKeys("9821568247");
          System.out.println("pickup phone number");
          logger.info("pickup phone number");
       //del contact   
        driver.findElement(By.xpath("//*[@id=\"txtpertoseedel\"]")).sendKeys("sp");
          System.out.println("Enter contact");
          logger.info("Enter contact");
          Thread.sleep(2000);
          
          //del phone number   
          WebElement phoned = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtphonedel\"]")));
          phoned.sendKeys("9821568247");
          System.out.println("deliver phone number");
          logger.info("deliver phone number");
    
       //residential check box Inventory   
        WebElement residentialI = driver.findElement(By.xpath("//*[@id=\"chkboxdelivery\"]"));
        jse.executeScript("arguments[0].click();",residentialI);
          System.out.println("residential check box");
          logger.info("select residential check box");
          jse.executeScript("scroll(0,-400)");
          Thread.sleep(5000);
          
       //shipment details be ready inventory 
       WebElement datetimeIR = driver.findElement(By.xpath("//*[@id=\"inlineRadio2\"]"));
       jse.executeScript("arguments[0].click();",datetimeIR);
         System.out.println("select check box ready date and time");
         logger.info("select check box ready date and time");
          Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"txtrdydate\"]")).sendKeys("09/19/2022");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\\\"txtrdytime\\\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txtrdytime\"]")).sendKeys("05:02");
          Thread.sleep(4000);
          System.out.println("Enter date and time");
          logger.info("Enter date and time");
          jse.executeScript("scroll(0,400)");
        
       //shipment details delivery inventory 
        WebElement datetimeID = driver.findElement(By.xpath("//*[@id=\"inlineRadio4\"]"));
          jse.executeScript("arguments[0].click();",datetimeID);
          System.out.println("select check box del date and time");
          logger.info("select check box del date and time");
           Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"txtdeldate\"]")).sendKeys("10/30/2022");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\\\"txtdeltime\\\"]")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"txtdeltime\"]")).sendKeys("05:02");
           Thread.sleep(4000);
           System.out.println("Enter date and time");
           logger.info("Enter date and time");
            Thread.sleep(2000);
            
//        WebElement click = driver.findElement(By.xpath("//*[@id=\"txtEmaildel\"]"));
//        jse.executeScript("arguments[0].click();", click);
//        logger.info("close datepicker");
        
       //select service Delivery inventory
        WebElement serviceD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cmbdefualtservice\"]")));
        jse.executeScript("arguments[0].click();",serviceD);
        Select service2 = new Select(serviceD);
        service2.selectByValue("string:LOC");
        System.out.println("select service level");
        logger.info("Select service level");
        Thread.sleep(4000);
        
        WebElement leave = driver.findElement(By.xpath("//*[@id=\"chkbokleave\"]"));
        jse.executeScript("arguments[0].click();",leave);
        Thread.sleep(2000);
        jse.executeScript("scroll(0,1000)");
          logger.info("select OK to Leave at Delivery Location check box");
          System.out.println("select OK to Leave at Delivery Location check box");
          jse.executeScript("scroll(0,1000)");
          Thread.sleep(2000);
          
       //Notification
        WebElement snotify = driver.findElement(By.xpath("//*[@id=\"hlkShowNotify\"]"));
        jse.executeScript("arguments[0].click();",snotify);
          System.out.println("Email/Text notification");
          logger.info("click on email/text notification link text");
          Thread.sleep(2000);
        WebElement notifyI = driver.findElement(By.xpath("//*[@id=\"addnotifyicon\"]"));
        jse.executeScript("arguments[0].click();",notifyI);
          Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"txtvia\"]")).sendKeys("tathya.gandhi@samyak.com");
          System.out.println("enter email id");
          Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"btnOK\"]")).click();
          System.out.println("click ok");
          logger.info("enter details");
          Thread.sleep(4000);
          
       //Add Attachement   
          WebElement attach = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkUploadDocument\"]")));
          jse.executeScript("arguments[0].click();",attach);   
  	    System.out.println("click on attachment icon");
  	    logger.info("click on Attachment icon");
  	    Thread.sleep(2000);
  	    
  	    driver.findElement(By.id("adduploadicon")).click();
  		  System.out.println("upload document icon");
  		  logger.info("upload document icon");
  		  Thread.sleep(2000);
  		  
  		driver.findElement(By.id("txtDocName")).sendKeys("QUANTUM RI");
  		  System.out.println("enter doc name");
  		  logger.info("Enter document name");
  		  Thread.sleep(2000);
  	    
  		  driver.findElement(By.id("file")).sendKeys("C:\\Users\\tgandhi\\Pictures\\Screenshots\\Screenshot (42).png");
  		  logger.info("select document for upload purpose");
  		  
  	   //upload
  		driver.findElement(By.id("btnUpload")).click();
  		  System.out.println("click on upload button");
  		  logger.info("Click on upload button");
  		  Thread.sleep(2000);
  		  
  	   //click save and close
  		driver.findElement(By.id("btnsaveandclose")).click();
  		  System.out.println("save and close");
  		  logger.info("click on save and close button");
  		  Thread.sleep(2000);
			WebElement cancel = driver.findElement(By.id("btnCancel"));
			jse.executeScript("arguments[0].click();",cancel);
			  System.out.println("cancel");
			  logger.info("cancel");
			  		  
			  
       //click Order Delivery inventory spl   
        WebElement orderD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnPlaceOrder\"]")));  
        jse.executeScript("arguments[0].click();",orderD);
         System.out.println("click place order");
 		   logger.info("click on place order"); 
         Thread.sleep(5000);
         
         //confirm inv order
         WebElement confirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idorderconfirmbtn\"]")));
         jse.executeScript("arguments[0].click();",confirm);
         System.out.println("generate del id");
   		logger.info("Generate del id"); 
   		Thread.sleep(4000);

        try {
      	  Thread.sleep(2000);
      	  String popup = driver.findElement(By.id("idorderconfirmbtn")).getText();
        
        if(driver.findElement(By.id("idorderconfirmbtn")).isDisplayed()){
          WebElement confirm1 = driver.findElement(By.xpath("//*[@id=\"idorderconfirmbtn\"]"));
          jse.executeScript("arguments[0].click();",confirm1);
          System.out.println("generate pickup id");
  		logger.info("Generate pickup id");  
          Thread.sleep(5000);
       }
        else {
      	  logger.info("Pickup id generated successfully");
        }
        }catch(Exception e){
      	  System.out.println("Order Generated successfully!!");
      	  
        }
         //back to active order
         WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActiveOrdTab\"]")));
         jse.executeScript("arguments[0].click();",back);
           System.out.println("Back to active order screen");
           logger.info("Back to active order screen");
           Thread.sleep(3000);  

	}		
	

}

