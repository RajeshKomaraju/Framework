package pomtest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productsearchtest {
	WebDriver driver;
  public void data(WebDriver ldriver)
  {
	  this.driver=ldriver;
  }
  
  
  public static WebDriver search(WebDriver driver,String value) 
  {
	 WebElement searchbox =driver.findElement(By.id("gh-ac"));
	 searchbox.sendKeys(value);
	  return driver;
       
		
  }
}
