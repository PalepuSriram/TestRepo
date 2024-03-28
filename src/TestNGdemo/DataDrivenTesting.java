package TestNGdemo;

import org.testng.annotations.Test;

import graphql.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataDrivenTesting {
	WebDriver driver;
	String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", acturl;
  @Test(dataProvider = "logindata")
  public void OHRM(String un, String ps) {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  acturl = driver.getCurrentUrl();
	  Assert.assertTrue(acturl.contains("index"));
	  
  }
  @AfterMethod
  public void afterMethod() {
	  if(acturl.equals(expurl))
	  { 
		  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  }
	  else
	  {
		  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
	  }
  }


  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
      new Object[] { "admin", "admin123"  },
      new Object[] { "sriram", "sriram123"  },
    };
  }
  @BeforeTest
  public void Openbrowser() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterTest
  public void Closebrowser() {
	  driver.close();
  }

}
