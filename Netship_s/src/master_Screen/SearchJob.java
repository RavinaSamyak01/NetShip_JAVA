package master_Screen;

import java.util.List;
import base.BaseInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchJob extends BaseInit {

	@Test
  public void searchjob() throws InterruptedException {
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;// scroll
	WebDriverWait wait = new WebDriverWait(driver,50);// wait time
	 
    //select Job
     WebElement job = wait.until(ExpectedConditions.elementToBeClickable(By.id("hlkShip1")));
     jse.executeScript("arguments[0].click();",job);
     logger.info("select existing job");
    Thread.sleep(2000);
    
   //Order Details 
    List<WebElement> orderdetails = driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div[1]/ul"));
    orderclass(orderdetails, "get the Order Details = ");
    logger.info("get the Order Details = "+ orderdetails);
    Thread.sleep(2000);
    
     driver.navigate().back();
     System.out.println("back");
     logger.info("back");
     Thread.sleep(4000);
    
		  
		 //Search pickup id
		  //WebElement pickup = driver.findElement(By.xpath("//*[@id=\"txtGlobalSearch\"]"));
		      WebElement Pickup =  wait.until(ExpectedConditions.elementToBeClickable(By.id("hlkShip0")));
		       Pickup.click();
		    System.out.println("search pickup id");
		    logger.info("search pickup id");
		   
		    jse.executeScript("scroll(0,500)");
		   
		 //click on search
		    
	      WebElement search = driver.findElement(By.xpath("//*[@id=\"idtxtglobalsearch\"]"));
	      jse.executeScript("arguments[0].click();",search);
	       System.out.println("click on search icon pickup id");
	        logger.info("click on search icon pickup id");
	        Thread.sleep(4000);
	       
	        //Order Details1 
	        List<WebElement> orderdetails1 = driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div[1]/ul"));
	        orderclass(orderdetails1, "get the Order Details = ");
	        logger.info("get the Order Details = "+ orderdetails1);
	        Thread.sleep(2000);
	        
	     //click on shipping
	        WebElement shipping = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/section/div[2]/div[1]/div/div/div/aside/div[2]/div[1]/button")));
	  	    jse.executeScript("arguments[0].click();", shipping);
	       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", shipping);
	        System.out.println("open shipping details");
	        logger.info("open shipping details");
	 		 Thread.sleep(2000);

	     //click on itinerary 
	      WebElement itinerary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/section/div[2]/div[1]/div/div/div/aside/div[3]/div[1]/button")));
	       jse.executeScript("arguments[0].click();",itinerary);
	       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", itinerary);  
	        System.out.println("open itinerary details");         
	        logger.info("open itinerary details");
	         Thread.sleep(2000);
		     
		 
//		 //IOT Device
//	         WebElement IOT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"iddeviceinfo\"]")));
//	         jse.executeScript("arguments[0].click();",IOT);
//		    Thread.sleep(2000);
//		  WebElement device = driver.findElement(By.xpath("//*[@id=\"idanchorclose\"]"));
//		    jse.executeScript("arguments[0].click();",device);
//		    Thread.sleep(2000);
		    
		 //click on attachments icon     
		  WebElement Doc = driver.findElement(By.xpath("//*[@id=\"hlkUploadDocument\"]"));
		  jse.executeScript("arguments[0].click();",Doc);
		    System.out.println("click attachments icon");
		    logger.info("click attachments icon");
		    Thread.sleep(2000);
		    
		//add upload icon	
		    WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.id("adduploadicon")));
		    jse.executeScript("arguments[0].click();",upload);
		    System.out.println("Clicked on Upload button");
			logger.info("Clicked on Upload button");
			Thread.sleep(2000);
		   //doc name	
		    driver.findElement(By.id("txtDocName")).sendKeys("QUANTUM RI");
			  System.out.println("enter doc name");
			  logger.info("enter doc name");
			  Thread.sleep(5000);
		    //select file(xls)
			  WebElement SelectFile = driver.findElement(By.xpath("//*[@id=\"file\"]"));
				SelectFile.sendKeys("C:\\Users\\tgandhi\\eclipse-workspace\\Netship_s\\resources\\SampleFile78.xls");
				System.out.println("Send Image path");
				logger.info("Send Image path");
 
			//upload   
			  driver.findElement(By.xpath("//*[@id=\"btnUpload\"]")).click();
			    System.out.println("upload");
			    Thread.sleep(2000);
			    
				WebElement btnsave = driver.findElement(By.id("btnSave"));
				  jse.executeScript("arguments[0].click();",btnsave);
				  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class=\"ajax-loadernew\"]")));
		          Thread.sleep(4000);
				  System.out.println("Upload link is working proper.");		  
                  logger.info("Upload link is working proper.");
                  

					 WebElement canceld = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCancel")));
					 jse.executeScript("arguments[0].click();",canceld);
					 System.out.println("cancel doc popoup");
				     logger.info("cancel doc popup");
					Thread.sleep(2000);


				     //watch
					 if(driver.findElement(By.xpath("//*[@id=\"watchListBlack\"]")).isDisplayed()) {
						 WebElement black = driver.findElement(By.xpath("//*[@id=\"watchListBlack\"]"));
						 jse.executeScript("arguments[0].click();",black);
						 Thread.sleep(4000);
						  WebElement watchg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"watchListGreen\"]")));
						    jse.executeScript("arguments[0].click();",watchg);
						    System.out.println("click watch list green");
						    logger.info("click watch list green"); 
						    Thread.sleep(2000);
					 }
					 else {
						 WebElement green = driver.findElement(By.xpath("//*[@id=\"watchListGreen\"]"));
						 jse.executeScript("arguments[0].click();",green);
						 Thread.sleep(4000);
						 WebElement watchb = driver.findElement(By.xpath("//*[@id=\"watchListBlack\"]"));
						 jse.executeScript("arguments[0].click();",watchb);
						    System.out.println("click watch list black"); 
					 }
	     //Package details icon
	      WebElement packaged = driver.findElement(By.xpath("//*[@id=\"shipmentMenu\"]/nav[1]/ul/li[7]/a/img"));
	       jse.executeScript("arguments[0].click();",packaged); 
	       System.out.println("open package details popup");
	        logger.info("open package details popup"); 
	        Thread.sleep(5000);
	      WebElement close = driver.findElement(By.id("btnclose"));
	      jse.executeScript("arguments[0].click();",close);
	        System.out.println("close package popup");
	        logger.info("close package popup");
	        Thread.sleep(2000);
	      
		 //Email icon
	      driver.findElement(By.id("idEmail")).click();
	        System.out.println("click email id icon");
	        logger.info("click email id icon");
	        Thread.sleep(2000);
	     //Enter email id 
	      driver.findElement(By.id("txtEmail")).sendKeys("tathya.gandhi@samyak.com");
	        System.out.println("enter email id");
	        logger.info("enter email id");
	        Thread.sleep(2000);
	     //Send email
	      driver.findElement(By.id("btnSendEmail")).click();
	        System.out.println("click to send button");
	        Thread.sleep(2000);
	        WebElement cancel = driver.findElement(By.id("btnclose"));
	        JavascriptExecutor cancel1 = (JavascriptExecutor)driver;
	        cancel1.executeScript("arguments[0].click();",cancel);  
	         logger.info("send email successfully");
	         Thread.sleep(2000);
	        
	      //refresh icon
	       driver.findElement(By.id("Idrefreshicon")).click();
	         System.out.println("click refresh icon");
	         logger.info("click refresh icon");
	         Thread.sleep(4000);
	     //back    
	      driver.navigate().back();   
          Thread.sleep(2000);
	}

public static void orderclass(List<WebElement> data,String value){
	  
	  for(int count = 0; count<data.size();count++) {
		  String addedvalue = data.get(count).getText();
		  System.out.println(value + addedvalue);
	  }
}
}
