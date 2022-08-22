package master_Screen;
import base.BaseInit;
import org.testng.annotations.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShipPackage_C extends BaseInit {
	 
	@Test
	  public void shipPackage_C() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;//scroll,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		
       //ship package
       WebElement shipP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imgShipPackage\"]")));
         jse.executeScript("arguments[0].click();",shipP);
         System.out.println("open ship package");
         logger.info("open ship package");
         Thread.sleep(8000);
         
         //billing account ship package client(for courier)   
         WebElement billaccountC = driver.findElement(By.xpath("//*[@id=\"drpClient\"]"));  
         jse.executeScript("arguments[0].click();",billaccountC);
         	Select list = new Select(billaccountC);
         	  list.selectByValue("950694");
             System.out.println("select billing account ship package client");
             logger.info("select billing account ship package client");
             Thread.sleep(7000);
        
        //package information
        //dry ice check box
         WebElement dryice = driver.findElement(By.xpath("//*[@id=\"iddryice\"]"));
         jse.executeScript("arguments[0].click();",dryice);
           System.out.println("select dry ice check box");
           logger.info("select dry ice check box");
           Thread.sleep(2000);
          
          WebElement Udryice = driver.findElement(By.xpath("//*[@id=\"iddryice\"]"));
          jse.executeScript("arguments[0].click();",Udryice);
            System.out.println("unselect dry ice check box");
            logger.info("unselect dry ice check box");
            Thread.sleep(2000);
           
        //Bio substance check box
          WebElement bio = driver.findElement(By.xpath("//*[@id=\"idbiosubstance\"]"));
            jse.executeScript("arguments[0].click();",bio);
            System.out.println("select bio substance check box");
            logger.info("select bio substance check box");
            Thread.sleep(2000);
          
          WebElement bio1 = driver.findElement(By.xpath("//*[@id=\"idbiosubstance\"]"));
          jse.executeScript("arguments[0].click();",bio1);
            System.out.println("unselect bio substance check box");
            logger.info("unselect bio substance check box");
            Thread.sleep(2000);
          
        //other dg
          WebElement dg = driver.findElement(By.xpath("//*[@id=\"idotherdg\"]"));
          jse.executeScript("arguments[0].click();",dg);  
          System.out.println("select other dg check box");
            logger.info("select other dg check box");
            Thread.sleep(2000);
          
          driver.findElement(By.xpath("//*[@id=\"idotherdg\"]")).click();
            System.out.println("unselect other dg check box");
            logger.info("unselect other dg check box");
            Thread.sleep(2000);          
          
        //cancel icon 
        WebElement cancel = driver.findElement(By.id("iddelpkg"));
        jse.executeScript("arguments[0].click();",cancel);
          Thread.sleep(2000);
          System.out.println("remove package details"); 
          logger.info("remove package details");
        //add button
        WebElement button = driver.findElement(By.id("hrefAdd"));
        jse.executeScript("arguments[0].click();",button);
          System.out.println("add package details");   
          logger.info("add package details");
          Thread.sleep(2000);
        
      //package type
        WebElement packagetype = driver.findElement(By.id("drpPackageType_0"));
      Select select = new Select(packagetype);
        int dropdownvalue = driver.findElements(By.cssSelector("#drpPackageType_0>option")).size();
      System.out.println(dropdownvalue);
      Random random = new Random();
      int index = random.nextInt(dropdownvalue);
      select.selectByIndex(index);
      logger.info("select random package type");
      Thread.sleep(3000);

      //description
       driver.findElement(By.xpath("//*[@id=\"txtCommodity_0\"]")).sendKeys("None"); 
        System.out.println("add description");
        logger.info("add description");
        Thread.sleep(2000);
  
      //sensor parameter  
       WebElement parameter = driver.findElement(By.xpath("//*[@id=\"drpSensorConfig_0\"]"));
       Select selectp = new Select(parameter);
        int dropdownvalue1 = driver.findElements(By.cssSelector("#drpSensorConfig_0>option")).size();
    	System.out.println("dropdownvalue1");
       int index1 = random.nextInt(dropdownvalue1);
       selectp.selectByIndex(index1);
       logger.info("select random sensor parameter dropdown");
       Thread.sleep(4000);
      
     //Available device
       WebElement device = driver.findElement(By.xpath("//*[@id=\"drpDeviceList_0\"]"));
       Select selectd = new Select(device);
        int dropdownvalue2 = driver.findElements(By.cssSelector("#drpDeviceList_0>option")).size();
    	System.out.println("dropdownvalue2");
       int index2 = random.nextInt(dropdownvalue2);
       selectd.selectByIndex(index2);
       logger.info("select random available device dropdown");
       Thread.sleep(4000);
      
     //pickup delivery information
       WebElement pudel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnPuDelInfo\"]")));
       jse.executeScript("arguments[0].click();",pudel);
         System.out.println("click pickup and delivery information");
         logger.info("click pickup and delivery information");
         Thread.sleep(4000);
         
       //clear  
         WebElement clear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkClearpickup\"]")));
         jse.executeScript("arguments[0].click();",clear);
         logger.info("clear");
         Thread.sleep(2000);
         
         jse.executeScript("scroll(0,1000)"); 
      //order validation
         WebElement orderv = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnPlaceOrder\"]")));
         jse.executeScript("arguments[0].click();",orderv);
         System.out.println("click place order");
         Thread.sleep(2000);
          jse.executeScript("scroll(0,-1000)");
          logger.info("check validation of place order");
      //Pickup address   
       WebElement pickupA = driver.findElement(By.xpath("//*[@id=\"idPUAddr\"]"));
       jse.executeScript("arguments[0].click();",pickupA);
         System.out.println("click pickup address");
         logger.info("Enter pickup address details");
         Thread.sleep(2000);
         
          driver.findElement(By.xpath("//*[@id=\"txtPUCompanyName\"]")).sendKeys("samyak");
            System.out.println("PU company name");
            logger.info("pickup company name");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtaddressline\"]")).sendKeys("932 Vandervort Ford");
            System.out.println("Address");
            logger.info("Enter address");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]")).sendKeys("72201");
           driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]")).sendKeys(Keys.ENTER); 
            System.out.println("enter zipcode");
            logger.info("Enter zipcode");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtpertosee\"]")).sendKeys("sp");
            System.out.println("enter contact number");
            logger.info("Enter contact number");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtphone\"]")).sendKeys("455428582");  
            System.out.println("phone");
            logger.info("Enter phone number");
            Thread.sleep(4000);
            jse.executeScript("scroll(0,-1000)");
            
            
         //delivery address
          WebElement deladd = driver.findElement(By.xpath("//*[@id=\"idDLAddr\"]"));
          jse.executeScript("arguments[0].click();",deladd);
            System.out.println("click delivery address");
            logger.info("Enter delivery address details");  
            Thread.sleep(2000); 
              
         //quick code   
          driver.findElement(By.xpath("//a[contains(@id,'idquickdeliver')]//i[contains(@class,'glyphicon-search searchicon')]")).click();
            System.out.println("quick code");
            logger.info("click on Quick quote icon");
            Thread.sleep(2000);
          WebElement reset = driver.findElement(By.xpath("//*[@id=\"btnReset\"]"));
          jse.executeScript("arguments[0].click();",reset);
          driver.findElement(By.xpath("//*[@id=\"txtBusinessName\"]")).sendKeys("tathya");
            System.out.println("select bussiness name");
            logger.info("select bussiness name in quick quote popup");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();
            System.out.println("search");
            logger.info("click on search button");
            Thread.sleep(7000);
            
          driver.findElement(By.xpath("//*[@id=\"txtpertoseedel\"]")).sendKeys("sp");
            System.out.println("Enter contact");
            logger.info("Enter contact");
            Thread.sleep(2000);
      
         //residential check box   
          WebElement residential = driver.findElement(By.xpath("//*[@id=\"chkboxdelivery\"]"));
          jse.executeScript("arguments[0].click();",residential);  
            System.out.println("residential check box");
            logger.info("select residential check box");
            Thread.sleep(2000);
            
//         //shipment details Be ready
         WebElement datetimeR = driver.findElement(By.xpath("//input[contains(@id,'inlineRadio2')]"));
                 jse.executeScript("arguments[0].click();",datetimeR);
           System.out.println("select check box ready date and time");
           logger.info("select check box ready date and time");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtrdydate\"]")).sendKeys("09/19/2022");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\\\"txtrdytime\\\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtrdytime\"]")).sendKeys("05:02");
            Thread.sleep(4000);
          System.out.println("Enter date and time"); 
          logger.info("Enter date and time");
          
         //shipment details delivery
          WebElement datetimeD = driver.findElement(By.xpath("//input[contains(@id,'inlineRadio4')]"));
            jse.executeScript("arguments[0].click();",datetimeD);
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
           
          
         //select service 
          WebElement service = driver.findElement(By.xpath("//*[@id=\"cmbdefualtservice\"]"));
          jse.executeScript("arguments[0].click();",service);
          Select service1 = new Select(service);
          service1.selectByValue("string:LOC");
           System.out.println("Select service level");
           logger.info("Select service level");
           Thread.sleep(2000);
          
          WebElement okleave = driver.findElement(By.xpath("//*[@id=\"chkbokleave\"]"));
          jse.executeScript("arguments[0].click();",okleave);
          Thread.sleep(2000);
          jse.executeScript("scroll(0,1000)");
          System.out.println("select OK to Leave at Delivery Location check box");
          logger.info("select OK to Leave at Delivery Location check box");
          Thread.sleep(4000);
          
         //Notification
          WebElement notification = driver.findElement(By.xpath("//*[@id=\"hlkShowNotify\"]"));
          jse.executeScript("arguments[0].click();",notification);
          System.out.println("Email/Text notification");
            logger.info("click on email/text notification link text");
            Thread.sleep(2000);
          WebElement addn = driver.findElement(By.xpath("//*[@id=\"addnotifyicon\"]"));
          jse.executeScript("arguments[0].click();", addn);
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"txtvia\"]")).sendKeys("tathya.gandhi@samyak.com");
            System.out.println("enter email id");
            logger.info("Enter email id");
            Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"savenotifyicon\"]")).click();
           System.out.println("click on save");
           logger.info("click on save");
           Thread.sleep(3000);
          WebElement close = driver.findElement(By.xpath("//*[@id=\"btnclose\"]"));
          jse.executeScript("arguments[0].click();",close);
            System.out.println("close");
            logger.info("enter details");
            Thread.sleep(2000);
            
         //Add Attachement   
          driver.findElement(By.xpath("//*[@id=\"hlkUploadDocument\"]")).click();
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
    		    System.out.println("select document for upload purpose");
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
  			driver.findElement(By.id("btnCancel")).click();
  			logger.info("cancel");
  			  Thread.sleep(2000);		  
	          
         //click Order non-spl   
          WebElement orderI = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnPlaceOrder\"]")));
          jse.executeScript("arguments[0].click();",orderI);
           System.out.println("click on place order");
   		 logger.info("click on place order"); 
           Thread.sleep(4000);     
          
          WebElement confirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idorderconfirmbtn\"]")));
          jse.executeScript("arguments[0].click();",confirm);
          System.out.println("generate pickup id");
    		logger.info("Generate pickup id");  
          Thread.sleep(5000);

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
