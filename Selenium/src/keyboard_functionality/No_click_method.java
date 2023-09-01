package keyboard_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class No_click_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//button[text()='Log in']")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.close();
		  
				  
	}

}
