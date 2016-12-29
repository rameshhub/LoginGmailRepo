package SeleniumTest.LoginGmail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LoginPerfect {
	
	WebDriver driver;
	
	
	
  @Test
  public void f() {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("Email")).sendKeys("testingbasics500");
	  driver.findElement(By.id("next")).click();
	  driver.findElement(By.id("Passwd")).sendKeys("second@123");
	  driver.findElement(By.id("signIn")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver= new FirefoxDriver();
	  
	  driver.get("https://gmail.com");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
	  
  }

}
