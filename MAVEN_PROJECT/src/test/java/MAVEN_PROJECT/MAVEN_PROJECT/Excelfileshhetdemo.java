package MAVEN_PROJECT.MAVEN_PROJECT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelfileshhetdemo {
  @Test
  public void excel() throws IOException
  {
	File filename= new File("C:\\Users\\rajy\\Desktop\\Rajesh\\MAVEN_PROJECT\\Excel data\\excel.xlsx");
FileInputStream	fis=new FileInputStream(filename);
 XSSFWorkbook wb=new XSSFWorkbook(fis);
//XSSFSheet shet1= wb.getSheet("rajesh");
  XSSFSheet shet2=wb.getSheet("rajesh2");
String mydata2= shet2.getRow(1).getCell(0).getStringCellValue();
//String  mydata=shet1.getRow(1).getCell(0).getStringCellValue();
System.out.println("my data is "+mydata2);
  }
}
 