package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {
WebDriver driver;
String path;
public void Drag()
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	//Switch on frame
	driver.switchTo().frame(0);
	Actions act=new Actions(driver);
	act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
	.build().perform();
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragDemo oo=new DragDemo();
		oo.Drag();
	}

}
