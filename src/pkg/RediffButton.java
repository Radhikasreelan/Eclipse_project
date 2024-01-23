package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffButton {
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
	String buttontext=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
	if(buttontext.equals("Check availability"))
			{
	System.out.println("Pass");
	
			}
	else
	{
		System.out.println("Not pass");
	}
	}
	

}
