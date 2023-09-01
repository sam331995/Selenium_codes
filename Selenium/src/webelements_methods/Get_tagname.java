package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://european-union.europa.eu/index_en");
		WebElement ele = driver.findElement(By.className("ecl-button__label"));
		String a = ele.getTagName();
		System.out.println(a);
		Thread.sleep(2000);
		driver.close();
		

	}

}
