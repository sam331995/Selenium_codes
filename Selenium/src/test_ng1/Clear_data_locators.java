package test_ng1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Generic_actions;

public class Clear_data_locators extends Generic_actions
{

@Test
       public void main()
{
	 
	 driver.get("file:///C:/Users/sangolagi/Desktop/selenium/Dummy_qspiders.html");
	 
	 driver.findElement(By.tagName("input")).clear();
	 driver.findElement(By.id("a2")).clear();
     driver.findElement(By.name("n1")).clear();
     driver.findElement(By.className("c1")).clear();
     
    
     
	}

}