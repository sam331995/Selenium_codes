package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	        Actions act = new Actions(driver);
	        act.contextClick(rclick).perform();
	        driver.close();
	        
	}

}
