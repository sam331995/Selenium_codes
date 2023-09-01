package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nseindia.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@id='link_3']"));
		 String a = ele.getText();
		 System.out.println(a);
		 Thread.sleep(2000);
		 driver.close();

	}

}
