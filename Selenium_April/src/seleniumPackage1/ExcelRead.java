package seleniumPackage1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		excelread("Sheet1",1,0);
		excelread("Sheet1",1,1);
		

	}
	
public static String excelread(String sheetname,int rownum,int cellNum) throws IOException {
	// TODO Auto-generated constructor stub

		
		FileInputStream fis=new FileInputStream("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\abcd.xlsx");
		XSSFWorkbook book =new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(sheetname);
		// XSSFRow    row=sheet.getRow(0);
		String Data=sheet.getRow(rownum).getCell(cellNum).getStringCellValue();
		/*System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		*/
//System.out.println(Data);		
		
		return Data;
 
	}

}
