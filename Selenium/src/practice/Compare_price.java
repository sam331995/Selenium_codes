package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Compare_price {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/s?k=mobile&crid=U7VJSA208JG4&sprefix=mobile%2Caps%2C359&ref=nb_sb_noss_1"); 
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//span[text()='26,999']"));
		               String price1 = ele.getText();
		                    
		  driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		   Thread.sleep(2000);
		  WebElement ele1 = driver.findElement(By.xpath("//div[text()='₹9,599']"));
		               
		              String price2 = ele1.getText();
		         String price3 = price2.substring(1);
		          
		     //               price1.
		       //  int prc = Integer.parseInt(price1);
		         
		      //          int prc1 = Integer.parseInt(price3);
		      //   if(prc==prc1)
		         {
		        	 System.out.println("Both the prices are equal");
		        }
		      //   if (prc>prc1) {System.out.println("Amazon price is more");
					
			//	} else
				{
                      System.out.println("flipkart price is more");
				}
		         
		        	 
		       driver.close();  

	}

}
