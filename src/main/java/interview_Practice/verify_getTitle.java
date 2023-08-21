package interview_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verify_getTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Titles are matching");
		}
		else {
			System.out.println("Titles are not matching");
		}

	}

}
