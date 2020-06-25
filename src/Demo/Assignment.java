package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	static WebDriver Driver,driver1;
	static String Error,checklogin;
	
	public static void main(String []args) {
		
		Driver = new ChromeDriver();
		
		
//Using Invalid Credentials:
		
		Driver.get("https://opensource-demo.orangehrmlive.com");
		Driver.findElement(By.id("txtUsername")).sendKeys("admin");
		Driver.findElement(By.id("txtPassword")).sendKeys("admin@123");
		Driver.findElement(By.id("btnLogin")).click();
		
		Error = Driver.findElement(By.id("spanMessage")).getText();
		
		if(Error.equals("Invalid credentials")) {
			System.out.println("User has entered invalid credentials");
		}
		else {
			System.out.println("Some error occured.");
		}
		
//Using Valid Credentials:
		
		Driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Driver.findElement(By.id("btnLogin")).click();
		checklogin=Driver.findElement(By.id("welcome")).getText();
		if(checklogin.equals("Welcome"))
		{
			System.out.println("User logged in successfully.");
		}
		else
		{
			System.out.println("some error occured");
		}
		
	    Driver.close();
	}
}
