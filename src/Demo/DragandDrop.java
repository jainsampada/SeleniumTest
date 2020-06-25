package Demo;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
String path;
WebDriver driver;
	public void Launch()
	{
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		//Action class to handle mouse and Keyboard Events
		Actions action=new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable"))).release().build()
		.perform();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop oo=new DragandDrop();
		oo.Launch();
	}

}
