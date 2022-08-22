package logoutDiv;
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

import base.BaseInit;

public class ManageBatchorder extends BaseInit {

@Test
public void userDetails() throws InterruptedException {
		
    JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll
	WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
	Actions actions = new Actions(driver);

  //manage batch order 
	Thread.sleep(4000);
	WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"divUsername\"]")));
	user.click();
        System.out.println("open username dropdown");
	    Thread.sleep(2000);
	  
	  WebElement batch = driver.findElement(By.id("idViewbatch"));
	  jse.executeScript("arguments[0].click();",batch);
	    System.out.println("Batch orders");
	    logger.info("click on manage batch order");
	    Thread.sleep(2000);
	//create new batch  
	  WebElement createbatch = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCreateBatch")));
	    jse.executeScript("arguments[0].click();",createbatch);
	    System.out.println("create new batch");
	    logger.info("create new batch");
	    Thread.sleep(2000);
	//save  
	  WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.id("imgSave")));
	  jse.executeScript("arguments[0].click();",save);
	    System.out.println("check validation create batch");
	    logger.error("check validation create batch");
        
      
   //enter pickup details
        WebElement pickup = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtcompany")));
        pickup.sendKeys("samyak");
       
      driver.findElement(By.id("txtPUZipCode")).sendKeys("95501");
      driver.findElement(By.id("txtPUZipCode")).sendKeys(Keys.TAB);
        Thread.sleep(4000);
       
      driver.findElement(By.id("txtaddressline")).sendKeys("101 kine");
        logger.info("Enter pickup details");
        Thread.sleep(2000);
      
   //Delivery batch    
      WebElement batchdel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkAdd\"]")));
		actions.moveToElement(batchdel).click().build().perform(); 
        System.out.println("open delivery popup");
        logger.info("open delivery popup");
        Thread.sleep(2000);
       
       //save package details for validation
        WebElement savedelv = driver.findElement(By.xpath("//a[contains(@id,'hlkSavePart')]//img[contains(@id,'imgSave')]"));
        jse.executeScript("arguments[0].click();",savedelv);
          Thread.sleep(2000);
          System.out.println("save package details for validation");
          logger.info("save package details for validation");
       
      //delivery details  
        WebElement del = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtdlcompany\"]")));
        del.sendKeys("samyak");
      driver.findElement(By.id("txtDLZipCode")).sendKeys("99501");
      Thread.sleep(2000);
      //driver.findElement(By.id("txtDLZipCode")).sendKeys(Keys.TAB);
      driver.findElement(By.id("txtDLZipCode")).sendKeys(Keys.ENTER);
        Thread.sleep(7000);
      driver.findElement(By.id("txtdladdressline")).sendKeys("9 lodrstoneden");
      driver.findElement(By.id("cmbdefualtservice")).click();
      //driver.findElement(By.id("cmbdefualtservice")).sendKeys(Keys.DOWN);
      driver.findElement(By.id("cmbdefualtservice")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        
        //select service 
        WebElement service = driver.findElement(By.xpath("//*[@id=\"cmbdefualtservice\"]"));
        jse.executeScript("arguments[0].click();",service);
        Select service1 = new Select(service);
        service1.selectByValue("LOC");
         System.out.println("Select service level");
         logger.info("Select service level");
         Thread.sleep(2000);
        System.out.println("Enter Delivery details");
        logger.info("Enter Delivery details");
      
    //package information
      WebElement packageI = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hrefAddNew\"]")));
      jse.executeScript("arguments[0].click();",packageI);
      System.out.println("add new package");
      logger.info("add new package");
      Thread.sleep(2000);
      
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
        Thread.sleep(2000);
  
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
      
     //pkg tracking number
      driver.findElement(By.xpath("//*[@id=\"txtPackageTrackNum_0\"]")).sendKeys("010");
        logger.info("Enter package information");
        Thread.sleep(2000);
               
      //save package details
      driver.findElement(By.xpath("//a[contains(@id,'hlkSavePart')]//img[contains(@id,'imgSave')]")).click();
        Thread.sleep(2000);
        System.out.println("save package details");
        logger.info("save package details");
        
   //save delivery details    
      WebElement savedel = driver.findElement(By.xpath("//a[contains(@id,'hlkSave')]//img[contains(@id,'imgSave')]"));
      jse.executeScript("arguments[0].click();",savedel);
        System.out.println("save pickup delivery details");
        logger.info("save pickup delivery details");
        Thread.sleep(3000);
    
    //edit delete batch order  
      WebElement edit = driver.findElement(By.partialLinkText("Edit"));
      jse.executeScript("arguments[0].click();",edit);
        System.out.println("edit");
        logger.info("edit");
        Thread.sleep(2000);
        
      WebElement backL = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkBackToScreen\"]")));
      jse.executeScript("arguments[0].click();",backL);
        System.out.println("back list screen");
        Thread.sleep(2000);
        
      WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Delete")));
      jse.executeScript("arguments[0].click();",delete);
        System.out.println("delete");
        logger.info("edit delete batch order");
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        //back to active order
        WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ActiveOrdTab\"]")));
        jse.executeScript("arguments[0].click();",back);
          System.out.println("Back to active order screen");
          logger.info("Back to active order screen");
          Thread.sleep(4000);
      
	}

}
