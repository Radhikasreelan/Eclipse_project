package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void test() throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebElement rclick=driver.findElement(By.xpath("//*[@id='authentication']/span"));
		WebElement optn=driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]/span"));
		
		WebElement dclick=driver.findElement(By.xpath("//*[@id='authentication']/button"));
		
		Thread.sleep(3000);
		act.contextClick(rclick).perform();
		//driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]"))
		optn.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		act.doubleClick(dclick).perform();
		Alert a2=driver.switchTo().alert();
		String alertMessage=a2.getText();
		
		System.out.println("Alert Messege after double click"+alertMessage);
		a2.accept();
	}
	
	

}
