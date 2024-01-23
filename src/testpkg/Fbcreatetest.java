package testpkg;

import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;


public class Fbcreatetest extends Baseclass{
	@Test
	public void testlogin() throws InterruptedException
	{
	
		Fbcreatepage fb=new Fbcreatepage(driver);
		Thread.sleep(3000);
		fb.createpage();
		Thread.sleep(3000);
		fb.titleverification();
		Thread.sleep(3000);
		fb.getstarted();
	}
	

}
