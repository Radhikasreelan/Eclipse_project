package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fbcreatepage {
	WebDriver driver;
	@FindBy(xpath="//*[@id='reg_pages_msg']/a")
	WebElement createpagelink;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement getstartded;
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void createpage()
	{
		System.out.println("welcome");
		createpagelink.click();
	}
	public void titleverification()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String actualtitle=driver.getPageSource();
		String exp="Create a page";
		if(actualtitle.contains(exp))
		{
			System.out.println("Text is present"+actualtitle);
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
public void getstarted()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	getstartded.click();
}
}
