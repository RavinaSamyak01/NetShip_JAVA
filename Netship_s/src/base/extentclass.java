package base;

import java.io.File;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentclass {
ExtentReports extent;
ExtentTest logger;

@BeforeSuite
public void startTest() {
	extent = new ExtentReports(System.getProperty("user.dir")+"test.output/extentclass.html",true);
	extent.addSystemInfo("Host Name","Software testing material");
	extent.addSystemInfo("Environment", "Automation testing");
	extent.addSystemInfo("User Name", "Tathya");
	
	extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	
}
@Test
public void passTest() {
	logger = extent.startTest("passTest");
	Assert.assertTrue(true);
	logger.log(LogStatus.PASS,"test case is passed");
	}
@AfterTest
public void endReport(){
	extent.flush();
	extent.close();
	
}
}
