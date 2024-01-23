package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws InterruptedException
		{
		Thread.sleep(3000);
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		upload.sendKeys("C:\\Users\\radhi\\OneDrive\\Desktop");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		WebElement button=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		button.click();
		String act=button.getText();
		String exp="Submit File";
		if(exp.equalsIgnoreCase(act))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
	}
}
