package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Empty_chrome_firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	ChromeDriver driver = new ChromeDriver();
	FirefoxDriver driver1=new FirefoxDriver();
	System.out.println(driver);
	System.out.println(driver1);
}
}
