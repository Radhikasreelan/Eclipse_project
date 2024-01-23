package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
ChromeDriver driver;
String baseurl="https://www.facebook.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void fblogin()
{
	driver.findElement(By.id("email")).sendKeys("vmradhika@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("456789");
	driver.findElement(By.name("login")).click();
}
@After
public void tearDown()
{
driver.quit();	
}




}
