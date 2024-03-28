package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocateByClass {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement username = driver.findElement(By.className("form-control"));
		username.sendKeys("sriram");
		WebElement password = driver.findElement(By.cssSelector("input[id=\"txtPassword\"]"));
		password.sendKeys("adbfafba");
		driver.findElement(By.className("btn")).click();
	    driver.close();	
	}

}