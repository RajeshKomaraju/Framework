package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserfactory {
public static WebDriver wd;
public static WebDriver startBrowser(String bname,String url)
{
	if (bname.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().version("79").setup();
		wd=new ChromeDriver();
	}
	wd.manage().window().maximize();
	wd.get(url);
		
	


	
	return wd;
	
}
}
