package datadriventestframeworksdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Datadriventest<row> {
	WebDriver driver;
  @Test
 
  public void search() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  
	
	
  }
  @BeforeSuite
	  public  void dataprovider() throws Exception
	  {
		  
	FileInputStream	fis = new FileInputStream("C:C:\\abc\\Datadriventest Excel.xlsx");
		XSSFWorkbook  workbook=new XSSFWorkbook(fis);
	XSSFSheet	sheet=workbook.getSheetAt(0);
	
String	data=sheet.getRow(1).getCell(0).getStringCellValue();

driver.findElement(By.id("gh-ac")).sendKeys(data);
  driver.findElement(By.id("gh-btn")).click();
			
		}
	  }
	  
	  
  

	


