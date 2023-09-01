package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_actions {

	 public  WebDriver driver;
	@BeforeMethod
	
	public void openAppl()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7U8WLJ9ZcP_B5RWyHBy6QfDfECW1m9b56qSizQ4MNR9o9AdxHzRH8qjFL46yI6IkP5nLj-M&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S2130930675%3A1692873753110055")	;	}
	
	@AfterMethod
	
	public void closeAppl()
	{
		driver.close();
		
	}
	
	
	
}
