package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
		
	}
	@Test
	public void test() 
	{
		driver.get("https://www.amazon.in/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		
		driver.findElement(By.xpath("//*[@id='s-refinements']/div[2]/ul/li/span/a")).click();
		
	}


}
