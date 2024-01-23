package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
		Select dropday=new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")));
		dropday.selectByValue("15");
		Select dropmnth=new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
		dropmnth.selectByVisibleText("NOV");
		Select dropyear=new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")));
		dropyear.selectByValue("1990");
	}	
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}

	