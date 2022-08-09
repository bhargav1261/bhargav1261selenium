package seleniumPackage1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\testdata123.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("data");
		
		for(int i=0;i<6;i++) 
		{
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<4;j++)
				
				
			{
				row.createCell(j).setCellValue("Welcome");
			}
		}
		
		workbook.write(file);
		
		System.out.println("Wrinting data into excel completed");
		

	}

}
