package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.partialLinkText("Drop")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(source, target).perform();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("D://Jquery screenshot.jpeg"));
		System.out.println(" screenshot taken and stored ");
		driver.close();

	}

}
