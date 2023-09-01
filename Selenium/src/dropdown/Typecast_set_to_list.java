package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Typecast_set_to_list {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.facebook.com/reg/");
		         TreeSet<String> t = new   TreeSet<String>();
		 WebElement ele = driver.findElement(By.name("birthday_month"));
		  Select s = new Select(ele);
		 List<WebElement> opt = s.getOptions();
		   for(WebElement opt1:opt)
		   {
			      String opt2 = opt1.getText();
			               t.add(opt2);   
		   }

		       ArrayList<String> l = new  ArrayList<String>(t);
		       
		       Collections.sort(l);
		       
		      for(String l1:l)
		       {
		    	        System.out.println(l1);
		    	   
		       }
		        driver.close();
		   
	}

}
