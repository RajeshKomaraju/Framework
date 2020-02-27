package datadriventestframeworksdemos;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datadriventestdemo {
 public WebDriver driver;
	
	@Test
		  public  void dataprovider() throws Exception
		  {
			  
		FileInputStream	fis = new FileInputStream("C:\\abc\\Datadriventest Excel.xlsx");
			XSSFWorkbook  workbook=new XSSFWorkbook(fis);
		XSSFSheet	sheet=workbook.getSheetAt(0);
	WebDriver	driver=new ChromeDriver();
		
	String	url=sheet.getRow(0).getCell(0).getStringCellValue();
	String	email=sheet.getRow(0).getCell(1).getStringCellValue();
	String	pswd=sheet.getRow(2).getCell(0).getStringCellValue();
	
	
	
driver.get(url);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(pswd);
	driver.findElement(By.id("u_0_b")).click();
	
				
	}
}
