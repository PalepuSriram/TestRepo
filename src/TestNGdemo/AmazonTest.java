package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AmazonTest {
	WebDriver driver;
	
  @Test(priority = 1)
  public void bestsellers() {
	 driver.findElement(By.partialLinkText("Best")).click();
  }
  @Test(priority = 2)
  public void mobiles() {
	 driver.findElement(By.partialLinkText("Mobile")).click();
  }
  @Test(priority = 3)
  public void Todaysdeals() {
	 driver.findElement(By.partialLinkText("Today's")).click();
  }
  @Test(priority = 4)
  public void Electronics() {
	 driver.findElement(By.partialLinkText("Electro")).click();
  }
  @BeforeMethod
  public void OpenAmazon() {
	 driver.get("https://www.amazon.in/");
	 System.out.println("Title " + driver.getTitle());
  }

  @AfterMethod
  public void printtitle() {
	  System.out.println("Title " + driver.getTitle());
  }

  @BeforeTest
  public void Openbrowser() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void Closebrowser() {
	  driver.close();
  }

}
