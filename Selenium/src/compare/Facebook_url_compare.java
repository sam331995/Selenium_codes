package compare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_url_compare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 String title = driver.getCurrentUrl();
		 
		 if(title.equals("www"))
		 {System.out.println("True");}
		 else
		 {
			 System.out.println("false"); 
		 }
		 Thread.sleep(2000);
		 driver.close();
			
	}}