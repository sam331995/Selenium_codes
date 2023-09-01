package practice;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buy_item {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("https://www.amazon.in/");
         
         driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Lenovo laptop");
          driver.findElement(By.id("nav-search-submit-button")).click();
          driver.findElement(By.xpath("//span[text()='33,990']")).click();
          Set<String> whls = driver.getWindowHandles();
          ArrayList<String> l = new ArrayList<String>(whls);
          String ch_id = l.get(1);
          driver.switchTo().window(ch_id);
          Thread.sleep(3000);
          WebElement ele = driver.findElement(By.xpath("//span[@id='submit.buy-now']"));
          Point locn = ele.getLocation();
          int x = locn.getX();
           int y = locn.getY();
           JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy("+x+","+y+")");
             ele.click();
              driver.findElement(By.id("ap_email")).sendKeys("9448124900");
              driver.findElement(By.id("continue")).click(); 
            
                 
             
            
           // driver.close();
          
       
       
       
          
             
        
         
        

	}

}
