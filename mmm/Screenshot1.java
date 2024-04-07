package org.mmm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com/");
		
	
		TakesScreenshot t= (TakesScreenshot)driver;
		File temp = t.getScreenshotAs(OutputType.FILE);
		
		File perm= new File("C:\\Users\\Arunima\\eclipse-workspace1\\Selenium\\Screenshot.png");
		
		
				
		FileUtils.copyFile(temp, perm);
		
		
		
	}

}
