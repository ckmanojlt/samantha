package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {

		String excelfilepath=".//datafiles//Readdata.xlsx";
		FileInputStream input=new FileInputStream(excelfilepath);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//XSSFSheet sheet=workbook.getSheetAt(0);
		// using loops
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(0).getLastCellNum();
		
		/*for(int r=0;r<=rows;r++) 
		{
			Row row=sheet.getRow(r);
			for(int c=0;c<cells;c++)
			{
				Cell cell=row.getCell(c);
				switch(cell.getCellType())
				{
				case  STRING:System.out.print(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
				}
				System.out.print(" / ");
			}
			System.out.println();
			
		}*/
		
		/////// Iterator///////
		
		Iterator iterator=sheet.iterator();
		
		
		
		
		
		
		
		
		
		
		
	}

}
