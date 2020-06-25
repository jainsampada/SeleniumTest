package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {
	String path;
	WebDriver driver;
	public void Launch() throws InterruptedException
	{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	// System.out.println(path);

	// Setting the path of ChromeDriver
	System.setProperty("webdriver.chrome.driver", path);
	// Initialize Chrome Driver
	driver = new ChromeDriver();
	driver.get("https://demos.telerik.com/kendo-ui/datepicker/index");
	driver.findElement(By.xpath("//*[@id=\"example\"]/div/span[1]/span/span/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"52f27fdd\"]/div[2]/table/tbody/tr[2]/td[4]/a")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CalendarDemo oo=new CalendarDemo();
		oo.Launch();
	}

}
