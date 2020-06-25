package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowDemo {
	String path,parentid,childId;
	WebDriver driver;
public void Launch() throws InterruptedException
{
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	//System.out.println(path);
	
	//Setting the path of ChromeDriver 
	System.setProperty("webdriver.chrome.driver", path);
	//Initialize Chrome Driver
	driver=new ChromeDriver();
	//Launch application
	//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.get("http://www.popuptest.com/goodpopups.html");
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	Thread.sleep(2000);
	Set<String> handler=driver.getWindowHandles();
	Iterator<String>it=handler.iterator();
	
	parentid=it.next();
	System.out.println("Parent Window Id is:"+parentid);
	
	childId=it.next();
	System.out.println("Child window Id is:"+childId);
	driver.switchTo().window(childId);
	Thread.sleep(3000);
	System.out.println("Title of Child window is:"+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(parentid);
	Thread.sleep(2000);
	System.out.println("Parent window Title is:"+driver.getTitle());
	driver.close();
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		HandleWindowDemo oo=new HandleWindowDemo();
		oo.Launch();
	}

}
