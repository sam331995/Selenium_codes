package keyboard_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class No_clear_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bankofamerica.com/");
	 WebElement ele = driver.findElement(By.xpath("//input[@placeholder='User ID']"));
	   ele.sendKeys("sameer");
	   Thread.sleep(2000);
	   ele.sendKeys(Keys.CONTROL+"a");
	   Thread.sleep(2000);
	   ele.sendKeys(Keys.DELETE);
	   Thread.sleep(2000);
	driver.close();
	
	}}
