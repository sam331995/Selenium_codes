package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Close_browser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		        Robot r = new  Robot();
		        Thread.sleep(2000);
		        r.keyPress(KeyEvent.VK_ALT);
		        r.keyPress(KeyEvent.VK_SPACE);
		        r.keyPress(KeyEvent.VK_C);
		        
		        r.keyRelease(KeyEvent.VK_ALT);
		        r.keyRelease(KeyEvent.VK_SPACE);
		        r.keyRelease(KeyEvent.VK_C);
		        
		        
		        
		        
		        
		        
		
		
		
		
	}
	

}
