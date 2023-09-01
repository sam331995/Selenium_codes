package test_ng1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Generic_actions;

public class Title_compare extends Generic_actions{

@Test
	
	public void main()
	{
		driver.get("https://www.home.cern/");
		String  title=driver.getTitle();
		SoftAssert as= new SoftAssert();
		as.assertEquals(title, "cern");
		Reporter.log("pass");
		as.assertAll();
		
		
		
	}
	@Test
	
	public void main1()
	{
		driver.get("https://www.bbc.com/");
		String  title1=driver.getTitle();
		Assert.assertEquals(title1, "BBC");
 
		Reporter.log("pass");
		
		
		
	}
}
