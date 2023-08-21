package com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Snapshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws IOException {
		
		Locator loc=new Locator();
		Snapshot s=new Snapshot();
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement USERNAME=driver.findElement(By.xpath(loc.USERNAME));
		USERNAME.sendKeys("standard_user");
		s.screenshot(driver, "SS1");
		
		WebElement PASSWORD=driver.findElement(By.xpath(loc.PASSWORD));
		PASSWORD.sendKeys("secret_sauce");
		s.screenshot(driver, "SS2");
		
		WebElement Login=driver.findElement(By.xpath(loc.Login));
		Login.click();
		s.screenshot(driver, "SS3");
		
		System.out.println("User login successfully");
		
		
	}

}
