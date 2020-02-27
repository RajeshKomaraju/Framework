package pomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prodlogintest {
  @Test
  public void search() throws Exception
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://amazon.in");
	  Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("venkatbj@yahoo.com");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		
		
	}
}