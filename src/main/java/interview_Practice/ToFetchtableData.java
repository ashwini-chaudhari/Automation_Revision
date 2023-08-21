package interview_Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToFetchtableData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement name = driver.findElement(By.xpath("//span[text() = 'Google']"));
		
		String s = name.getText();
		System.out.println(s); // google
		
		
		// how many row and find  fixed parent to child x pa
		List<WebElement> row = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));
		
		System.out.println(row.size());
		
		//column find
		List<WebElement> column = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr/th"));
		
		System.out.println(column.size());
		
		
		for(int r=2; r<=row.size(); r++) 
		{
			for (int c=1; c<=column.size(); c++) 
			{
				String data1 = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td["+ c +"]")).getText();
				System.out.println(data1);
			}
		}

	}

}
