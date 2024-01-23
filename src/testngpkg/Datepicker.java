package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.com/");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[1]")).click();
		datepickermthd("January 2024","4");
	}
	public void datepickermthd(String expmnth,String expdate)
		{
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
        System.out.println("month:"+month);
			if(month.equals(expmnth))
        {
        	break;
        }
        else 
        {
        	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
        }
			}
        List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement datelement:alldates)
			{
			String date=datelement.getText();
			if(date.equals(expdate))
			{
				datelement.click();
				break;
			}
			}
			
	}

}
