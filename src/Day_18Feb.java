import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day_18Feb {

	public static void main(String[] args) throws IOException {
/*		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\OR.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("pass"));

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		driver.findElement(By.name(prop.getProperty("userID"))).sendKeys("tutorial");
		
		findElement("userID");
		
		public static WebElement findElement(String key) throws IOException{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties");
			
			Properties prop = new Properties();
			prop.load(fis);
			return driver.findElement(By.name(prop.getProperty(key)));
		}*/
		/*
		
		//Read data from Excel
		
		FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		System.out.println(sheet.getLastRowNum()+1);
		
		XSSFRow row = sheet.getRow(0);
		
		System.out.println(row.getLastCellNum());
		
		
		for(int i=0;i<row.getLastCellNum();i++){
			System.out.println(row.getCell(i));
		}
		
		
		//How to write data back into excel
		
		int rowCount = sheet.getLastRowNum();
		
		
		XSSFRow newRow = sheet.createRow(rowCount+1);
		
		newRow.createCell(0).setCellValue("hello world");
		
		newRow.createCell(newRow.getLastCellNum()).setCellValue("Welcome to Selenium Class");
		
		FileOutputStream fos = new FileOutputStream("C:\\Book1.xlsx");
		
		workbook.write(fos);
		
		fos.close();*/
		
		
		
		Xlfile_Reader excel = new Xlfile_Reader("C:\\Book1.xlsx");
		
		System.out.println(excel.getRowCount("Sheet1"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
