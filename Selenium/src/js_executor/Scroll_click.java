package js_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Instagram']"));
		
		Thread.sleep(2000);
		Point locn = ele.getLocation();
		int x = locn.getX();
		  int y = locn.getY();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		     
		   js.executeScript("window.scrollBy("+x+","+y+")");
		   
		   Thread.sleep(1000);
		   ele.click();
		   
		   Thread.sleep(2000);
		     
		  
		  
		  
		driver.close();
	}

}
