package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Typecast_list_to_set {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/");
		 ArrayList<String> l = new ArrayList<String>();
		 WebElement ele = driver.findElement(By.name("birthday_month"));
		Select s = new Select(ele);
		     List<WebElement> opt = s.getOptions(); 
		     for(WebElement opt1:opt)
		     {      
		    	   String opt2 = opt1.getText();
		    	      l.add(opt2); 
		     }
		       TreeSet<String> t = new TreeSet<String>(l);
		       
		       for(String t1:t)
		       {
		    	   System.out.println(t1);
		    	   
		    	   
		       }

	}

}
