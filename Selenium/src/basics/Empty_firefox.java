package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Empty_firefox {
public static void main(String[] args) {
	String key="webdriver.gecko.driver";
	String value="./softwares/geckodriver.exe";
	System.setProperty(key,value);
	FirefoxDriver driver=new FirefoxDriver();
	System.out.println(driver);
	driver.close();
}
}
