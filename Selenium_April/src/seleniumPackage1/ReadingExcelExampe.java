package seleniumPackage1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelExampe {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Bhargav\\Desktop\\SchreenShots\\data3.xlsx");
        
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Counting rows 
		int rowno=sheet.getLastRowNum();//returns no of rows
	    int colcount=sheet.getRow(0).getLastCellNum();//it returns no of cells present in a row
	
	    System.out.println(rowno);
	    System.out.println(colcount);
	    
	    for(int r=0;r<=rowno;r++)
	    {
	    	
	    XSSFRow row=sheet.getRow(r);
	    
	    for(int c=0;c<colcount;c++) 
	    {
	    	 String value=row.getCell(c).toString();
	    	 System.out.print(value+" ");
	    }
	    System.out.println();
	}

}
}
