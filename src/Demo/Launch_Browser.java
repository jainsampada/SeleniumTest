package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.NeedsLocalLogs;

public class Launch_Browser {
	WebDriver driver;
	String path,title,exptitle="Orange",url;
	
public void Launch() {
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	//System.out.println(path);
	
	//Setting the path of ChromeDriver 
	System.setProperty("webdriver.chrome.driver", path);
	//Initialize Chrome Driver
	driver=new ChromeDriver();
	//Launch application
	//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	//Method to delete all Cookies
	driver.manage().deleteAllCookies();
	//Verify Title of the page
	//title=driver.getTitle();
	
	//Verify URL of the page
	url=driver.getCurrentUrl();
	
	//Pick Sourceof the page
	driver.getPageSource();
	System.out.println("Current URL is:"+url);
	System.out.println("Title of page is:"+title);
	if(exptitle.equals(title))
	{
		System.out.println("You are on correct page");
	}
	else
	{
		System.out.println("Not on correct page");
	}
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	//Maximize Browser Window
	driver.manage().window().maximize();
	//To close current browser window
	driver.close();
	//It will close all windows
	//driver.quit();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browser oo=new Launch_Browser();
		oo.Launch();
	}

}
