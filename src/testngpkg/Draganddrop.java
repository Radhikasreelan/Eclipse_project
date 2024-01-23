package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void test() throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement scr1=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
		
		Thread.sleep(3000);
		act.dragAndDrop(bank, scr1).perform();
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement scr2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(amt, scr2);
		
		
		
		
	}

}
