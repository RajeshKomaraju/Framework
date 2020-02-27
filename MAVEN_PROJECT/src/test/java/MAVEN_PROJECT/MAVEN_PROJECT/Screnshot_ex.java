package MAVEN_PROJECT.MAVEN_PROJECT;


import java.io.File;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Screnshot_ex {
  @Test
  public void screnshot() throws Exception  
  {
	
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	File fsource=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	

FileUtils.copyFile(fsource, new File("Screenshot//iamage.png"));
  }
}
