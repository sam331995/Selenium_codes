package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Option_removal {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/");
		 ArrayList<String> l = new ArrayList<String>();
		 WebElement ele = driver.findElement(By.name("birthday_month"));
		 Select s=new Select(ele);
		  List<WebElement> opt = s.getOptions();
		  for(WebElement we:opt)
		  {
			     String t = we.getText();
			   l.add(t);
			  
		  }
		  l.remove("Sep");
		  for( String l1 : l)
		  {
			      System.out.println(l1);
			  
		  }
 driver.close();
	}

}
