import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class testExcel {

	public static void main(String[] args) throws IOException {
		/*
		FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//XSSFSheet sheet = workbook.getSheet("Selenium1");
		
		
		System.out.println(workbook.getSheetIndex("Sheet1"));
		System.out.println(workbook.getSheetIndex("Selenium"));
		System.out.println(workbook.getSheetIndex("Selenium1"));
		System.out.println(workbook.getSheetIndex("test"));
		
		int index = workbook.getSheetIndex("Selenium1");
		
		if(index==-1){
			System.out.println("Doesn't exist");
		}else{
			System.out.println("exists");
		}
		
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		
		System.out.println(row.getLastCellNum());
		
		//System.out.println(row.getCell(1).getStringCellValue());
		
		//System.out.println(row.getCell(1).getNumericCellValue());
		
		//System.out.println(row.getCell(1).getBooleanCellValue());
		
		//System.out.println(row.getCell(1).getCellType());
		
		if(row.getCell(1).getCellType()==Cell.CELL_TYPE_STRING){
			row.getCell(1).getStringCellValue();
		}else if (row.getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC){
			row.getCell(1).getNumericCellValue();
		}
		
		
		
		
		System.out.println(row.getCell(3).getNumericCellValue());
		
		System.out.println(row.getCell(3).getCellFormula());
		
		System.out.println(row.getCell(6).getCellFormula());
		
		System.out.println(row.getCell(6).getStringCellValue());
		*/
		
		
		Xlfile_Reader excel = new Xlfile_Reader("C:\\Book1.xlsx");
		
		System.out.println(excel.getRowCount("Sheet1"));
		
		System.out.println(excel.getCellData("Sheet1", "Username", 2));
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(sheet.getLastRowNum()+1);

	}

}
