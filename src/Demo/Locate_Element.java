package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_Element {
	String path;
	WebDriver driver;
	WebElement uname,pass,login;
	public void Locate() {
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("http://203.134.202.19/hrm/login.php");
		// Locate element Username By Id
		//uname=driver.findElement(By.id("txtUsername"));
		uname=driver.findElement(By.name("txtUserName"));
		if(uname.isDisplayed())
		{
				uname.sendKeys("admin");
		}
		else
		{
			System.out.println("Element is not available on page");
		}
		// locate element password By Id
	//	pass=driver.findElement(By.id("txtPassword"));
		
		//Locate password by Name
		pass=driver.findElement(By.name("txtPassword"));
		pass.sendKeys("admin");
		// locate Submit button and click on it
		login=driver.findElement(By.name("Submit"));
		login.submit();
		// driver.findElement(By.id("btnLogin")).click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locate_Element oo = new Locate_Element();
		oo.Locate();
	}

}
