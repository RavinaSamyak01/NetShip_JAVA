package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ForgotPassword extends BaseInit {
@Test
	public void forgotPassword() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor) driver;// scroll,click
	
	//Logout
	 WebElement username = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
	   username.click();
	   System.out.println("open username dropdown");
	   Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"hrefLogout\"]")).click();
	   System.out.println("Logout");
	   logger.info("Logout");
	   Thread.sleep(2000);
	   
	   //enter wrong id pw
	   driver.findElement(By.id("inputUsername")).sendKeys("tathya2");
		driver.findElement(By.id("inputPassword")).sendKeys("Tathya@123");
		WebElement Signin = driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]"));
		Signin.click();
		System.out.println("sign in");
		
		
		//click forgot password
			WebElement forgot = driver.findElement(By.xpath("//*[@id=\"hrefForgotPW\"]"));
		   jse.executeScript("arguments[0].click();",forgot);
		     System.out.println("forgot password");
		     logger.info("forgot password");
		     
		//forgot password details	
		driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("tathya2");
		driver.findElement(By.xpath("//*[@id=\"inputEmilId\"]")).sendKeys("puagent@samyakinfo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnBckLogin\"]")).click();
		Thread.sleep(2000);
		
		//again login
		   driver.findElement(By.id("inputUsername")).sendKeys("tathya2");
			driver.findElement(By.id("inputPassword")).sendKeys("Tathya@12");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]"));
			login.click();
			System.out.println("sign in");			
		
			
		//2 click forgot password
         WebElement forgotc = driver.findElement(By.xpath("//*[@id=\"hrefForgotPW\"]"));
          jse.executeScript("arguments[0].click();", forgotc);
            System.out.println("forgot password");
            logger.info("forgot password");
    
           //forgot password details
            driver.findElement(By.xpath("//*[id=\"inputUsername\"]")).sendKeys("tathya2");
            driver.findElement(By.xpath("//*[id=\"inputEmailid\"]")).sendKeys("puagnet@samyakinfo.com");
             Thread.sleep(2000);
            driver.findElement(By.xpath("//*[id=\"btnBckLogin\"]")).click();
            Thread.sleep(2000);
            
          //again login
            driver.findElement(By.id("inputUsername")).sendKeys("tathya2");
            driver.findElement(By.id("inputPassword")).sendKeys("Tathya@12");
            WebElement login1 = driver.findElement(By.xpath("//*[@id=\"btnSingIn\"]"));
            login1.click();
            System.out.println("sign in");
}

}
