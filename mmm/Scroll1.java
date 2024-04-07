package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/careers.html");
		
		JavascriptExecutor ji=(JavascriptExecutor)driver;
		
		WebElement feat = driver.findElement(By.xpath("//div[@title='Course Features']"));
		
		ji.executeScript("arguments[0].scrollIntoView()", feat);
		
		 // WebElement usL = driver.findElement(By.xpath("(//a[@title='Contact Us']) [1]"));
	
		 // ji.executeScript("arguments[0].scrollIntoView()",usL);
		
 		
		

	
		

		
		
		
	
	}
	

}
