package Tricent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tricent_gold {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php#");
		driver.findElement(By.id("nav_automobile")).click();
		new Select(driver.findElement(By.id("make"))).selectByIndex(4);
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("08/10/2010");
		new Select(driver.findElement(By.id("numberofseats"))).selectByIndex(7);
		new Select(driver.findElement(By.id("fuel"))).selectByIndex(2);
		driver.findElement(By.id("listprice")).sendKeys("2000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("9999");
		driver.findElement(By.id("annualmileage")).sendKeys("300");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		driver.findElement(By.id("firstname")).sendKeys("joshna");
		driver.findElement(By.id("lastname")).sendKeys("bisai");
		driver.findElement(By.id("birthdate")).sendKeys("09/27/1999");
		driver.findElement(By.xpath("//label[@class='ideal-radiocheck-label']//span[@class='ideal-radio']")).click();
		new Select(driver.findElement(By.id("country"))).selectByValue("India");
		driver.findElement(By.id("zipcode")).sendKeys("547865");
		new Select(driver.findElement(By.id("occupation"))).selectByIndex(5);
		driver.findElement(By.xpath("//label[normalize-space()='Skydiving']//span[@class='ideal-check']")).click();
		driver.findElement(By.id("nextenterproductdata")).click();

	}

}
