package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.demoblaze.com/");
		
		WebElement use = driver.findElement(By.id("login2"));
		use.click();
		
		
	
		
	

}
}
