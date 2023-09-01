package dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascending_texts_2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/reg/");
		WebElement ele = driver.findElement(By.name("birthday_month"));
		           TreeSet<String> t = new TreeSet<String>();
		          Select s = new Select(ele);
		           List<WebElement> opt = s.getOptions();
		           for(WebElement we:opt)
		           {
		        	        String months = we.getText();
		        	    t.add(months);
		           }
		           
		           for(String t1:t)
		           {
		        	   System.out.println(t1);
		        	   
		           }
		           
		          
		          
		          driver.close();
		          
		
	}
	
	
	
}
