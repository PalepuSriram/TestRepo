package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkbox {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/");
		WebElement tutorial = driver.findElement(By.xpath("/html/body/div[2]/table[7]/tbody/tr/td[4]/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/big/a"));
		tutorial.click();
		WebElement picktutorial = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[1]/td/a"));
		picktutorial.click();
		WebElement Htmltutorial = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[9]/td/a"));
		Htmltutorial.click();
		WebElement HtmlForms = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[10]/td/a"));
        HtmlForms.click();
        WebElement Checkbox = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]"));
        if(Checkbox.isSelected() == false)
        	Checkbox.click();
        WebElement Checkbox2 = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
        if(Checkbox2.isSelected() == false)
        	Checkbox2.click();
        WebElement Checkbox3 = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]"));
        if(Checkbox3.isSelected() == true)
        	Checkbox3.click();
        
	}

}
