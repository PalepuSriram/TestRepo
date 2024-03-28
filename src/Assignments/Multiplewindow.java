package Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		//driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Alert alt;	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",driver.findElement(By.id("alertButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]")));
		Thread.sleep(5000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")));
		alt = driver.switchTo().alert();
		alt.dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"confirmResult\"]")).getText());
		
	}

}
