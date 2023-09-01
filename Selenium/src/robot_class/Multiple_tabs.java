package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_tabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Robot r = new  Robot();
		WebElement ele = driver.findElement(By.xpath("//a[text()='About']"));
		         
		     Actions act = new Actions(driver);
		       
		     WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		                 
		     WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		        
		     WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		                    
		     WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
		    
		     WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		                    
		       ArrayList<WebElement> l = new  ArrayList<WebElement>();
		               l.add(ele);
		               l.add(ele1);
		               l.add(ele2);
		               l.add(ele3);
		               l.add(ele4);
		               l.add(ele5);        
		        
		       for (WebElement l1 : l) 
		       {
				       act.contextClick(l1).perform();
			                r.keyPress(KeyEvent.VK_T);
			                r.keyRelease(KeyEvent.VK_T);
		       }
		       
		        Set<String> whls = driver.getWindowHandles(); 
		           
		           ArrayList<String> arr = new ArrayList<String>(whls);
		           
		             String arr1 = arr.get(6);
		     driver.switchTo().window(arr1);
		     Thread.sleep(3000);
		   
	}

}
