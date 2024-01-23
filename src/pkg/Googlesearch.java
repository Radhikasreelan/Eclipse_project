package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void test() throws InterruptedException 
	{
		driver.get("https://www.google.com/");
	    Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
		//driver.findElement(By.name("btnk")).click();
	
		
	}
  

}
