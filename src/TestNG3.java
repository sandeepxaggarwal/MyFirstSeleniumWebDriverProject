

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
	
	public static WebDriver driver=null;
	public  FileInputStream fis = null;
	public  FileInputStream fis1 = null;
	public  XSSFWorkbook workbook = null;
	public  XSSFSheet sheet = null;
	public String usr;
	public String pwd;
	
	Properties prop = new Properties();
//	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\Object.properties");
	
	
	@BeforeTest
	public void startWebDriver() throws IOException{
		/*login from excel file*/
		fis = new FileInputStream("C:\\Book1.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		usr = sheet.getRow(1).getCell(0).getStringCellValue();
		pwd = sheet.getRow(1).getCell(1).getStringCellValue();
		
		/*login from object.properties file*/
//		fis1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\Object.properties");
	//	prop.load(fis1);
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	
	@Test
	public void doLogin()throws IOException{
		
System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
/*		driver.findElement(By.name(prop.getProperty("user"))).sendKeys(usr);
		driver.findElement(By.name(prop.getProperty("pass"))).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
*/		//driver.close();
	}
	
	@AfterTest
	public void closeall() throws IOException {
		driver.close();
		fis.close();
		//fis1.close();
	}
	
	

}

