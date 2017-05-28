import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
 
 public static void main(String arg[]) throws IOException
 {

 /*FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
 XSSFWorkbook workbook = new XSSFWorkbook(fis);
 XSSFSheet worksheet = workbook.getSheet("Sheet1");
 System.out.println(worksheet.getLastRowNum()+1);*/

 
 Xlfile_Reader excel = new Xlfile_Reader("C:\\Book1.xlsx");
 System.out.println(excel.getRowCount("Sheet1"));
 
 System.out.println(excel.getCellData("Sheet1", "Password", -20));
}
}