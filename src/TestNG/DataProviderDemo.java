package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider(name="Login")
	public Object[][] logindemo()
	{
		Object[][] arr=new Object[3][2];
		arr[0][0]="admin";
		arr[0][1]="admin";
		
		arr[1][0]="pass";
		arr[1][1]="pa";
		
		arr[2][0]="123";
		arr[2][1]="sa";
		return arr;
	}
	@Test(dataProvider="Login")
	public void checkLogin(String Usernam,String Password)
	{
		System.out.println(Usernam);
		System.out.println(Password);
	}
}
