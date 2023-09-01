package test_ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=1)
	 
	public void test1()
	{
		Reporter.log("hello",true);
		
	}
	@Test
	public void test2()
	{
		Reporter.log("Bengaluru",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		Reporter.log("karnataka",true);
		
	}
	@Test(invocationCount = 3)
	public void test4()
	{
		Reporter.log("world",true);
	}
	
	@Test(enabled=false)
	public void test5()
	{
		Reporter.log("hi",true);
		Assert.fail();
	}

}
