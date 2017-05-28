import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Day_28May {

	public static void main(String[] args) throws IOException {
		
		/*FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//System.out.println(sheet.getLastRowNum()+1);
		
		
		int index = workbook.getSheetIndex("sample");
		System.out.println(index);
		
		if(index==-1){
			System.out.println("Sheet doesn't exists");
		}
		
		XSSFRow row = sheet.getRow(1);
		
		//System.out.println(row.getLastCellNum());
		
		//System.out.println(row.getCell(0).getNumericCellValue());
		
		XSSFCell cell = row.getCell(0);
		System.out.println(HSSFDateUtil.isCellDateFormatted(cell));
		System.out.println(cell.getDateCellValue());
		
		if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			if(HSSFDateUtil.isCellDateFormatted(cell)){
				System.out.println(cell.getDateCellValue());
			}
			System.out.println(cell.getNumericCellValue());
		}else if (cell.getCellType()==Cell.CELL_TYPE_STRING){
			System.out.println(cell.getStringCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN){
			System.out.println(cell.getBooleanCellValue());
		}else if(cell.getCellType()==Cell.CELL_TYPE_FORMULA){
			System.out.println(cell.getCellFormula());
			System.out.println(cell.getNumericCellValue());
		}
		*/
	/*	
		Xlfile_Reader excel = new Xlfile_Reader("C:\\Book1.xlsx");
		
		System.out.println(excel.getRowCount("sample"));
		System.out.println(excel.getCellData("Sheet1", 1, 1));*/
		
		
		FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.createRow(20);
		
		XSSFCell cell = row.createCell(0);
		
		cell.setCellValue("Selenium Automation");
		
		FileOutputStream fos = new FileOutputStream("C:\\Book1.xlsx");
		
		workbook.write(fos);
		
		//Excel Training
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
