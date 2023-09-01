package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_attribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.assocham.org/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='About us']"));
		String a = ele.getAttribute("class");
		System.out.println(a);
		Thread.sleep(2000);
		driver.close();
	}

}
