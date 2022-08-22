package master_Screen;

import org.testng.annotations.Test;
import base.BaseInit;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Get_Quote extends BaseInit {   
	
	@Test
  public void getQuote() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;//scrool,click
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		Actions actions = new Actions(driver);

		Thread.sleep(2000);
		
	WebElement quote =  driver.findElement(By.xpath("//*[@id=\"imgquote\"]"));
	 jse.executeScript("arguments[0].click();",quote);
	   System.out.println("Click on Get Quote");
	   logger.info("Click on Get Quote");
       Thread.sleep(4000);
      
	   
     WebElement continueb = driver.findElement(By.xpath("//*[@id=\"btnContinue\"]"));
	   jse.executeScript("arguments[0].click();",continueb);
	   Thread.sleep(2000);
       System.out.println("click");
	   Thread.sleep(2000);
		 
	  if(driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]")).getText()=="") {
			  List<WebElement> zipcodeV = driver.findElements(By.xpath("//*[@id=\"errorid\"]/li[1]"));
			  validation(zipcodeV,"get the validation mess ==");
			  //System.out.println("get the validation mess =="+);
			  logger.info("Please Enter Pickup Zipcode/Airport");
		  }
		  else {
			  logger.info("2");	  
			  
		  }
	   
	   Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]")).sendKeys("72201");
       System.out.println("enter Pickup zipcode");
       logger.info("enter Pickup zipcode");
       Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"txtDLZipCode\"]")).sendKeys("95501");
       System.out.println("enter Del zipcode");
       logger.info("enter Del zipcode");
       Thread.sleep(3000);
       
    //package type
     WebElement packagetype = driver.findElement(By.id("drpPackageType_0"));
       Select select = new Select(packagetype);
       int dropdownvalue = driver.findElements(By.cssSelector("#drpPackageType_0>option")).size();
       System.out.println(dropdownvalue);
       logger.info("dropdownvalue");
     Random random = new Random();
     int index = random.nextInt(dropdownvalue);
     select.selectByIndex(index);
       Thread.sleep(3000);
       logger.info("dropdownvalue is selected");
       
     
    //Qty
     WebElement Qty = driver.findElement(By.xpath("//*[@id=\"txtQuantity_0\"]"));
       Qty.clear();
       Qty.sendKeys("10");
       logger.info("Enter Qty");
    //Weight  
     WebElement Weight = driver.findElement(By.xpath("//*[@id=\"txtWeight_0\"]"));
       Weight.clear();
       Weight.sendKeys("10");
       logger.info("Enter Weight");     
     WebElement weight = driver.findElement(By.xpath("//*[@id=\"selWtUOM\"]"));
     jse.executeScript("arguments[0].click();",weight);
     driver.findElement(By.xpath("//*[@id=\"selWtUOM\"]")).sendKeys(Keys.TAB);
     driver.findElement(By.xpath("//*[@id=\"selWtUOM\"]")).sendKeys(Keys.ENTER);
 
   //Length  
     WebElement Length = driver.findElement(By.xpath("//*[@id=\"txtDimLength_0\"]"));
       Length.clear();
       Length.sendKeys("10");
       logger.info("Enter Length");
       
   //Width  
     WebElement Width = driver.findElement(By.xpath("//*[@id=\"txtDimWidth_0\"]"));
       Width.clear();
       Width.sendKeys("10");
       logger.info("Enter Width");
       
    //Height  
     WebElement Height = driver.findElement(By.xpath("//*[@id=\"txtDimHeight_0\"]"));
       Height.clear();
       Height.sendKeys("10");
       logger.info("Enter Height");
    //commodity
     driver.findElement(By.xpath("//*[@id=\"txtCommodity_0\"]")).sendKeys("10");
       Thread.sleep(2000);
       logger.info("Enter commodity");
       
    //Get Quote
       WebElement Quote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnContinue\"]")));
       jse.executeScript("arguments[0].click();",Quote);
       System.out.println("click to Get quote");
       logger.info("Click to Get Quote");
       Thread.sleep(4000);
//       jse.executeScript("scroll(0,1000)");
//       Thread.sleep(2000);
//       jse.executeScript("scroll(0,-1000");
//       Thread.sleep(2000);
       
    
    //Advance search
       WebElement advances = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"advanceTab\"]")));
       jse.executeScript("arguments[0].click();",advances);
       System.out.println(" Open Advance search ");
       logger.info("Open Advance search"); 
       Thread.sleep(2000);
        
     WebElement packageradio = driver.findElement(By.xpath("//*[@id=\"inlineRadio1\"]"));  
       jse.executeScript("arguments[0].click();",packageradio);
       System.out.println("click package radio");
       logger.info("click package radio");
       Thread.sleep(2000);
        
     WebElement datetime = driver.findElement(By.xpath("//*[@id=\"txtDriverArrival\"]")); 
       datetime.sendKeys("05/25/2022 22:56");
       logger.info("Enter date and time");
       Thread.sleep(2000);
   
     WebElement click = driver.findElement(By.xpath("//*[@id=\"lblWhenPickup\"]"));
     actions.moveToElement(click).click().build().perform();
     Thread.sleep(2000);
     
    //pickup zipcode
     driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]")).sendKeys("72217");
       System.out.println("pickup zipcode");
       logger.info("pickup zipcode");
       Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"txtDLZipCode\"]")).sendKeys("95501");
       System.out.println("delivery zipcode");
       logger.info("delivery zipcode");
       Thread.sleep(4000);
    
    //package icon
       WebElement picon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkaddPackage\"]")));
       jse.executeScript("arguments[0].click();",picon);
       Thread.sleep(2000);
      
      jse.executeScript("scroll(0,1000)");
      logger.info("click on package icon");
      
    //continue button
      WebElement Cbutton =driver.findElement(By.xpath("//*[@id=\"btnContinue\"]"));
      jse.executeScript("arguments[0].click();",Cbutton);
        System.out.println("click on continue button");
        logger.info("click on continue button");
        Thread.sleep(2000); 
        
      WebElement shipcontinue = driver.findElement(By.xpath("//*[@id=\"btnShipContinue\"]"));
      jse.executeScript("arguments[0].click();",shipcontinue);
        System.out.println("shipping continue");
        logger.info("shipping continue");
        Thread.sleep(4000);

        WebElement shipcontinue1 = driver.findElement(By.xpath("//*[@id=\"btnShipContinue\"]"));
        jse.executeScript("arguments[0].click();",shipcontinue1);
          System.out.println("shipping continue");
          logger.info("shipping continue");
          Thread.sleep(4000);
          
       //Rate calculator
         WebElement rate = driver.findElement(By.xpath("//*[@id=\"RateCalc\"]"));
          jse.executeScript("arguments[0].click();",rate );
          System.out.println("click on rate calculator");
          logger.info("click on rate calculator");
          Thread.sleep(2000);
          
       //Account no
		   WebElement ac = driver.findElement(By.xpath("//*[@id=\"drpClient\"]"));
		   jse.executeScript("arguments[0].click();",ac);
	     	Select list = new Select(ac);
	   	  list.selectByValue("string:950693");
	       System.out.println("select account");
	       logger.info("select account");
	       Thread.sleep(5000);  
          
	    //pieces
	     WebElement pieces = driver.findElement(By.xpath("//*[@id=\"txtpieces\"]"));
	     pieces.sendKeys("01");
	     System.out.println("Enter pieces value");
	     logger.info("Enter pieces value");
	     Thread.sleep(2000);
	     
	    //Weight
	     WebElement Rweight = driver.findElement(By.xpath("//*[@id=\"txtweight\"]"));
	     Rweight.sendKeys("11");
	     System.out.println("Enter weight value");
	     logger.info("Enter weight value");
	     Thread.sleep(2000);
	    
	    //rate pickup zipcode
	     WebElement RateP = driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]"));
	     RateP.sendKeys("72201");
	     System.out.println("Enter pickup zipcode");
	     logger.info("Enter pickup zipcode");
	     Thread.sleep(2000);
	     
		//rate pickup zipcode
	     WebElement RateD = driver.findElement(By.xpath("//*[@id=\"txtDLZipCode\"]"));
	     RateD.sendKeys("95501");
	     System.out.println("Enter Del zipcode");
	     logger.info("Enter Del zipcode");
	     Thread.sleep(2000);

	     //service
		   WebElement service = driver.findElement(By.xpath("//*[@id=\"cmbservice\"]"));
		   jse.executeScript("arguments[0].click();",service);
	     	Select list1 = new Select(service);
	   	  list1.selectByValue("LOC");
	       System.out.println("select services");
	       logger.info("select services");
	       Thread.sleep(5000);	     
	       
	     //Calculator
	      driver.findElement(By.xpath("//*[@id=\"btnCalculator\"]")).click();
	       System.out.println("Click on Calculator");
	       logger.info("Click on Calculator");
	       jse.executeScript("scroll(0,1000)");
	       Thread.sleep(4000);
	       
	    //back to active order
        WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
        jse.executeScript("arguments[0].click();",back);
          System.out.println("Back to active order screen");
          logger.info("Back to active order screen");
          Thread.sleep(3000);  
  }
  public static void validation(List<WebElement>data,String value) {

		for(int count =0; count<data.size();count++) {
			String addedvalue = data.get(count).getText();
			System.out.println(value + addedvalue);
		}
	}


}
