package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_By_Link {
	WebDriver driver;
	String path;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Locate Forgot Password link
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.navigate().back();
	
	//Locate element by parialLinkText
	driver.findElement(By.partialLinkText("Forgot")).click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locate_By_Link oo=new Locate_By_Link();
		oo.Launch();
	}

}
