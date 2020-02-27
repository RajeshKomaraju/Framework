package auto_it;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitdemo {

	public static void main(String[] args) throws Exception 
	{
WebDriver	driver=new ChromeDriver();
driver.get("https://transfer.pcloud.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\'upload-form\']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
Thread.sleep(2000);
Runtime.getRuntime().exec("C:\\Users\\rajy\\Desktop\\Auto it\\fileupload.exe");


	}

}
