package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Complete_form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
         driver.get("https://demoqa.com/automation-practice-form");
        WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        ele1.sendKeys("sameer");
        Thread.sleep(1000);
        WebElement ele2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        ele2.sendKeys("sangolagi");
        Thread.sleep(1000);
        WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        ele3.sendKeys("sangolagi@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        Thread.sleep(1000);
        WebElement ele4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
         ele4.sendKeys("1234567890");
        Thread.sleep(2000);
        WebElement ele5 = driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']")); 
        ele5.click();
        Thread.sleep(2000);
      
            WebElement dr = driver.findElement(By.className("react-datepicker__year-select"));
             Select s = new Select(dr);
            s.selectByValue("1995");
            Thread.sleep(2000);
              WebElement dr1 = driver.findElement(By.className("react-datepicker__month-select"));
                         Select s1 = new Select(dr1);
                         s1.selectByValue("2");
                         Thread.sleep(2000);
                  driver.findElement(By.xpath("(//div[text()='3'])")).click();
                       
        
       /* WebElement ele6 = driver.findElement(By.id("subjectsContainer"));
        ele6.click();
           Thread.sleep(2000);
        ele6.sendKeys("History"); */
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
        Thread.sleep(1000);
        WebElement ele7 = driver.findElement(By.id("currentAddress"));
        ele7.sendKeys("Vijayanagar,Bengaluru");
        Thread.sleep(2000);
      
     /*   WebElement ele8 = driver.findElement(By.xpath("//div[text()='Select State']"));
        ele8.click();
                  ele8.sendKeys("NCR");
          Thread.sleep(1000);
         WebElement ele9 = driver.findElement(By.xpath("//div[text()='Select City']"));
         ele9.click();
            ele9.sendKeys("Delhi");
        
         Thread.sleep(1000); */
         driver.findElement(By.xpath("//button[text()='Submit']")).click();
         Thread.sleep(2000);
         driver.close();

	}

}
