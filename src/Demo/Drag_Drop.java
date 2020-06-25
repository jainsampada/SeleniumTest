package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Drag_Drop {
	static WebDriver Driver;
	String path;
		public void launch() throws InterruptedException
		{
			path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
			// System.out.println(path);

			// Setting the path of ChromeDriver
			System.setProperty("webdriver.chrome.driver", path);
	Driver = new ChromeDriver();
		Driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		//Creating object of Actions class to build composite actions  
        Actions act = new Actions(Driver);  
//        Thread.sleep(3000);
    //Performing the drag and drop action
        
        act.dragAndDrop(Driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]")),Driver.findElement(By.xpath("//div[@id='mydropzone']"))).build().perform();
      //  act.clickAndHold(Driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"))).moveToElement(Driver.findElement(By.xpath("//div[@id='mydropzone']"))).release().build().perform();
        //act.dragAndDrop(Driver.findElement(By.xpath("//span[contains(text(),'Draggable1')"], Driver.findElement(By.xpath("//*[@id="mydropzone"]"))).build().perform();
  //      act.dragAndDrop(Driver.findElement(By.id("sourceImage")),Driver.findElement(By.id("targetDiv"))).build().perform();
        Thread.sleep(5000);
        System.out.println("hello");
//		Actions action = new Actions(Driver);
//Driver.close();

		}
		
		public static void main(String []args) throws InterruptedException {
			
			Drag_Drop oo=new Drag_Drop();
			oo.launch();
		}
		}

