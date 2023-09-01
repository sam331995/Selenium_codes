package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 //driver.get("https://www.facebook.com");
	    // driver.findElement(By.linkText("Forgotten password?")).click();
	     driver.get("https://twitter.com/i/flow/login?redirect_after_login=%2F");
	     driver.findElement(By.linkText("Sign up")).click();
	}

}
