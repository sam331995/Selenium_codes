package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sameer");
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("sameer");
		 driver.findElement(By.xpath("//button[@name='login']")).click();
		 Thread.sleep(2000);
	
	}}
