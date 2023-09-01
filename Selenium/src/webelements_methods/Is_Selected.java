package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://www.fifa.com/fifaplus/en");
	   Thread.sleep(2000);
	   WebElement ele = driver.findElement(By.xpath("//button[text()='Preference Center']"));
	   ele.click();
	      boolean b = ele.isSelected();
	      if(b)
	      {
	    	   System.out.println("element is selected");
	      }
	      else
	      {
	    	  System.out.println("elemet is not selected");
	      }
	    	Thread.sleep(2000);  
	      driver.close();
	      }
	   		

	}


