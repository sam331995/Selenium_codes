package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/sangolagi/Desktop/selenium/Dummy_qspiders.html");
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a3")).click();
		//driver.findElement(By.name("n2")).click();
		//driver.findElement(By.className("c2")).click();
		driver.findElement(By.linkText("google")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
