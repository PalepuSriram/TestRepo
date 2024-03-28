package TestNGdemo;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Read_and_write {
  String filepath = "D:\\Excel files\\Book1.xlsx";
  File file;
  FileInputStream fis;
  FileOutputStream fos;
  XSSFWorkbook WB;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
  int i,j,index = 1;
  WebDriver driver;
  String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",acturl;
  
  //WebDriver driver;
  
  
  @Test(dataProvider = "Read_and_write")
  public void loginohrm(String un, String ps) {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  acturl = driver.getCurrentUrl();
	  Assert.assertTrue(acturl.contains("dashboard"));
	  
  }
  @AfterMethod
  public void afterMethod() {
	  row = sheet.getRow(index);
	  cell = row.getCell(2);
	  
	  if(acturl.equals(expurl))
	  {
		  
		  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		  driver.findElement(By.partialLinkText("Log")).click();
		  cell.setCellValue("pass");
	  }
	  else
	  {
		
		  driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		  cell.setCellValue("fail");  
	  }
	  index++;
  }


  @DataProvider
  public Object[][] Read_and_write() {
	  int rows = sheet.getPhysicalNumberOfRows();
     String[][] logindata = new String[rows-1][2];
     
     for(i = 0; i < rows-1; i++ )
     {
    	 row = sheet.getRow(i + 1);
    	 for(j = 0; j < 2; j++)
    	 {
    		 cell = row.getCell(j);
    	 logindata[i][j] = cell.getStringCellValue();
    	 }
     }
	return logindata;
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File(filepath);
	  fis = new FileInputStream(file);
	  WB = new XSSFWorkbook(fis);
	  sheet = WB.getSheetAt(0);
	  fos = new FileOutputStream(file);
	  
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  WB.write(fos);
	  WB.close();
	  fis.close();
	  driver.close();
  }

}
