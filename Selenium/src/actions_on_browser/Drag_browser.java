package actions_on_browser;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Point d =new Point(500,400);
		driver.manage().window().setPosition(d);
		Thread.sleep(2000);
		driver.close();
		

	}

}
