package Data_Driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo {
	String username;
	String path;
public void Fetchdata() throws IOException
{
	
	path=System.getProperty("user.dir")+"\\TestData\\Logindata.xls";
	//System.out.println(path);
	//To read data from file
	FileInputStream fis=new FileInputStream(path);
	
	//Move to workbook
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	//Open the specified sheet of workbook
	HSSFSheet sheet=wb.getSheet("Sheet1");
	//Fetchning total no of rows in which data is present
	System.out.println(sheet.getLastRowNum());
	
	//Fetching ist row
	HSSFRow row=sheet.getRow(1);
	//Fetching data from cell 1 of row no 1
	HSSFCell cell=row.getCell(0);//Username
	//Fetch Data in string format and save in Username variable
	username=cell.getStringCellValue();
	System.out.println("Test case Id:"+username);
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDemo oo=new ExcelDemo();
		oo.Fetchdata();
	}

}
