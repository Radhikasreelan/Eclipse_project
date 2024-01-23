package herbatest;

import org.testng.annotations.Test;

import herbapage.Herbalhealth;



public class Herbalhealthtest extends Baseclassherb {
	@Test
	public void testclass() throws InterruptedException
	{
		Herbalhealth hh=new Herbalhealth(driver);
		Thread.sleep(3000);
		hh.sorting();
		hh.prodect("tell me more about prodect");
		driver.navigate().refresh();
	}

}
