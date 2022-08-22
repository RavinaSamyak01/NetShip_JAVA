package master_Screen;
import base.BaseInit;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reorder_Log extends BaseInit{
	

  @Test 
  public void reorderLog() throws InterruptedException {
	  JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll
	  WebDriverWait wait = new WebDriverWait(driver, 50);// wait time

	    //Reorder Log
		 WebElement reorder = driver.findElement(By.xpath("//*[@id=\"ReOrderLogTab\"]"));
		 jse.executeScript("arguments[0].click();",reorder);
		   System.out.println("open Reorder Log");
		   logger.info("open Reorder Log");
		   Thread.sleep(2000);
		   WebElement clientR = driver.findElement(By.xpath("//*[@id=\"ddlClient\"]"));
		   jse.executeScript("arguments[0].click();",clientR);
	     	Select list = new Select(clientR);
	   	  list.selectByValue("950693");
	       System.out.println("select billing account client");
	       logger.info("select billing account client");
	       Thread.sleep(5000);
       
	   //FSL
        WebElement Fsl = driver.findElement(By.xpath("//*[@id=\"ddlfsl\"]"));
        jse.executeScript("arguments[0].click();",Fsl);;
         Select list1 = new Select(Fsl);
         list1.selectByValue("string:5509");
           System.out.println("open Fsl");
           logger.info("open Fsl");
           Thread.sleep(2000);
           
           //class code
       //Search
        WebElement partsR = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
        jse.executeScript("arguments[0].click();",partsR);
          System.out.println("Search parts reorder");
          logger.info("Search parts reorder");
            
          Thread.sleep(4000);
        //verify the parts account  
		  List<WebElement> account  = driver.findElements(By.xpath("//tbody[@class='ng-scope']//tr[1]//td[1]"));
		    Accountnumber(account, "select the account = ");
		    //Assert.assertEquals(account,"950692");
		    System.out.println("get the parts records account="+account);
		    logger.info("get the parts records account="+account);
		    Thread.sleep(2000);
		    

		     
		 //MinQty
		     WebElement Qty = driver.findElement(By.xpath("//*[@id=\"txtReorderPoint_0\"]"));
		       Qty.clear();
		       Qty.sendKeys("10");
		       logger.info("Enter Min Qty");   
		       
		 //MaxQty
			 WebElement MQty = driver.findElement(By.xpath("//*[@id=\"txtReorderPoint_0\"]"));
			       MQty.clear();
			       MQty.sendKeys("11");
			       logger.info("Enter Max Qty");
		
	    // save parts details
			   WebElement savep = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"hlkSaveReorder\"]")));
			   jse.executeScript("arguments[0].click();",savep);
			   System.out.println("save parts recorder details");
			   logger.info("save parts recorder details");	
			   
		       //back to active order
		       WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
		       jse.executeScript("arguments[0].click();",back);
		         System.out.println("Back to active order screen");
		         logger.info("Back to active order screen");
		         Thread.sleep(3000);	   
 }

  public static void Accountnumber(List<WebElement> data,String value){
	  for(int count = 0; count<data.size();count++) {
		  String addedvalue = data.get(count).getText();
		  System.out.println(value + addedvalue);
  }
  }

}


