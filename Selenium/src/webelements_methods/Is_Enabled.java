package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_Enabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.youtube.com/");
		  WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		 boolean b =ele.isEnabled();
		 if (b)
		 {System.out.println("element is enabled");}
		 else
		  {System.out.println("element is not enabled");}
		 
		 Thread.sleep(2000);
		 driver.close();
			  
		 
	}}
