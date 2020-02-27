package pomtest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.pages.Browserfactory;

public class productcatgorysearchtest {
	 WebDriver driver;
  @Test
  public void searchcatg()
  {
		
	Browserfactory.startBrowser("chrome", "https://www.ebay.com/");
	
	Productsearchtest pf=PageFactory.initElements(driver, Productsearchtest.class);
	
	pf.search(driver, "mobile");
	  
		}
  }

