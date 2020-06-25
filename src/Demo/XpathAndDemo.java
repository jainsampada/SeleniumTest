package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndDemo {
	String path;
	WebDriver driver;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@type='text' and @name='txtUsername']")).sendKeys("admin");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XpathAndDemo oo=new XpathAndDemo();
		oo.Launch();
	}

}
