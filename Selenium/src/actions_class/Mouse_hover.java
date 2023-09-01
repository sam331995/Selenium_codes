package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement ele = driver.findElement(By.xpath("//img[@alt='Fashion']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        driver.close();

	}

}
