package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongCredential {
	WebDriver driver;
	String path;
	WebElement uname;
	WebElement password,login,error;
	public void launch() {
		path = System.getProperty("user.dir")+"/Driver/chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	public void locate_uname() {
		uname = driver.findElement(By.id("txtUsername"));
		if(uname.isDisplayed()) {
			uname.sendKeys("admin");
		}else
		{
			System.out.println("Username not displayed");
		}
	}
	public void locate_password() {
		password = driver.findElement(By.id("txtPassword"));
		if(password.isDisplayed()) {
			password.sendKeys("admin");
		}else
		{
			System.out.println("Password not displayed");
		}
	}
	public void locate_submit() {
		login = driver.findElement(By.id("btnLogin"));
		if(login.isDisplayed()) {
			login.submit();
		}else
		{
			System.out.println("Password not displayed");
		}
	}
	public void validate() {
		error = driver.findElement(By.id("spanMessage"));
		System.out.println(error.isDisplayed());
		if(error.isDisplayed()) {
			String errormsg = error.getText();
			System.out.println(errormsg);
			if(errormsg=="Invalid credentials") {
				System.out.println("Invalid credentials");
			}
		}
		else {
			System.out.println("You have logged in");
		}
	}
	public void tearDown() {
		driver.close();
	}
	public static void main(String[] args) {
		WrongCredential obj = new WrongCredential();
		obj.launch();
		obj.locate_uname();
		obj.locate_password();
		obj.locate_submit();
		obj.validate();
		obj.tearDown();
	}

}
