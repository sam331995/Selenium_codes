package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Size {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.irctc.co.in/nget/train-search");
	        WebElement ele = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']"));
	        int a = ele.getSize().getHeight();
	         System.out.println(a);
	         int b = ele.getSize().getWidth();  
	         System.out.println(b);
	         Thread.sleep(2000);
	        driver.close();
		}

	}


