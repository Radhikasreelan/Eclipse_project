package herbapage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Herbalhealth {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement health;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement sendq;
	@FindBy(xpath="//*[@id=\"Enquiry\"]")
	WebElement enquiry;
	@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement sendbtn;
	public Herbalhealth(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void sorting()
	{
		health.click();
		Select drpdwon=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		drpdwon.selectByVisibleText("A-Z alphabetical order");
	}
	public void prodect(String eq)
	{
		sendq.click();
		enquiry.sendKeys(eq);
		sendbtn.click();
	}
	

}
