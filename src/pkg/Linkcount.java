package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
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
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkdetails.size());
		for(WebElement linkele :linkdetails)
		{
			String link=linkele.getAttribute("href");
			String linktext=linkele.getText();
			
			System.out.println("Link = "+link);
			System.out.println("Text= "+linktext);
		}
	}
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
