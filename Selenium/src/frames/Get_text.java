package frames;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import generic.Generic_Photo;

public class Get_text    extends Generic_Photo
 {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		
		 WebElement ele = driver.findElement(By.id("sampleHeading"));
		      String text1 = ele.getText();
		      
		      
		      System.out.println(text1);
		      
		      driver.switchTo().defaultContent();
		      
		      driver.switchTo().frame("frame2");
		      Thread.sleep(2000);
		      
		     WebElement ele2 = driver.findElement(By.id("sampleHeading"));
		            String text2 = ele2.getText();
		            
		            
		            System.out.println(text2);
		            driver.close();
		 
	}

}
