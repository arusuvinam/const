package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 { 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manu");
		driver.findElement(By.name("password")).sendKeys("123");
		
	}

}
