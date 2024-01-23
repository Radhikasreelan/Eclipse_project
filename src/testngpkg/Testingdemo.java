package testngpkg;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Testingdemo {

	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
		
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
				
	}
	@Test(priority = 3,invocationCount = 3)
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority = 1,enabled=false )
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority = 2,dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("test 3");
	}
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("after method details");
	}
	@AfterTest()
	public void tearDown()
	{
		System.out.println("After test");
		
	}
	
	
	
}
