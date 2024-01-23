package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
	}
	@Test
	public void datadriven() throws IOException, InterruptedException
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		FileInputStream f=new FileInputStream("C:\\Users\\radhi\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet s=wb.getSheet("Sheet1");
		int rowcount=s.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String username=s.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username: "+username);
			String password=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password: "+password);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			//driver.navigate().refresh();
			//driver.navigate().back();
			//Thread.sleep(3000);
		}
	}
	

}
