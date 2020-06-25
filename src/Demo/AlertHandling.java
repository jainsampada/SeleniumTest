package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	String path,str;
	WebDriver driver;
public void Launch() throws InterruptedException
{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	// System.out.println(path);

	// Setting the path of ChromeDriver
	System.setProperty("webdriver.chrome.driver", path);
	// Initialize Chrome Driver
	driver = new ChromeDriver();
	// Launch application
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.id("login1")).sendKeys("admin");
	driver.findElement(By.name("proceed")).submit();
	Alert alt=driver.switchTo().alert();
	Thread.sleep(3000);
	str=alt.getText();
	System.out.println(str);
	alt.accept();
	driver.findElement(By.id("password")).sendKeys("admin");
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AlertHandling oo=new AlertHandling();
		oo.Launch();
	}

}
