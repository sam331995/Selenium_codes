package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_maps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.google.com/maps");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='eYqqWd vF7Cdb']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("Mysuru Karnataka");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../../../div[2]/button[1]")).click();
		Thread.sleep(2000);
		 driver.close();
			
	}}
