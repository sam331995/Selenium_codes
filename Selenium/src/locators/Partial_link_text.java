package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partial_link_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com");
	     driver.findElement(By.linkText("Forgotten password?")).click();
          
	}

}
