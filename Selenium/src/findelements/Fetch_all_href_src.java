package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;



public class Fetch_all_href_src 
{

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("https://www.amazon.in/");
         
         List<WebElement> links = driver.findElements(By.xpath("//a"));
             int count = links.size();
             System.out.println(count);
         for(WebElement we:links)
         {
        	 Reporter.log(we.getAttribute("href"),true);
        	 
         }
         
         List<WebElement> src = driver.findElements(By.xpath("//img"));
         int count1=src.size();
       System.out.println(count1);
         for(WebElement image:src)
         {
        	 Reporter.log(image.getAttribute("src"),true);
        	 
        	 
         }
         
         driver.close();
         
	}

}
