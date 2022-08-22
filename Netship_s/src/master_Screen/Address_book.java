package master_Screen;
import org.testng.annotations.Test;
import base.BaseInit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Address_book  extends BaseInit{


  @Test
  public void addressBook() throws InterruptedException {
      JavascriptExecutor jse = (JavascriptExecutor)driver;

	  Thread.sleep(2000);
	 //Address book 
	  WebElement addressbook = driver.findElement(By.xpath("//*[@id=\"AddressBookTab\"]"));
	  jse.executeScript("arguments[0].click();",addressbook);
	  System.out.println("Click on Address book icon");
	  logger.info("Click on Address book icon");
	  Thread.sleep(4000);
	  
	 //Refresh
	  WebElement refresh = driver.findElement(By.xpath("//*[@id=\"hlkRefreshAddress\"]"));
	  jse.executeScript("arguments[0].click();",refresh);
	    System.out.println("Refresh");
	    logger.info("Refresh");
	    Thread.sleep(2000);
	    
     //bussiness name
	    driver.findElement(By.xpath("//*[@id=\"txtBusinessName\"]")).sendKeys("TATHYA");
		  WebElement search = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
		  jse.executeScript("arguments[0].click();",search);
		  List<WebElement> validation  = driver.findElements(By.xpath("//*[@id=\"errorid\"]"));
		    Addressvalidation(validation, "select the customer = ");
		       logger.error("Validation message = "+ validation);
		       Thread.sleep(2000);
		    
	 //Customer
	  WebElement customer = driver.findElement(By.xpath("//*[@id=\"ddlClient\"]"));
	  jse.executeScript("arguments[0].click();",customer);
	  Select customer1 = new Select(customer);
	  customer1.selectByValue("950693");
	    System.out.println("open customer dropdown");
	    logger.info("open customer dropdown");
	    Thread.sleep(2000);
      
	 //search
	  WebElement search1 = driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
	  jse.executeScript("arguments[0].click();",search1);
	    System.out.println("search customer Address");
	    logger.info("search customer Address");
	    
      
	  WebElement table = driver.findElement(By.xpath("//*[@id=\"hlkEditReorder\"]"));  
	  jse.executeScript("arguments[0].click();",table);
        jse.executeScript("scroll(0,1000)");
        System.out.println("select table edit button");
        logger.info("select table edit button");
        Thread.sleep(3000);
         
       
        //first name 
        WebElement name = driver.findElement(By.xpath("//*[@id=\"txtfirstname\"]"));
          name.clear();
          name.sendKeys("tathya");
          System.out.println("Enter first name");
          logger.info("Enter first name");
          jse.executeScript("scroll(0,-1000)");
       //save
        WebElement save =driver.findElement(By.xpath("//*[@id=\"imgSave\"]"));
        jse.executeScript("arguments[0].click();",save);
          System.out.println("save");
          logger.info("save");
          Thread.sleep(2000);
          //driver.close();
          
       //back to active order
        WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
        jse.executeScript("arguments[0].click();",back);
          System.out.println("Back to active order screen");
          logger.info("Back to active order screen");
          Thread.sleep(3000);     
  }

  public static void Addressvalidation(List<WebElement> data,String value){
	  System.out.println("added value =="+data.size());
	  for(int count = 0; count<data.size();count++) {
		  String addedvalue = data.get(count).getText();
		  System.out.println(value + addedvalue);
}
}
  }
