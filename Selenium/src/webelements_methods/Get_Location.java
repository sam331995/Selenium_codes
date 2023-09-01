package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Location {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://ksrtc.in/oprs-web/");
	        WebElement ele = driver.findElement(By.xpath("//a[text()='PNR Enquiry']"));
	        Point l = ele.getLocation();
	        System.out.println(l);    
	        Thread.sleep(2000);
	        driver.close();
		}

	}
