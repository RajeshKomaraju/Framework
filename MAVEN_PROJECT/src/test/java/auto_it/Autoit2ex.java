package auto_it;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit2ex {

	public static void main(String[] args) throws IOException, Exception {

WebDriver	driver=new ChromeDriver();
driver.get("https://transfer.pcloud.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\'upload-form\']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
//Runtime.getRuntime().exec("C:\\Users\\rajy\\Desktop\\Auto it\\anvar1.exe");
     StringSelection   path=new StringSelection("C:\\Users\\rajy\\Downloads\\Rajesh.resume.docx");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
    Robot a=new Robot();
    a.keyPress(KeyEvent.VK_CONTROL);
    
    a.keyPress(KeyEvent.VK_V);
    a.keyRelease(KeyEvent.VK_V);
    a.keyRelease(KeyEvent.VK_CONTROL);
    a.keyPress(KeyEvent.VK_ENTER);
    a.keyRelease(KeyEvent.VK_ENTER);
    
	}

}
