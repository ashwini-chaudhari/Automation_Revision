package interview_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		//Alert demo===https://www.hyrtutorials.com/p/alertsdemo.html
		driver.findElement(By.id("name")).sendKeys("Hellooo");  //main web page
		
		//IntQue: total number of frames
		//List<WebElement> 
	}

}
