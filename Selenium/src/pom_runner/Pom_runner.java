package pom_runner;

import org.testng.annotations.Test;

import generic.Generic_actions;
import pom_script.Pom;

public class Pom_runner extends Generic_actions 
{

	@Test
	public void perform() throws InterruptedException
	{
		Pom p= new Pom(driver);
		
		p.username("sameersangolagi33@gmail.com");
		
		Thread.sleep(2000);
		
		p.next();
		
		Thread.sleep(1000);
		p.password("abvgsh");
		Thread.sleep(1000);
		p.next1();
		Thread.sleep(1000);
		p.compose();
		Thread.sleep(1000);
		p.more();
		Thread.sleep(1000);
		p.trash();
		Thread.sleep(1000);
		p.empty_trash();
		Thread.sleep(2000);
		
		
	}
}
