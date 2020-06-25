package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {
	String path,str;
	WebDriver driver;
public void launch()
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
	//Locating element through Xpath
//	driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
//	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
//	driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
	//driver.findElement((By.xpath("//input[@id='txtPassword']"))).sendKeys("admin");
	//driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
	//finding element by xpath text method
	
	str=driver.findElement(By.xpath("//span[contains(text(),'Username')]")).getText();
	System.out.println(str);
	driver.findElement((By.xpath("//input[@id='txtPassword']"))).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByXpath oo=new ByXpath();
		oo.launch();
	}

}
