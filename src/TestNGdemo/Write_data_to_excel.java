package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class Write_data_to_excel {
	String filepath = "D:\\Excel files\\logindata.xlsx";
	File file1;
	FileOutputStream FOS;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;
	
	
  @Test(dataProvider = "EXCEL_DATA")
  public void writetoexcel(String un, String ps, String rs) {
	  row = sheet.createRow(index);
	  
	  cell = row.createCell(0);
	  cell.setCellValue(un);
	  
	  cell =row.createCell(1);
	  cell.setCellValue(ps);
	  
	  cell = row.createCell(2);
	  cell.setCellValue(rs);
	  index++;
	  
  }

  @DataProvider
  public Object[][] EXCEL_DATA() {
    return new Object[][] {
      new Object[] { "sriram", "assds", "pass" },
      new Object[] { "ram", "hsdhsdh", "fail" },
    };
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	 file1 = new File(filepath);
	 FOS = new FileOutputStream(file1);
	 wb = new XSSFWorkbook();
	 sheet = wb.createSheet("logindata");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(FOS);
	  wb.close();
	  FOS.close();
	  
  }

}
