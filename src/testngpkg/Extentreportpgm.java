package testngpkg;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

@Test
public class Extentreportpgm {
	WebDriver driver;
	String baseurl="https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	
	public void beftest()
	{
		reporter=new ExtentHtmlReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host_name:", "Localhost");
		extent.setSystemInfo("Os:", "Windows 11");
		extent.setSystemInfo("Tester_name:", "Radhika");
		extent.setSystemInfo("Browser_name:", "Chrome");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void setup()
	{
	driver.get(baseurl);	
	}
	
	@Test
	
	public void fbtitleverification() throws IOException
		{
		test=extent.createTest("Fb_title_verification");
		String exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
		
	}
	@Test
	public void fblogotest()
	{
		test=extent.createTest("Fb_logo_test");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
			
	}
	
	@AfterTest
	
	public void teardown()
	{
		extent.flush();
	}
	
	
	@AfterMethod
			
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshotpath=screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is"+result.getName());
		}
		 
	}
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./Screenshot/"+screenshotname +".png";
		
		FileHandler.copy(src, new File(destination));
		return destination;
	}
	
	
	
	
	
	
	

}
