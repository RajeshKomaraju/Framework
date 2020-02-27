package pomtest;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.pages.Browserfactory;
import pom.pages.Clsamazon;

public class PomAmazonlogin {
  @Test
  public void login() throws Exception 
  {
	  WebDriver driver=Browserfactory.startBrowser("chrome", "http://amazon.in");
	  Thread.sleep(2000);
	  Clsamazon obj=new Clsamazon(driver);
	  obj.flogin("venkatbj@yahoo.com", "admin123");
	  Reporter.log("amazon login succesfull",true);
  }
}
