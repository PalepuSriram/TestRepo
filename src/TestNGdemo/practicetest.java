package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practicetest {
	WebDriver driver;
	public practicetest(WebDriver driver) {
		this.driver = driver;
	}
		public void addUserName(String un)
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		}
		public void password(String ps)
		{
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		}
		public void submit()
		{
			driver.findElement(By.xpath("//button[@id='submit']")).click();
		}
		public void showmessage()
		{
			System.out.println(driver.findElement(By.xpath("//h1[@class='post-title']")).getText());
		}
		public void log()
		{
			driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']"));
		}
	}

