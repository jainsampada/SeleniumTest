package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpathDemo {
	String path;
	WebDriver driver;
public void Launch()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	//System.out.println(path);
	
	//Setting the path of ChromeDriver 
	System.setProperty("webdriver.chrome.driver", path);
	//Initialize Chrome Driver
	driver=new ChromeDriver();
	//Launch application
	//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	//Locate element by Xpath
	driver.findElement(By.xpath("//span[@class='form-hint']")).sendKeys("admin");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByXpathDemo  oo=new ByXpathDemo();
		oo.Launch();
	}

}
