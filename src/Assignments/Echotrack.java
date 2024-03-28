package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Echotrack {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		WebElement name = driver.findElement(By.name("txtCustomerID"));
		name.sendKeys("sriram");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("rrrtttyyy");
		WebElement loginbutton = driver.findElement(By.cssSelector("input[id=\"Butsub\"]"));
        loginbutton.click();

	}

}
