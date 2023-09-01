package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube_like {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.youtube.com/");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kgf trailer Hindi");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@id='segmented-like-button'])[1]")).click();
		 Thread.sleep(2000);
		 driver.close();
			
	}}