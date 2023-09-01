package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deselect_options {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
		         driver.get("https://www.facebook.com/reg/");
		        WebElement ele = driver.findElement(By.id("month"));
		        Select s=new Select(ele);
		         
		        s.selectByIndex(1);
		          Thread.sleep(2000);
		          
		         s.selectByValue("2");
		         Thread.sleep(2000);
		         
		         s.selectByVisibleText("Mar");
		         Thread.sleep(2000);
		         
		   //DESELECT     
		         
		     /*    s.deselectByIndex(3);
		         Thread.sleep(2000);
		         
		         s.deselectByValue("3");
		         Thread.sleep(2000);
		         
		         s.deselectByVisibleText("Apr");
		         Thread.sleep(2000);
		         
		         s.deselectAll();
		         driver.close();       */
		         
		         
		         
		         
		        
}}
