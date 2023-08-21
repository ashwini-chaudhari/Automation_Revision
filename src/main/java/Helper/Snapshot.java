package Helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Snapshot {
	
	public void screenshot(WebDriver driver,String name) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//hp//eclipse-workspace//Morning_Batch_Revision//target//"+name+".png"));  //File location
		 
		
	}

}
