package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	@FindBy(xpath="//input[@type='email']")
	 private WebElement email;
	 
	@FindBy(xpath="//span[text()='Next']")
	 private WebElement next;
	
	@FindBy(xpath="//div[text()='Enter your password']")
	 private WebElement pwd;
	
	@FindBy(xpath="//span[text()='Next']")
	 private WebElement next1;
	
	@FindBy(xpath="//div[text()='Compose']")
	 private WebElement compose;
	
	@FindBy(xpath="//span[text()='More']")
	 private WebElement more;
	
	@FindBy(xpath="//a[text()='Trash']")
	 private WebElement trash;
	 
	 @FindBy(xpath="//span[text()='Empty Trash now']")
	 private WebElement empty_trash;
	 
	 public Pom(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 public void username(String un)
	 {
		 email.sendKeys(un);	 
	 }
	 public void next()
	 {
		 next.click(); 
	 }
	 public void password(String pwd)
	 {
		 email.sendKeys(pwd);	 
	 }
	 public void next1()
	 {
		 next1.click();	 
	 }
	 public void compose()
	 {
		 compose.click();	 
	 }
	 public void more()
	 {
		 more.click();	 
	 }
	 public void trash()
	 {
		 trash.click();	 
	 }
	 public void empty_trash()
	 {
		 empty_trash.click();	 
	 }
	 
}
