package herbatest;

import org.testng.annotations.Test;

import herbapage.Herbalogin;



public class Herbalogintest extends Baseclassherb {
	@Test
	public void testclass() throws InterruptedException
	{
		Herbalogin hl=new Herbalogin(driver);
		Thread.sleep(3000);
		hl.hlogin("vmradhika@gmail.com","Radhik@1");
	}

}
