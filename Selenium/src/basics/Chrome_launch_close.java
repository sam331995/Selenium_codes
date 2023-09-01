package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_launch_close {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
