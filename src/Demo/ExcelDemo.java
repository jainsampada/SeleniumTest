package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {
	String uname,path;
	HSSFCell cell;
	HSSFRow row;
	HSSFWorkbook wb;
	HSSFSheet sheet;
	WebDriver driver;
	File src=new File("C:\\Users\\admin\\Desktop\\Login.xls");
	public void getData() throws IOException {
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		// System.out.println(path);

		// Setting the path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", path);
		// Initialize Chrome Driver
		driver = new ChromeDriver();
		// Launch application
		driver.get("https://www.facebook.com");
		FileInputStream fs = new FileInputStream(src);
		wb = new HSSFWorkbook(fs);
		sheet = wb.getSheet("Sheet1");
		
		//To pick all the rows from Excel
		
//		System.out.println("Total Rows are:"+sheet.getLastRowNum());
//		HSSFRow row = sheet.getRow(2);
//		HSSFCell cell = row.getCell(1);
//		uname = cell.getStringCellValue();
//		System.out.println("User name is:" + uname);
		
		for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Email.
	         cell = sheet.getRow(i).getCell(0);
	         cell.setCellType(CellType.STRING);
	         driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
	          
	         // Import data for password.
	         cell = sheet.getRow(i).getCell(1);
	         cell.setCellType(CellType.STRING);
	         driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
	          
	         // Write data in the excel.
	       FileOutputStream foutput=new FileOutputStream(src);
	         
	        // Specify the message needs to be written.
	        String message = "Data Imported Successfully.";
	         
	        // Create cell where data needs to be written.
	        sheet.getRow(i).createCell(3).setCellValue(message);
	          
	        // Specify the file in which data needs to be written.
	        //FileOutputStream fileOutput = new FileOutputStream(src);
	         
	        // finally write content
	        wb.write(foutput);
	         
	         // close the file
	        foutput.close();
	             
	     }
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDemo oo = new ExcelDemo();
		oo.getData();
	}

}
