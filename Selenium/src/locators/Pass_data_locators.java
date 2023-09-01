package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pass_data_locators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sangolagi/Desktop/selenium/Dummy_qspiders.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("sameer sangolagi");
		//driver.findElement(By.id("a1")).sendKeys("sameer sangolagi");
		//driver.findElement(By.name("n")).sendKeys("sameer sangolagi");
		//driver.findElement(By.className("c")).sendKeys("sameer sangolagi");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
