package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_multiple {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
					WebDriver driver=new FirefoxDriver();
			         driver.get("https://www.facebook.com/reg/");
			        WebElement ele = driver.findElement(By.id("month"));
			        Select s=new Select(ele);
			          
			      boolean check = s.isMultiple();
			      if (check)
			      {System.out.println("dropdown is multiple ");
			      
			      }
			      else
			      {
			    	  
			    	  System.out.println("dropdown is not multiple");
			      }
			      
			      driver.close();
			        

	}

}
