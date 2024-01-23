package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println("Title = "+actualtitle);
		String ex="Facebook - log in or sign up";
		//boolean f=true;
		//f=actualtitle.equals(ex);
		//if(f)
		if(actualtitle.equals(ex))
		{
			System.out.println("The site is correct");
		}
		else
		{
			System.out.println("The site is not correct");
		}
		driver.quit();

	}

}
