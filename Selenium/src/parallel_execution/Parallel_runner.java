package parallel_execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.Generic_Photo;

public class Parallel_runner 
{  
	public WebDriver driver;
@Test
@Parameters({"b"})
public void test(String b) throws InterruptedException, IOException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 
	
	if(b.equals("f"))
	{
		driver =new FirefoxDriver();
		driver.get("https://english.cctv.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='China Daily']"));
		 int x = ele.getLocation().getX();
		 int y=ele.getLocation().getY();
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy("+x+","+y+")");
		 Thread.sleep(2000);	
	}
	else
	{
		driver =new ChromeDriver();
		driver.get("https://www.imf.org/en/Home");
		
		Generic_Photo.getPhoto(driver);	
		
	}
}
}	




