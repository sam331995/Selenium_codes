package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Generic_actions;



public class Test3  extends Generic_actions
  {
	
	
	@Test
	
	public void test3() throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.irctc.co.in/nget/train-search");
        WebElement ele = driver.findElement(By.xpath("//p-autocomplete[@aria-label='Enter From station. Input is Mandatory.']"));
        String a = ele.getCssValue("font-weight");
         Reporter.log(a,true);
            
       // Thread.sleep(2000);
      //  driver.close();	
	}
	
	/*@Test
	public void test4() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.assocham.org/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='About us']"));
		String a = ele.getAttribute("class");
		Reporter.log(a,true);
		Thread.sleep(2000);
		driver.close();    */
		
		
	}


