package TestNGPart2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideDemo {
@DataProvider(name="LoginTest")
public Object[][] Login()
{
	Object[][] arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="ad";
	
	arr[1][0]="123";
	arr[1][1]="preeti";
	
	arr[2][0]="ads";
	arr[2][1]="jh";
	return arr;
}
@Test(dataProvider="LoginTest")
public void CheckLogin(Object uname,Object password)
{
	System.out.println("UserName is:"+uname);
	
	System.out.println("Password is:"+password);
}
}
