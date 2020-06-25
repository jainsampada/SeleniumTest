package TestNGPro;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends Driver{
//@Test(groups= {"Smoke"})
	@Test(enabled=false,priority=0)
public void login()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
//@Test(groups= {"Regression"})
//public void ForgetPass()
//{
//	driver.findElement(By.linkText("Forgotten account?")).click();
//}
@Test(dependsOnMethods="login",priority=1)
public void Logout() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(By.linkText("Welcome Admin")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Logout")).click();
}
}
