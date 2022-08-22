package base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseInit {
	public static Properties storage = null;
	public static WebDriver driver;
	public static Logger logger;
	public static ExtentReports report;
	public static ExtentTest test;

	String driverPath = ("D:\\Tathya\\selenium\\chromedriver_win32\\chromedriver.exe");

	@BeforeSuite
	public void base() throws InterruptedException {

		// Move to extentreport file

		System.out.println("lunching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		startTest();

		driver.get("https://stagingns.nglog.com");
		String logFilename = this.getClass().getSimpleName();
		logger = Logger.getLogger(logFilename);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://stagingns.nglog.com");
		Login("tathya01", "Tathya@01");

	}
	@BeforeMethod
    public void testMethodName(Method method) {



       String testName = method.getName();
        test = report.startTest(testName);



   }
	public static void startTest() {
		// You could find the xml file below. Create xml file in your project and copy
		// past the code mentioned below

		System.setProperty("extent.reporter.pdf.start", "true");
		System.setProperty("extent.reporter.pdf.out", "./Report/PDFExtentReport/ExtentPDF.pdf");

		// report.loadConfig(new File(System.getProperty("user.dir")
		// +"\\extent-config.xml"));
		report = new ExtentReports("./Report/ExtentReport/ExtentReportResults.html", true);
		// test = report.startTest();
	}

	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/Report/NS_Screenshot/" + screenshotName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	public static String getFailScreenshot(WebDriver driver, String screenshotName) throws Exception {
		// String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("user.dir") + "/Report/FailedTestsScreenshots/" + screenshotName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	@AfterMethod
	public void getResult(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			// test.log(LogStatus.FAIL, "Test Case Failed is " +
			// result.getThrowable().getMessage());
			test.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
			// To capture screenshot path and store the path of the screenshot in the string
			// "screenshotPath"
			// We do pass the path captured by this mehtod in to the extent reports using
			// "logger.addScreenCapture" method.
			String screenshotPath = getFailScreenshot(driver, result.getName());
			// To add it in the extent report
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, "Test Case Pass is " + result.getName());
			String screenshotPath = getScreenshot(driver, result.getName());
			// To add it in the extent report
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}
	}
	public void Login(String username, String password) throws InterruptedException {
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		WebElement Signin = driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]"));
		Signin.click();

	}

	public WebElement isElementPresent(String propkey) {

		try {

			if (propkey.contains("xpath")) {

				return driver.findElement(By.xpath(storage.getProperty(propkey)));

			} else if (propkey.contains("id")) {

				return driver.findElement(By.id(storage.getProperty(propkey)));

			} else if (propkey.contains("name")) {

				return driver.findElement(By.name(storage.getProperty(propkey)));

			} else if (propkey.contains("linkText")) {

				return driver.findElement(By.linkText(storage.getProperty(propkey)));

			} else if (propkey.contains("className")) {

				return driver.findElement(By.className(storage.getProperty(propkey)));

			}
			if (propkey.contains("cssSelector")) {

				return driver.findElement(By.cssSelector(storage.getProperty(propkey)));
			}

			else {

				System.out.println("propkey is not defined");

				logger.info("prop key is not defined");
			}

		} catch (Exception e) {

		}
		return null;
	}

	@AfterSuite
	public void logout() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		StringBuilder msg = new StringBuilder();

		// Logout
		WebElement username = driver.findElement(By.xpath("//*[@id=\"divUsername\"]"));
		jse.executeScript("arguments[0].click();", username);
		System.out.println("open username dropdown");
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"hrefLogout\"]"));
		jse.executeScript("arguments[0].click();", logout);
		System.out.println("Logout");
		logger.info("Logout");

		Thread.sleep(5000);
		report.flush();
		Thread.sleep(5000);
		endTest();

		driver.close();

		System.out.println("====Sending Email====");
		logger.info("====sending Email====");

		// Move to extentreport file

		// String Env = storage.getProperty("Env");

		msg.append("*** This is automated generated email and send through automation script ***" + "\n");
		msg.append("Please find attached file of Report and Log");

		String subject = "Selenium Automation Script: Netship";
		//String File = "C:\\Users\\tgandhi\\eclipse-workspace\\Netship_s\\test-output\\emailable-report.html";
		String File = "C:\\Users\\tgandhi\\eclipse-workspace\\Netship_s\\Report\\ExtentReport\\ExtentReportResults.html";

		try {
			// /kunjan.modi@samyak.com, pgandhi@samyak.com,parth.doshi@samyak.com,ravina.prajapati@samyak.com
			SendEmail.sendMail("tathya.gandhi@samyak.com,ravina.prajapati@samyak.com", subject, msg.toString(), File);
		} catch (Exception ex) {
			logger.error(ex);
		}
	}

}