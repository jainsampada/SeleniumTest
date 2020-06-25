package TestWithExcelDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="empdata")
	public void getdata(String uname,String password)
	{
		System.out.println("Username is:"+uname);
		System.out.println("Password is:"+password);
	}
@DataProvider(name="empdata")
public Object[][] readData()
{
	//Read data from Excel Sheet
	String sheetpath = System.getProperty("user.dir")+"\\TestData\\Logindata.xls";
	Xls_Reader xlr=new Xls_Reader(sheetpath);
	
	//Count rows of excel sheet
	int rowCount=xlr.getRowCount("Sheet1");//5
	
	//Count Column
	int colCount = xlr.getColumnCount("Sheet1");
	
	Object[][] arr = new Object[rowCount-1][colCount];
	int ci=0;//move ahead with the row ci=0, i=1,cj=0,j=0 arr[0][0]=
	for(int i=1; i<rowCount;i++,ci++) {
		//i=2
		int cj=0;//move ahead with column
		for(int j=0;j<colCount;j++,cj++) {
			//j=0
			arr[ci][cj] = xlr.getCellData("Sheet1", j, i);//admin..admin
			//System.out.println(arr[ci][cj]);
		}
	}
	return arr;
	
}
	
	
}

