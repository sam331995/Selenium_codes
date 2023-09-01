package actions_on_browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resize_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
             Dimension d = new Dimension(200,500);
             driver.manage().window().setSize(d);
             Thread.sleep(2000);
             driver.close();
            
	}

}
