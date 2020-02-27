package MAVEN_PROJECT.MAVEN_PROJECT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebaydemo {
  @Test
  public void search()
  
 {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  driver.findElement(By.id("gh-ac")).click();
	  
  }
}
