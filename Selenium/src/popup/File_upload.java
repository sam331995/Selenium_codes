package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("file:///C:/Users/sangolagi/Desktop/selenium/file%20upload.html");
        WebElement ele = driver.findElement(By.name("upload file"));
        Thread.sleep(2000);
               ele.sendKeys("C:\\Users\\sangolagi\\Downloads\\AR_SUHASREDDY_RESUME.docx");
               Thread.sleep(2000);
               driver.close();
	}

}
