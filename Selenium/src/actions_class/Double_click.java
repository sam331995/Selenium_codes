package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	         driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	        WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	        Actions act = new Actions(driver);
	        act.doubleClick(dclick).perform();
	        driver.quit();
	        
	}

}
