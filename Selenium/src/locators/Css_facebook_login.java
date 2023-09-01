package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_facebook_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sameer");
		 driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("sameer");
		 driver.findElement(By.cssSelector("button[name='login']")).click();
		 Thread.sleep(2000);
		 
		 
		 
		 
	}

}
