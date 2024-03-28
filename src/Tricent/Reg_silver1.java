package Tricent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reg_silver1 {

	public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://sampleapp.tricentis.com/101/index.php");
	driver.findElement(By.partialLinkText("Auto")).click();
	new Select(driver.findElement(By.xpath("//select[@id='make']"))).selectByIndex(1);
	driver.findElement(By.xpath("//input[@id='engineperformance']")).sendKeys("1000");
	driver.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("06/25/2019");
	new Select(driver.findElement(By.xpath("//select[@id='numberofseats']"))).selectByIndex(4);
	new Select(driver.findElement(By.xpath("//select[@id='fuel']"))).selectByIndex(1);
	driver.findElement(By.xpath("//input[@id='listprice']")).sendKeys("2000");
	driver.findElement(By.xpath("//input[@id='licenseplatenumber']")).sendKeys("4567");
	driver.findElement(By.xpath("//input[@id='annualmileage']")).sendKeys("200");
	driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sriram");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("palepu");
	driver.findElement(By.xpath("//input[@id='birthdate']")).sendKeys("06/25/1999");
	driver.findElement(By.xpath("//label[normalize-space()='Male']//span[@class='ideal-radio']")).click();
	driver.findElement(By.xpath("//input[@id='streetaddress']")).sendKeys("Bankcoly,High school road");
	new Select(driver.findElement(By.xpath("//select[@id='country']"))).selectByValue("India");
	driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("533401");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("vizag");
	new Select(driver.findElement(By.xpath("//select[@id='occupation']"))).selectByIndex(1);
	driver.findElement(By.xpath("//label[normalize-space()='Speeding']//span[@class='ideal-check']")).click();
	driver.findElement(By.xpath("//label[normalize-space()='Bungee Jumping']//span[@class='ideal-check']")).click();
	driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	driver.findElement(By.xpath("//input[@id='startdate']")).sendKeys("08/22/2024");
	new Select(driver.findElement(By.xpath("//select[@id='insurancesum']"))).selectByIndex(2);
	new Select(driver.findElement(By.xpath("//select[@id='meritrating']"))).selectByIndex(1);
	new Select(driver.findElement((By.xpath("//select[@id='damageinsurance']")))).selectByIndex(3);
	driver.findElement(By.xpath("//label[normalize-space()='Euro Protection']//span[@class='ideal-check']")).click();
	new Select(driver.findElement((By.xpath("//select[@id='courtesycar']")))).selectByIndex(2);
	driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
	System.out.println("checking automobiles silver price");
	String expprice = "234.00",actprice,onlineclaim = "No",actonlineprice,CD = "No",actCD,WWC = "No",actWWC;
	actprice = driver.findElement(By.xpath("//span[@id='selectsilver_price']")).getText();	
	if(expprice.equals(actprice))
		System.out.println("price matching");
	else
		System.out.println("price not matching");
	actonlineprice = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
	if(onlineclaim.equals(actonlineprice))
		System.out.println("claim matching");
	else
		System.out.println("claim not matching");
	actCD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")).getText();
	if(CD.equals(actCD))
		System.out.println("Discount matching");
	else
		System.out.println("Discount not matching");
	actWWC = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")).getText();
	if(WWC.equals(actWWC))
		System.out.println("World wide cover matching");
	else
		System.out.println("World wide cover not matching");
    driver.findElement(By.xpath("//section[@id='pricePlans']//label[1]//span[1]")).click();
    driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sriram.palepu14@gmail.com");
    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("08106647418");
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sriram");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sri@11");
    driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Sri@11");
    driver.findElement(By.xpath("//button[@id='sendemail']")).click();
    driver.findElement(By.xpath("//button[@class='confirm']")).click();
    driver.close();
}

}	
	
	
