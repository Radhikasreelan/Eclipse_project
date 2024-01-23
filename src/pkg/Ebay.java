package pkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
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
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		String act=driver.getTitle();
		System.out.println(act);
		String ex="Electronics, Cars, Fashion, Collectibles & More | eBay";
		if(act.equals(ex))
		{
			System.out.println("The site is correct");
		}
		else
		{
			System.out.println("The site is not correct");
		}
	
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
	//	driver.findElement(By.xpath("//*[@id='gh-cat']")).click();
		driver.findElement(By.xpath("//*[@id='gh-sbc']/tbody/tr/td[3]/h3/a")).click();
		driver.findElement(By.xpath("//*[@id='mainContent']/section/div[2]/span[8]/a")).click();
		driver.findElement(By.xpath("//*[@id='leftnav']/div/div/div/section/ul/li/a")).click();
		driver.findElement(By.xpath("//*[@id='s0-28_1-9-0-1[0]-0-0-4-list']/li/a")).click();
		driver.findElement(By.xpath("//*[@id='gh-minicart-hover']/div/a")).click();
		driver.findElement(By.xpath("//*[@id='mainContent']/div/div[2]/div/div/div/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Books",Keys.ENTER);
		}
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
