package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Checkboxes_check_uncheck {

	 
		
		@Test
		public  void main() throws InterruptedException
		{System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("file:///C:/Users/sangolagi/Desktop/selenium/Checkboxes.html");
         
        List<WebElement> b = driver.findElements(By.tagName("input"));
            
         int cb= b.size();
         
         Reporter.log("a",cb,true);
        /* for(int i=0; i<cb;i++)
         {
        	 WebElement we = b.get(i);	
        	 we.click();
        	 
         }*/
         
         for(WebElement we:b)
         {
        	 we.click();
        	 
        	 
         }
        		 
         for(int i=cb-1; i>=0;i--)
         {
        	 WebElement we = b.get(i);	
        	 we.click();
         }
         driver.close();
         
         
	}}
