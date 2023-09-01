package webelements_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_Displayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1794379366%3A1690365559011059&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeDOFXit3VzwZVfLPRK79S6UOIJF9WrNYzNZOuz1h7OoL5Eu3D6NObeMMSv396l453KabxBTUuKT&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement ele = driver.findElement(By.xpath("//span[text()='Next']"));
        boolean a = ele.isDisplayed();
        if(a)
        {System.out.println("element is displayed");}
        else
        {System.out.println("element is not displayed");}
        Thread.sleep(2000);
        driver.close();
	}
	

}
