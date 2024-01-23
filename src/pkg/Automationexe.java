package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexe {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
	driver.quit();	
	}
	@Test
	public void atitle()
	{
		String actualtitle=driver.getTitle();
	System.out.println("Title = "+actualtitle);
		
	
	}
	@Test
	
	public void linkcount()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkdetails.size());
		
	}
	@Test
	 public void signup()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Radhika V M");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]")).sendKeys("vmradhika@gmail.com");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Radhik@1");
		
		
		WebElement day=driver.findElement(By.xpath("//*[@id='days']"));
		Select daydetails=new Select(day);
		//daydetails.selectByVisibleText("1");
		daydetails.selectByValue("15");
		
		WebElement month=driver.findElement(By.xpath("//*[@id='months']"));
		Select monthdetails=new Select(month);
		//daydetails.selectByVisibleText("1");
		monthdetails.selectByValue("11");		
		
		WebElement year=driver.findElement(By.xpath("//*[@id='years']"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("1990");
		
		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Radhika");
		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("V M");
		driver.findElement(By.xpath("//*[@id='company']")).sendKeys("xxxxxx");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("sam1,hillversum,netherland");
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("sam2, Hilversum, netherland");
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Hliversum");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Hilversum");
		driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("1211");
		driver.findElement(By.xpath("//*[@id='mobile_number']")).sendKeys("9400319385");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div/div[1]/form/button")).click();
		
		
	}

}
