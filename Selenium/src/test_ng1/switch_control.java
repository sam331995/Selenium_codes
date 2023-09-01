package test_ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class switch_control {

		@Test
		public  void main() throws InterruptedException
		{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("file:///C:/Users/sangolagi/Desktop/selenium/main_frame.html");
		 
		 driver.findElement(By.id("a1")).sendKeys("sameer");
		 
		 driver.switchTo().frame(0);
		 
		 driver.findElement(By.id("pi")).sendKeys("sameer");
		 Thread.sleep(2000);
		 
		 driver.close();

	}

}
