package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_chrome {

	public static void main(String[] args)
	{
	  String key="webdriver.chrome.driver";
	  String value="./softwares/chromedriver.exe";
	  System.setProperty(key, value);
	  ChromeDriver driver=new ChromeDriver();
	  System.out.println(driver);
	}

}
