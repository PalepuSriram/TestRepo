package com.WebDriverDemos;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Uploadingfile {

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://sampleapp.tricentis.com/101/index.php");
	driver.findElement(By.id("nav_automobile")).click();
	driver.findElement(By.id("enterinsurantdata")).click();
	driver.findElement(By.id("open")).sendKeys("D:\\\\Jquery screenshot..jpeg");
	
	

	}

}
