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

public class Switch_control {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("https://www.google.com/");
        WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
              Actions act = new  Actions(driver);
            act.contextClick(ele).perform();
            Robot r = new  Robot();
              r.keyPress(KeyEvent.VK_T);
              Thread.sleep(2000);
              r.keyRelease(KeyEvent.VK_T);
              
             Set<String> whls = driver.getWindowHandles();
              // ArrayList<String> l = new  ArrayList<String>(whls);
               
              // String wh = l.get(1);
            for (String we : whls)
            {
            	driver.switchTo().window(we);  	
			}  
               
            
           Thread.sleep(2000);
           driver.close();
            	   
               
               
             
             
            
	}

}
