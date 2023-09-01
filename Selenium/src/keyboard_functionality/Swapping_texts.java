package keyboard_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swapping_texts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sangolagi/Desktop/selenium/For_swapping_text.html");
		Thread.sleep(1000);
		 WebElement ele = driver.findElement(By.id("a1"));
		 ele.sendKeys(Keys.CONTROL+"ax");
		 WebElement ele2 = driver.findElement(By.id("a3"));
		 ele2.sendKeys(Keys.CONTROL+"v");
		WebElement ele1 = driver.findElement(By.id("a2"));
		  ele1.sendKeys(Keys.CONTROL+"ax");
		  ele.sendKeys(Keys.CONTROL+"v");
		  ele2.sendKeys(Keys.CONTROL+"ax");
		  ele1.sendKeys(Keys.CONTROL+"v");
		  Thread.sleep(2000);
		  driver.close();
		  
		
	}}