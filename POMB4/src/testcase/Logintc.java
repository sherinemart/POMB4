package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObj.LoginObj;

public class Logintc {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver114\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://demo.guru99.com/test/newtours/index.php");
		
		// Pagefactory design
		PageFactory.initElements(d, LoginObj.class);
		
		LoginObj.user.sendKeys("Reena");
		LoginObj.pswd.sendKeys("demouser");
		LoginObj.submit.click();
		
		d.quit();
		/*
		
		// Page Object model
		LoginObj.user(d).sendKeys("Reena");
		
		LoginObj.pswd(d).sendKeys("demouser");
		
		LoginObj.submit(d).click();
		
		*/
		 
		
		
		/*
		
		d.findElement(By.name("userName")).sendKeys("Reena");
		
		d.findElement(By.name("password")).sendKeys("demouser");
		
		d.findElement(By.name("submit")).click();
		*/
  }
}
