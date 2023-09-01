package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Minimise_maximise {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    Robot r = new  Robot();
		    r.keyPress(KeyEvent.VK_ALT);
		    r.keyPress(KeyEvent.VK_SPACE);
		    r.keyPress(KeyEvent.VK_N);
		    
		    r.keyRelease(KeyEvent.VK_ALT);
		    r.keyRelease(KeyEvent.VK_SPACE);
		    r.keyRelease(KeyEvent.VK_N);
		    driver.manage().window().maximize();
		    driver.close();
	}

}
