package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[7]/div[8]/div[1]/div[3]/div[1]/p[1]/a[1]")).click();
		List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(WebElement h : headers)
			System.out.println(h.getText());
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("total rows : " +rows.size());
		List<WebElement>companies = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));
		for (WebElement C : companies)
			System.out.println(C.getText());
		

	}

}
