package interview_Practice;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToFetchtableData2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/demoTable.html");
		driver.manage().window().maximize();
		
//		String data11= driver.findElement(By.xpath("//table/tbody/tr[1]/th[1]")).getText();
//		System.out.print(data11);
//		String data12= driver.findElement(By.xpath("//table/tbody/tr[1]/th[2]")).getText();
//		System.out.println("\t"+data12);
//		
//		String data21= driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
//		System.out.print(data21);
//		String data22= driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
//		System.out.println("\t"+data22);
//		
//		String data31= driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
//		System.out.print(data31);
//		String data32= driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
//		System.out.println("\t"+data32);
		
		//row count
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Rows="+rows.size());
		
		//column count
		List<WebElement> columns=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Columns="+columns.size());
		
		//first for loop for row
		for(int r=2;r<=rows.size();r++) 
		{
			for(int c=1;c<=columns.size();c++) 
			{
				String data=driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println("");
			
		}
		
		
		
		//driver.close();
	}

}
