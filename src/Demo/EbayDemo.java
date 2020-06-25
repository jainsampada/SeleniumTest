package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayDemo {
	String path;
	WebDriver driver;
	WebElement mobilele,sam;
	public void launch() throws InterruptedException
	{

	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	Actions act= new Actions(driver);
	
	mobilele=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/ul/li[4]/span"));
	mobilele.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[4]/ul/li/ul/li[2]/ul/li[2]/a")).click();
	//mobilele.click();
	//Thread.sleep(5000);
	//act.moveToElement(mobilele);
	//Thread.sleep(5000);
	//System.out.println("hello");
	//Thread.sleep(5000);
	//sam=driver.findElement(By.linkText("Samsung"));
	//sam.click();

	//act.moveToElement(sam).click().build().perform();

	// act.clickAndHold(first);
	// act.moveToElement(trg);
	// act.release();
	// act.build();
	//driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub"
	EbayDemo oo=new EbayDemo();
	oo.launch();
	}
}
