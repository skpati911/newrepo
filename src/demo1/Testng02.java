package demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng02 {


	@Test
	public void test05()
	{
		System.out.println("Browser opened");
	}
	@Test
	public void test06()
	{
		Reporter.log("open app");
	}
	@Test
	public void test07()
	{
		Reporter.log("Test executed",true);
	}
    @Test
	public void test08()
	{
		System.out.println("close browser");
	}

}
