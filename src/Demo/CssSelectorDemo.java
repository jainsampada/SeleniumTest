package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
	String path;
	WebDriver driver;
public void Launch() throws InterruptedException {
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
	driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admm");
	driver.findElement(By.cssSelector("input.button")).click();
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CssSelectorDemo oo=new CssSelectorDemo();
		oo.Launch();
	}

}
