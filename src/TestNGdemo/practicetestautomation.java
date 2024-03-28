package TestNGdemo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class practicetestautomation {
	WebDriver driver;
	practicetest p1;
  @Test
  public void login() {
	  p1.addUserName("student");
	  p1.password("Password123");
	  p1.submit();
	  p1.showmessage();
  }
  @AfterMethod
  public void afterMethod() {
	  p1.log();
  }

  @BeforeTest
  public void beforeTest() {
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://practicetestautomation.com/practice-test-login/");
	p1 = new practicetest(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
