package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Options_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/reg/");
		WebElement ele = driver.findElement(By.name("birthday_month"));
		 Select s = new Select(ele);
		List<WebElement> texts = s.getOptions();
		
		for(WebElement t:texts)
		{
			     String names = t.getText();
			     System.out.println(names);
			
		}
		
		driver.close();
	}

}
