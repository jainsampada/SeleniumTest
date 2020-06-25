package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnameDemo {
	String path,check;
	WebDriver driver;
	static int count=0;
	static String[] links=null;
	//String[] str=new String[5];
	//String href;
	//int count;
public void Launch() throws InterruptedException
{
	
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	List<WebElement> al= driver.findElements(By.tagName("a"));

	 count=al.size();
	System.out.println(count);
	links=new String[count];
	for(int i=0;i<count;i++)
	{
		System.out.println(al.get(i).getText());
		links[i]=al.get(i).getAttribute("href");
		System.out.println(links[i]);
		
		//driver.navigate().back();
		
	}
	// navigate to each Link on the webpage
	for(int i=0;i<count;i++)
	{
	driver.navigate().to(links[i]);
	Thread.sleep(3000);//static wait
	}
		
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		tagnameDemo oo=new tagnameDemo();
		oo.Launch();
	}

}
