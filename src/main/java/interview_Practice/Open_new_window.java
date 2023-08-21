

//Selenium 4 Feature: Open a new window on the browser:
/* For Example, if the user wants to access two applications in the same browser, 
 * the user can now do this. */
 

package interview_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_new_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.crmpro.com/");

	}

}
