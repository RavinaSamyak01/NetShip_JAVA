package master_Screen;
import base.BaseInit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Map_view extends BaseInit {
  
	@Test
    public void mapview() throws InterruptedException {
	  JavascriptExecutor jse = (JavascriptExecutor)driver;// scroll
	  WebDriverWait wait = new WebDriverWait(driver,7000);//wait time
	
	//Map icon  
	 WebElement  mapI = driver.findElement(By.xpath("//*[@id=\"imgMapView\"]"));
	 jse.executeScript("arguments[0].click();",mapI);
	   System.out.println("Click Map view icon");
	   logger.info("Click Map view icon");
	   Thread.sleep(5000);
	    
	//refresh
     WebElement refresh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"refresh\"]")));
       jse.executeScript("arguments[0].click();", refresh); 
       System.out.println("click on refresh");
       logger.info("click on refresh");
       Thread.sleep(5000);
           
	//billing account reset 
     WebElement Billingreset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpcustomer\"]")));
       jse.executeScript("arguments[0].click();", Billingreset);
       Select list1 = new Select(Billingreset);
       list1.selectByValue("950693");
       System.out.println("Select billing account map view");
       logger.info("Select billing account map view");
       Thread.sleep(5000);
         
    //reset  
     WebElement reset = driver.findElement(By.xpath("//*[@id=\"btnResetCharges\"]"));
       jse.executeScript("arguments[0].click();", reset); 
       System.out.println("click on reset");
       logger.info("click on reset");
       Thread.sleep(5000);
            
    //billing account search   
     WebElement Billingac = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpcustomer\"]")));
       jse.executeScript("arguments[0].click();", Billingac);
       Select list2 = new Select(Billingac);
       list2.selectByValue("950693");
       System.out.println("Select billing account map view");
       logger.info("Select billing account map view");
       Thread.sleep(5000);     
       
    //Pickup    
     driver.findElement(By.xpath("//*[@id=\"txtpickupId\"]")).sendKeys("3424913");
       System.out.println("Enter pickup id");
       logger.info("Enter pickup id");
       Thread.sleep(5000);
    
       //search pickup id   
       WebElement searchp = driver.findElement(By.xpath("//*[@id=\"btnSearchCharges\"]"));
         jse.executeScript("arguments[0].click();", searchp); 
         System.out.println("Search pickup id");
         logger.info("Search pickup id");
         Thread.sleep(5000);
         
    //reset
         if(driver.findElement(By.id("refreshErr")).isDisplayed()) {
         WebElement reset1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"btnResetCharges\"]")));
         jse.executeScript("arguments[0].click();", reset1);    
         System.out.println("Reset");
         logger.info("Reset");
         Thread.sleep(5000);
         
         //billing account search   again
         WebElement Billingacs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpcustomer\"]")));
           jse.executeScript("arguments[0].click();", Billingacs);
           Select list3 = new Select(Billingacs);
           list2.selectByValue("950693");
           System.out.println("Select billing account map view");
           logger.info("Select billing account map view");
           Thread.sleep(5000); 
           
           WebElement searchp1 = driver.findElement(By.xpath("//*[@id=\"btnSearchCharges\"]"));
           jse.executeScript("arguments[0].click();", searchp1); 
           System.out.println("Search pickup id");
           logger.info("Search pickup id");
           Thread.sleep(5000);
           
          // click pickup id
           WebElement pid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mapdetails\"]/div[1]/div/div[1]/a/span")));
           jse.executeScript("arguments[0].click();", pid);    
           System.out.println("Click pickup id");
           logger.info("Click pickup id");
           Thread.sleep(5000);  
           
           driver.navigate().back();
           Thread.sleep(2000);

         }else {}
	}
       
}
