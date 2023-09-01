package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clear_data_locators {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/sangolagi/Desktop/selenium/Dummy_qspiders.html");
	 Thread.sleep(2000);
	 //driver.findElement(By.tagName("input")).clear();
	 //driver.findElement(By.id("a2")).clear();
     //driver.findElement(By.name("n1")).clear();
     //driver.findElement(By.className("c1")).clear();
     Thread.sleep(2000);
     driver.close();
     
	}

}
