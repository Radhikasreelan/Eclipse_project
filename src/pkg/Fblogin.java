package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
		
	}
	@Test
	public void test() 
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vmradhika@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vmradhika");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
