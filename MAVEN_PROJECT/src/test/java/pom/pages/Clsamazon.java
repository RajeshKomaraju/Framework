package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clsamazon {

public WebDriver wd;
public Clsamazon(WebDriver d)
{
	wd=d;
	
}
By linksignin=By.xpath("//*[@id='nav-link-accountList']/span[1]");
By txtEmail=By.xpath("//*[@id='ap_email']");
By btn=By.xpath("//*[@id='continue']");
By pswd=By.xpath("//*[@id='ap_password']");
By btnlgn=By.xpath("//*[@id='signInSubmit']");

By txtsrch=By.xpath("twotabsearchtextbox");
By btnserch=By.xpath("nav-input");

public void flogin(String uid,String pwd)
{
	wd.findElement(linksignin).click();
	wd.findElement(txtEmail).click();
	wd.findElement(btn).click();
	wd.findElement(pswd).click();
	wd.findElement(btnlgn).click();
}
 public void fsearch(String proname)
 {
	 wd.findElement(txtsrch).sendKeys(proname);
	 wd.findElement(btnserch).click();
 }

}
