package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_cssValue {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
	        WebElement ele = driver.findElement(By.xpath("//p-autocomplete[@aria-label='Enter From station. Input is Mandatory.']"));
	        String a = ele.getCssValue("font-weight");
	         System.out.println(a);
	            
	        Thread.sleep(2000);
	        driver.close();
		}

	}