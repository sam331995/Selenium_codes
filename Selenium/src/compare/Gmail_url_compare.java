package compare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_url_compare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AeDOFXgXGaihRmK-8KLIUsRdZO5_2EnF2uBu_IwSsaaiQYiWDKwsaTWBJ26BiqjoYPF08sASqO90Yg&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 Thread.sleep(2000);
		 
		 String title = driver.getTitle();
		 
		 if(title.contains("www"))
		 {System.out.println("True");}
		 else
		 {
			 System.out.println("false"); 
		 }
		 Thread.sleep(2000);
		 driver.close();
			
	}}
