package test_ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Generic_actions;

public class Get_text 
 extends Generic_actions{

	 @Test
	public void text()  throws InterruptedException {
		
	//	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		 
	//	driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		
		 WebElement ele = driver.findElement(By.id("sampleHeading"));
		      String text1 = ele.getText();
		      
		      
		      Reporter.log(text1,true);
		      
		      driver.switchTo().defaultContent();
		      
		      driver.switchTo().frame("frame2");
		    //  Thread.sleep(2000);
		      
		     WebElement ele2 = driver.findElement(By.id("sampleHeading"));
		            String text2 = ele2.getText();
		            
		            
		           Reporter.log(text2,true);
		            //driver.close();
		 
	}

}
