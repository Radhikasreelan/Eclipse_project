package herbapage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Herbalogin {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/a/span")
	WebElement myacct ;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement login ;
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement hemail ;
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement hpwd ;
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginbtn ;
	
	public Herbalogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void hlogin(String email,String pwd)
	{
		myacct.click();
		login.click();
		hemail.sendKeys(email);
		hpwd.sendKeys(pwd);
		loginbtn.click();
		
	}
	
	
}
