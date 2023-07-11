package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginObj {
	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement user;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	@FindBy(name="submit")
	public static WebElement submit;
	
	
	
	//Page object model
	
	/*
  
  public static WebElement user(WebDriver d) {
	 return d.findElement(By.name("userName"));
  }
  
  public static WebElement pswd(WebDriver d) {
		 return d.findElement(By.name("password"));
	  }
  
  
  public static WebElement submit(WebDriver d) {
		 return d.findElement(By.name("submit"));
	  }
	  
	  */
}
