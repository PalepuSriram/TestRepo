package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions op = new EdgeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new EdgeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Tun");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		driver.findElement(By.id("dest")).sendKeys("Ban");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/span")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[5]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
	}

}
