package logoutDiv;

import base.BaseInit;
import base.extentreports;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrderPreferences extends BaseInit {
@Test
	public void orderPrefrences() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll
		WebDriverWait wait = new WebDriverWait(driver, 50);// wait time
		
	    //Preferences
		WebElement user = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();",user);
		System.out.println("open username dropdown");
		   Thread.sleep(2000);
		   
		//Order preferences   
	     WebElement order = driver.findElement(By.id("idOrderPreferences"));
	     jse.executeScript("arguments[0].click();",order);
	       System.out.println("click order prefrences");
		   logger.info("click order prefrences");
		   Thread.sleep(2000);
		   
		//account
	     WebElement Account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpClient\"]")));
	       jse.executeScript("arguments[0].click();", Account);
	       Select list1 = new Select(Account);
	       list1.selectByValue("950694");
	       System.out.println("Select Customer account");
	       logger.info("Select Customer account");
	       Thread.sleep(2000);
	    
	       //Pickup country
	       WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpCountry\"]")));
	       jse.executeScript("arguments[0].click();", country);
	       Select list2 = new Select(country);
	       list2.selectByValue("string:USA");
	       System.out.println("Select Country");
	       logger.info("Select Country");
	       Thread.sleep(2000);
	       
	     //zipcode pickup          
	       WebElement zipcodeP = driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]"));
	       zipcodeP.clear();
	       zipcodeP.sendKeys("95501");
	       WebElement zipcodep = driver.findElement(By.xpath("//*[@id=\"txtPUZipCode\"]"));
	    		   zipcodep.sendKeys(Keys.TAB);
	       System.out.println("Enter zipcode pickup");
	       logger.info("Enter zipcode pickup");
	       Thread.sleep(2000);
	       
	       //company Pickup
	          WebElement CompanyPickup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtCompany\"]")));
	           CompanyPickup.clear();
	           CompanyPickup.sendKeys("DEL");
	           System.out.println("Enter Pickup company");
	           logger.info("Enter Pickup company");
			   Thread.sleep(2000);
			   
			 //phone Pickup
			     WebElement pphone = driver.findElement(By.xpath("//*[@id=\"txtPhone\"]"));
			     pphone.clear();
			     pphone.sendKeys("8479564641");
			       System.out.println("enter phone number");
			       logger.info("enter phone number");  
	               Thread.sleep(2000);
			    
	               
	       	    //address pickup        
	       	
	           	    WebElement addressp = driver.findElement(By.xpath("//*[@id=\"txtAddress\"]"));
	           	    addressp.clear();
	           	    addressp.sendKeys("932 Vandervort Ford");  
	         	       System.out.println("Enter new address pickup");
	         	       logger.info("Enter new address pickup");
	                Thread.sleep(2000);
	         
	               
		    //Country delivery
			 WebElement countrydel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"drpDLCountry\"]")));
			   jse.executeScript("arguments[0].click();", countrydel);
			   Select list3 = new Select(country);
			   list3.selectByValue("string:USA");
			   System.out.println("Select delivery Country");
			   logger.info("Select delivery Country");
			   Thread.sleep(5000);
			   
	   	//zipcode delivery          
			 WebElement zipcoded = driver.findElement(By.xpath("//*[@id=\"txtDLZipCode\"]"));
					 zipcoded.clear();
					 zipcoded.sendKeys("92260");
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@id=\"txtDLZipCode\"]")).sendKeys(Keys.TAB);
			         Thread.sleep(5000);
					 System.out.println("Enter new zipcode del");
			   logger.info("Enter new zipcode del");
			   Thread.sleep(10000);
	
	    //company delivery
	    WebElement CompanyDel= driver.findElement(By.xpath("//*[@id=\"txtCompanydel\"]"));
         CompanyDel.clear();
         CompanyDel.sendKeys("HP");
         System.out.println("Enter Del company");
         logger.info("Enter Del company");
         Thread.sleep(2000);
         
	    //phone delivery
		     WebElement phoned = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"txtPhonedel\"]")));
		     phoned.clear();
		     phoned.sendKeys("8569012488");
		       System.out.println("enter new phone number");
		       logger.info("enter new phone number");
		       Thread.sleep(2000);
		   
	    //address delivery        
		 WebElement addressd = driver.findElement(By.id("txtAddressdel"));
		   addressd.clear();
		   addressd.sendKeys("73030 El Paseo");  
		   Thread.sleep(10000);
		   addressd.sendKeys(Keys.TAB);
		   WebElement click = wait.until(ExpectedConditions.elementToBeClickable(By.id("lblDeptSuiteDel")));
		   jse.executeScript("arguments[0].click();",click);
		   System.out.println("Enter address del");
		   logger.info("Enter address del");  
		   Thread.sleep(4000);
		   
 	    //save   
	     WebElement save = driver.findElement(By.xpath("//*[@id=\"imgSave\"]"));
	     jse.executeScript("arguments[0].click();",save);
	     
	       System.out.println("save order prefrences details");
	       logger.info("save order preferences details");
	       Thread.sleep(2000);
	       
	       //error
	       if(driver.findElement(By.xpath("//*[@id=\"errorid\"]")).isDisplayed()) {
	    	   logger.info("error msg shown");
	       }else {}
	       
	        //back to active order
	        WebElement back = driver.findElement(By.xpath("//*[@id=\"ActiveOrdTab\"]"));
	        jse.executeScript("arguments[0].click();",back);
	          System.out.println("Back to active order screen");
	          logger.info("Back to active order screen");
	          Thread.sleep(3000);
	}

}
