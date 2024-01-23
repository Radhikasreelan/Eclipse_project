package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksresponce 
{
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
			verify(link);
		}
	}
	public void verify(String link)
	{
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("Response code is 200----"+link);
				
			}
			else if (con.getResponseCode()==404)
			{
				System.out.println("Responsecode is 404----");
			}
			else
			{
				System.out.println("Other response code");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
