//Selenium 4 feature :Open the new tab on the browser:
/*For Example: If the user wants to open 2 URLs in two different tabs at the same time,
   the user can do that with the Selenium 4.
 */
package interview_Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Open_new_Tab {
	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
			
			driver.get("https://www.google.com/");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to("https://www.crmpro.com/");
	}
}