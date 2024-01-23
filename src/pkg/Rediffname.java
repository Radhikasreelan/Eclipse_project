package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffname {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@After
	public void tearDown()
	{
	driver.quit();	
	}
	@Test
	 public void test()
	{
		boolean t= driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(t)
		{
			System.out.println("logo is enabled");	
		}
		else
		{
		System.out.println("logo is disabled");
		}
	}
		@Test
		
		public void test1()
		{
			WebElement button=driver.findElement(By.xpath("//*[@id='Register']"));
		boolean reg=button.isEnabled();
		if(reg)
		{
			System.out.println(" enabled");	
		}
		else
		{
		System.out.println(" disabled");
		}
		
	}
	
	

}
