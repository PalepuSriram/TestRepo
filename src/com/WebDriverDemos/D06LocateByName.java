package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("Sriram.Palepu14@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("555557777");
	    WebElement loginbutton = driver.findElement(By.name("login"));
        loginbutton.click();
	}

}
