package seleniumPackage1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\abcd.xlsx");
		XSSFWorkbook book =new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("Sheet1");
		// XSSFRow    row=sheet.getRow(0);
		
		 int totalrows=sheet.getLastRowNum();
		  int  colcount=sheet.getRow(0).getLastCellNum();
		 System.out.println(totalrows);
		 System.out.println(colcount);
		
		for( int i=0;i<=totalrows;i++) {
			
			for(int j=0;j<colcount;j++) {
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			
			
		}
		
	

	}

}
