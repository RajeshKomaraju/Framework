package MAVEN_PROJECT.MAVEN_PROJECT;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.util.DateFormatConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screen_shot_demo_time {
	
  @Test
 
  public void screenshot() throws Exception 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  
     
	
		
	
	  DateFormat	DF=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
                  Date date = new Date();
                 String time = DF.format(date);          
                 

             	File source= ( ( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             	
             	
             	FileUtils.copyFile(source,new File("screenshot/"+time+"iamage.png"));
	}           
  }
 

