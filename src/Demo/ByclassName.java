package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByclassName {
	String path;
	WebDriver driver;

	public void Launch() {
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("inputtext")).sendKeys("admin");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByclassName oo = new ByclassName();
		oo.Launch();
	}

}
