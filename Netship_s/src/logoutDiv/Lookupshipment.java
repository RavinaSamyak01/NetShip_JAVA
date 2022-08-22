package logoutDiv;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseInit;
import base.extentreports;

public class Lookupshipment extends BaseInit{

	@Test
	public void lookupshipment() throws InterruptedException {
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
	    
	   //open username 	
        
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"divUsername\"]")));
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(user).click().build().perform();
		System.out.println("open username dropdown");
		logger.info("open username dropdown");
		Thread.sleep(2000);
		
	   //lookup shipment 	 
		WebElement lookup = wait.until(ExpectedConditions.elementToBeClickable(By.id("idLookUpShipment")));
		jse.executeScript("arguments[0].click();",lookup);
		System.out.println("open lookup shipment screen");
		logger.info("open lookup shipment screen");
	
		// trackorder validation
		WebElement trackv = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTrackOrder")));
		jse.executeScript("arguments[0].click();",trackv);
		System.out.println("check validation");
		logger.error("check validation at lookup shipment screen");
		Thread.sleep(2000);

		// Pickup id
		driver.findElement(By.id("txtPickupId")).sendKeys("3419834");
		System.out.println("enter pickup id");
		logger.info("Enter pickup id");
		Thread.sleep(2000);

		// click track order
		WebElement track = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTrackOrder")));
		jse.executeScript("arguments[0].click();",track);
		System.out.println("click on Track order");
		logger.info("click on track order");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
       //Enter BOL and Job id
		wait.until(ExpectedConditions.elementToBeClickable(By.id("txtBOL"))).sendKeys("126208319");

		driver.findElement(By.id("txtJobId")).sendKeys("32414600");
		logger.info("Enter BOl and Job Id");
		Thread.sleep(3000);
       //track order 
		WebElement trackO = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnTrackOrder")));
		jse.executeScript("arguments[0].click();",trackO);
		System.out.println("click on Track order");
		logger.info("click on Track order");
		
		   //Order Details 
	    List<WebElement> orderdetails = driver.findElements(By.xpath("//*[@id=\"collapseOne\"]/div[1]/ul"));
	    orderclass(orderdetails, "get the Order Details = ");
	    logger.info("get the Order Details = "+ orderdetails);
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
         Thread.sleep(4000);
	
		// attachment icon 
//		if(driver.findElement(By.xpath("//*[@id=\"iduploadgreen\"]")).isDisplayed()){
//			WebElement aicon = driver.findElement(By.xpath("//*[@id=\"iduploadgreen\"]"));
//			jse.executeScript("arguments[0].click();",aicon);	
//		}
//		else {
			WebElement uploadI = driver.findElement(By.xpath("//*[@id=\"hlkUploadDocument\"]"));
			jse.executeScript("arguments[0].click();",uploadI);
		//}
		System.out.println("Click on attachment icon");
		logger.info("Click on attachment icon");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class=\"ajax-loadernew\"]")));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@ng-form=\"DocDetailsForm\"]")));
		WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"adduploadicon\"]")));
		jse.executeScript("arguments[0].click();",upload);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtDocName")));
		driver.findElement(By.id("txtDocName")).sendKeys("AUTOPdoshiDocument1");
		// DEV
		// driver.findElement(By.id("file")).sendKeys("./DataFiles/Job Upload Doc
		// DEV.xls");
		// Staging
		driver.findElement(By.id("file"))
				.sendKeys("C:\\Users\\tgandhi\\eclipse-workspace\\Netship_s\\resources\\SampleFile78.xls");
		Thread.sleep(4000);

		WebElement uploaddoc = driver.findElement(By.id("btnUpload"));
		jse.executeScript("arguments[0].click();",uploaddoc);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successid")));
		Thread.sleep(4000);

		String Message6 = driver.findElement(By.id("successid")).getText();

		if (Message6.equals("Upload/Import Process Completed !")) {
			System.out.println(Message6);
		} else {
			Message6 = driver.findElement(By.id("errorid")).getText();
			System.out.println(Message6);
		}

		WebElement btnsave = wait.until(ExpectedConditions.elementToBeClickable(By.id("hlkaddUpload")));
		jse.executeScript("arguments[0].click();",btnsave);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class=\"ajax-loadernew\"]")));
          Thread.sleep(2000);
		  System.out.println("Upload link is working proper.");		  

//		if (driver.findElement(By.id("hrefDocError")).isDisplayed()) {
//			 driver.findElement(By.id("btnCancel")).click();
//		     System.out.println("cancel");
//			Thread.sleep(2000);
//		} else {
//			driver.findElement(By.id("btnSave")).click();
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class=\"ajax-loadernew\"]")));
//
//			driver.findElement(By.id("btnsaveandclose")).click();
//		     System.out.println("save and close");
//			Thread.sleep(4000);
//		}
		 driver.findElement(By.id("btnCancel")).click();
	     System.out.println("cancel");
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
		 Thread.sleep(4000);
		 
	 //Package details icon
      WebElement packaged = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shipmentMenu\"]/nav[1]/ul/li[7]/a/img")));
      jse.executeScript("arguments[0].click();",packaged);
      System.out.println("open package details popup");
      Thread.sleep(5000);
      WebElement close = driver.findElement(By.id("btnclose"));
      jse.executeScript("arguments[0].click();",close);
      System.out.println("close package popup");
      logger.info("Verify the package details pop up");
      Thread.sleep(2000);
      
	//Email icon
      WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("idEmail")));
      jse.executeScript("arguments[0].click();",email);
        System.out.println("click email id icon");
        logger.info("click email id icon");
        Thread.sleep(2000);
        
        //Send email validation
        WebElement emails = driver.findElement(By.id("btnSendEmail"));
        jse.executeScript("arguments[0].click();",emails);
          System.out.println("click to send button validation");
          
    //Enter email id
          if(driver.findElement(By.xpath("//*[@id=\"hrefErr\"]")).isDisplayed()){
      driver.findElement(By.id("txtEmail")).sendKeys("tathya.gandhi@samyak.com");
        System.out.println("enter email id");
        logger.info("Enter email id");
        Thread.sleep(2000);
          }else {
              WebElement cancel = driver.findElement(By.id("btnclose"));
              jse.executeScript("arguments[0].click();",cancel); 
              System.out.println("email popup close without mail id");
              logger.info("email popup close without mail id");
          }
     //Send email
      driver.findElement(By.id("btnSendEmail")).click();
        System.out.println("click to send button");
        logger.info("click to send button");
        Thread.sleep(2000);
        WebElement cancel = driver.findElement(By.id("btnclose"));
        jse.executeScript("arguments[0].click();",cancel);  
      
      //refresh icon
       WebElement refresh = wait.until(ExpectedConditions.elementToBeClickable(By.id("Idrefreshicon")));
       jse.executeScript("arguments[0].click();",refresh);
       System.out.println("click refresh icon");
       logger.info("click on refresh icon");
       Thread.sleep(2000);
      
       driver.navigate().back();
       Thread.sleep(2000);
       
       driver.navigate().back();
       Thread.sleep(3000);
       
       //back to active order
       WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActiveOrdTab\"]")));
       jse.executeScript("arguments[0].click();",back);
         System.out.println("Back to active order screen");
         logger.info("Back to active order screen");
         Thread.sleep(3000);
	}
	public static void orderclass(List<WebElement> data,String value){
		  
		  for(int count = 0; count<data.size();count++) {
			  String addedvalue = data.get(count).getText();
			  System.out.println(value + addedvalue);
		  }
	}

}
