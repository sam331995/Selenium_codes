package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");      //1
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.get("https://www.amazon.in");                                            //2
        System.out.println(driver.getCurrentUrl());                                      //3
        System.out.println(driver.getPageSource());                                      //4
        System.out.println(driver.getTitle());                                           //5
       
        WebElement ele = driver.findElement(By.xpath("//span[text()='& Orders']"));      //6
        System.out.println(ele.getAttribute("class"));                                   //7
        
         System.out.println(ele.getLocation());                                          //8
         System.out.println(ele.getLocation().getX());                                   //9
         System.out.println(ele.getLocation().getY());                                   //10                       
        System.out.println(ele.getCssValue("font-size"));                                //11
       System.out.println(ele.getSize().getHeight());                                    //12
       System.out.println(ele.getSize().getWidth());                                     //13
       
       WebElement ele1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
      System.out.println(ele1.getTagName());                                             //14
      System.out.println(ele1.getText());                                                //15
      System.out.println(ele1.isDisplayed());                                            //16
      System.out.println(ele1.isEnabled());                                              //17
      System.out.println(ele1.isSelected());                                             //18
      
      Dimension d= new Dimension(200,300);
        
        driver.manage().window().setSize(d);                                             //19
        
         Point p=new Point(500,344);
         driver.manage().window().setPosition(p);                                        //20
      
         driver.manage().window().maximize();                                            //21
         
         driver.manage().deleteAllCookies();                                             //22
         
         driver.navigate().to("https://www.amazon.in");                                  //23
        
         driver.navigate().back();                                                       //24
        
         driver.navigate().forward();                                                    //25
         
         driver.navigate().refresh();                                                    //26
        
         
             driver.navigate().to("https://www.youtube.com/");
             WebElement ele2 = driver.findElement(By.xpath("//input[@id='search']"));
                  ele2.sendKeys("Oppenheimer");                                          //27
                  ele2.clear();                                                          //28
                  ele2.sendKeys("Inception"); 
                    Thread.sleep(2000);
           WebElement ele3 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
                       ele3.click();                                                     //29
                ele2.sendKeys(Keys.CONTROL+"ax");                 
                 ele2.sendKeys(Keys.CONTROL+"v");
                 ele2.sendKeys(Keys.CONTROL+"a");
                   ele2.sendKeys(Keys.DELETE);
                   ele2.sendKeys("Gray man");
                   ele2.sendKeys(Keys.ENTER);
                  
                    driver.close();                                                     //30 
	}

}               
                  
                 
                  
                  
                  
                  
         
          

        


