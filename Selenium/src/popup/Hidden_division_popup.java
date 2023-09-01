package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("https://www.cleartrip.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[text()='12']")).click();
         Thread.sleep(2000);
         driver.close()
         ;

	}

}
