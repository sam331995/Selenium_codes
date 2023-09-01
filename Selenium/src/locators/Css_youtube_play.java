package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_youtube_play {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.youtube.com/");
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kgf trailer");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		 Thread.sleep(2000);
			driver.close();


	}

}
