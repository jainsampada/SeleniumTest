package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssForgotPassword {
	WebDriver driver;
	String path;
	WebElement forgotlink_text,enter_forgotUname,reset_passwordbtn,cancel_btn;
	String forgot_passwordURL = "https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode",login_url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login",current_url;
	
	//Launch browser and Open the website
	public void launch()
	{
		path = System.getProperty("user.dir")+"/Driver/chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	//Locate forgot password link text in login page
	public void locate_forgotPasswordLink()
	{
		forgotlink_text = driver.findElement(By.linkText("Forgot your password?"));
		if(forgotlink_text.isDisplayed())
		{
			forgotlink_text.click();
			current_url = driver.getCurrentUrl();
			
			//If navigated to forgot password page then enter uname and click reset password button
			if(current_url.equalsIgnoreCase(forgot_passwordURL))
			{
				locate_forotPasswordUnameTxt();
				//locate_resetPasswordBtn();
			}
			else
			{
				System.out.println("You are not on forgot password page");
			}
		}
		else
		{
			System.out.println("forgot password link text not found in login page");
		}
	}
	
	//Locate and enter value in uname text box in forgot password page
	public void locate_forotPasswordUnameTxt()
	{
		enter_forgotUname = driver.findElement(By.id("securityAuthentication_userName"));
		enter_forgotUname.sendKeys("Admin");
	}
	
//	//Locate and click on reset button in forgot password page
	public void locate_resetPasswordBtn()
	{
		reset_passwordbtn = driver.findElement(By.id("btnSearchValues"));
		reset_passwordbtn.click();
		
	}
	
	//Locate cancel button in forgot password page and validate its functionality
	public void locate_cancelbtn()
	{
		cancel_btn = driver.findElement(By.id("btnCancel"));
		cancel_btn.click();
		String currentURL = driver.getCurrentUrl();
		if(currentURL.equalsIgnoreCase(login_url))
		{
			System.out.println("Cancel button works fine");
		}
		else
		{
			System.out.println("Cancel button does not work");
		}
	}
//	
	//Close browser
	public void close_browser()
	{
		driver.close();
	}
//	
	public static void main(String[] args) {
		AssForgotPassword oo = new AssForgotPassword();
		oo.launch();
		oo.locate_forgotPasswordLink();
		oo.locate_cancelbtn();
		oo.close_browser();
	}
}
