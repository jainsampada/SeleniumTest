package WaitsinSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwait {
	String path;
	WebElement uname;
	WebDriver driver;
	WebDriverWait wait;
public void launch()
{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	// System.out.println(path);

	// Setting the path of ChromeDriver
	System.setProperty("webdriver.chrome.driver", path);
	// Initialize Chrome Driver
	driver = new ChromeDriver();
	 wait=new WebDriverWait(driver, 20);
	// Launch application
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//Dynamic wait on PageLoadTimeout
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//Implicit Wait- It will apply to all the elements of the page automatically
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Explicit Wait that will for particular condition to happen
	uname=wait.until(ExpectedConditions.elementToBeClickable(By.id("login1")));
	uname.sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.name("proceed")).submit();
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Implicitwait oo=new Implicitwait();
	oo.launch();
	}

}
