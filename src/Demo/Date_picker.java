package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Date_picker {
	WebDriver driver;
	String path;
	  @BeforeSuite
	  public void beforeSuite() {
		  path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
			//System.out.println(path);
			
			//Setting the path of ChromeDriver 
			System.setProperty("webdriver.chrome.driver", path);
			//Initialize Chrome Driver
			driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	  }

//	  @AfterSuite
//	  public void afterSuite() {
//		  driver.close();
//	  }
	  
	  @Test
	  public void dp() throws InterruptedException {
		  driver.get("https://demos.telerik.com/kendo-ui/datepicker/index");
		 
		  //Solution - 1
		  /*driver.findElement(By.xpath("//*[@id=\"example\"]/div/span[1]/span/span")).click();
		  driver.findElement(By.xpath("//div[@id='datepicker_dateview']/div[@data-role='calendar']/div/a[@aria-label='Next']")).click();

		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"example\"]/div/span[2]/span/span[2]")).click();
		  driver.findElement(By.xpath("//div[@id='monthpicker_dateview']/div[@data-role='calendar']/div/a[@aria-label='Next']")).click();
		  */

		 // solution  - 2

//driver.findElement(By.xpath("//*[@id=\"monthpicker_dateview\"]/child::div[@data-role='calendar']/div/a[@aria-label='Next']"));

		 /*driver.findElement(By.xpath("//*[@id=\"example\"]/div/span[1]/span/span")).click();
	     driver.findElement(By.xpath("//div[@data-role='calendar']/div/a[@aria-label='Next']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id=\"example\"]/div/span[2]/span/span[2]")).click();
		 driver.findElement(By.xpath("//div[@data-role='calendar'][2]/div/a[@aria-label='Next']")).click();
		 */ 
	  }

}
