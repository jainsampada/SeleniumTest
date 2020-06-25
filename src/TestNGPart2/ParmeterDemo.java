package TestNGPart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmeterDemo {
	String path;
	WebDriver driver;
@Parameters({"browser","browser1"})
@Test
public void Launch(String browse,String browse1)
{
	if(browse.equals("Chrome"))
	{
		System.out.println("Browser is:"+browse);
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://jqueryui.com/droppable/");
	}
	if(browse1.equals("Firefox"))
	{
		System.out.println("Browser is:"+browse);
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://jqueryui.com/droppable/");
	}
	
}

}
