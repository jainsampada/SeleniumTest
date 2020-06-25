package TestNGPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AssrtionDemo {
	String path,str,uname="adm";
	WebDriver driver;
	@Test
public void launch()
{
		SoftAssert ast=new SoftAssert();
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	//System.out.println(path);
	
	//Setting the path of ChromeDriver 
	System.setProperty("webdriver.chrome.driver", path);
	//Initialize Chrome Driver
	driver=new ChromeDriver();
	//Launch application
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Hard Assertion
	//Assert.assertEquals(driver.getTitle(),"Orange HRM");
	//Soft Assertion
	ast.assertEquals(driver.getTitle(),"Orange HRM");
	
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	//Assert.assertEquals("admin", uname);
	driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
	driver.findElement(By.id("btnLogin")).click();
	ast.assertAll();
	}
}