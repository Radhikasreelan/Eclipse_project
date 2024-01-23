package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void titleVerification()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void pagesrc()
	{
		String src=driver.getPageSource();
		if(src.contains("Gmail")) 
		{
			System.out.println("Present in the page");
			
		}
		else
		{
			System.out.println("Not Present in the page");
		}
	}
	@After
	public void tearDown()
	{
	driver.quit();	
	}
	

}
