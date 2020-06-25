package Data_Driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataUsingLoop {
	String path,message;
	FileInputStream fis;
	HSSFCell cell;
	WebDriver driver;
	public void FetchData() throws IOException
	{
	path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
	System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://opensource-demo.orangehrmlive.com/index.php");
	
	path=System.getProperty("user.dir")+"\\TestData\\Logindata.xls";
	//System.out.println(path);
	//To read data from file
	fis=new FileInputStream(path);
	
	//Move to workbook
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	//Open the specified sheet of workbook
	HSSFSheet sheet=wb.getSheet("Sheet1");
	//Using Loop
	for(int i=1;i<=sheet.getLastRowNum();i++)
	{
		//Fetching Data from username column
		cell=sheet.getRow(i).getCell(1);
		cell.setCellType(CellType.STRING);
		System.out.println(cell.getStringCellValue());
		driver.findElement(By.id("txtUsername")).sendKeys(cell.getStringCellValue());
		//System.out.println("----------------------");
		//Fetching Data from Password column
			cell=sheet.getRow(i).getCell(2);
			cell.setCellType(CellType.STRING);
			System.out.println(cell.getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys(cell.getStringCellValue());
			
			driver.findElement(By.id("btnLogin")).submit();
			
			FileOutputStream os=new FileOutputStream(path);
			message="Data Imported Successfully";
			sheet.getRow(i).createCell(3).setCellValue(message);
			wb.write(os);
			os.close();
			
	}
	driver.close();
	
	
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FetchDataUsingLoop oo=new FetchDataUsingLoop();
		oo.FetchData();
	}

}
