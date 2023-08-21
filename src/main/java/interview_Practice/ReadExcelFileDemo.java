package interview_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C://Users//hp//Desktop//Student.xlsx");
		System.out.println("Read Excel file");
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Data:"+data0);
		
		int data1 = (int) sheet1.getRow(1).getCell(1).getNumericCellValue();		
		System.out.println("Data:"+data1);
		
		

	}

}
