package interview_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demoReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C://Users//hp//Desktop//Student.xlsx");
		System.out.println("Read Excel file");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int j=sheet1.getLastRowNum();
		
		for(int i=0;i<=j;i++) 
		{
			String firstCol=sheet1.getRow(i).getCell(0).getStringCellValue();
			String SecondCol=sheet1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.print(firstCol+"\t");
			System.out.println(SecondCol+"\t");
			
		}
		System.out.println("");

	}

}
