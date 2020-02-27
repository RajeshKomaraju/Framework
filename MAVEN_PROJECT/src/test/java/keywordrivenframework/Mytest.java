package keywordrivenframework;





import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Mytest {

	public WebDriver driver;

	@Test
	public By LocatorInfo(String locType,String locvalue)
	{
		By b=null;

		switch(locType)
		{
		case"id":
			b=By.id(locvalue);
			break;
		case"name":
			b=By.name(locvalue);
			break;
		case"classname":
			b=By.className(locvalue);
			break;
		case"tagname":
			b=By.tagName(locvalue);
			break;
		case"xpath":
			b=By.xpath(locvalue);
			break;
		case"cssselector":
			b=By.cssSelector(locvalue);
			break;
		case"linktext":
			b=By.linkText(locvalue);
			break;
		case"partiallinkText":
			b=By.partialLinkText(locvalue);
			break;

		}
		return b;
	}

	@Test

	public void search() throws Exception
	{
		XSSFWorkbook wb= new XSSFWorkbook("C:\\abc\\keywordsdatadriven.xlsx");
		XSSFSheet	ws=wb.getSheet("rajesh");
		int rows=ws.getPhysicalNumberOfRows();
		for (int i = 1; i <rows; i++) {
			String cTestcase=ws.getRow(i).getCell(0).getStringCellValue();
			String cLoctype=ws.getRow(i).getCell(1).getStringCellValue();
			String clocvalue=ws.getRow(i).getCell(2).getStringCellValue();
			String cTestData=ws.getRow(i).getCell(3).getStringCellValue();
			switch(cTestcase) {

			case"open_Browser":
				if(cTestData.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().version("79").setup(); 
					driver=new ChromeDriver();
				}
				driver.manage().window().maximize();
				break;

			case"enter_url":
				driver.get(cTestData);
				break;
			case "select_Dropdown":
				WebElement	dd=driver.findElement(LocatorInfo(cLoctype,clocvalue));
				Select	s=new Select(dd);
				s.selectByVisibleText(cTestData);
				break;
			case"enter_text":
				WebElement	txt=driver.findElement(LocatorInfo(cLoctype, clocvalue));
				txt.sendKeys(cTestData);
				break;
			case"click_Button":
				WebElement	btn=driver.findElement(LocatorInfo(cLoctype, cTestData));
				btn.click();
				break;

			}

		}  
	}
}
