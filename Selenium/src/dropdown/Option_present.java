package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Option_present {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/reg/");
		WebElement ele = driver.findElement(By.name("birthday_month"));
		        ArrayList<String> l = new ArrayList<String>();
		        Select s = new Select(ele);
		      List<WebElement> opt = s.getOptions();
		      for(WebElement we:opt)
		      {
		    	      String text = we.getText();
		    	              l.add(text);
		    	  
		      }
		        
		     boolean p = l.contains("Sep");  /////
		     if(p)
		     {
		    	 System.out.println("Sep is present");
		    	 
		     }
		     else
		     {
		    	 System.out.println("Sep is not present");
		     }
		        
		     
		     driver.close();
	}

}
