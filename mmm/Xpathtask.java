package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtask {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://petstore.swagger.io/");
		WebElement mtm = driver.findElement(By.xpath("//input[@type='text']"));
		mtm.click();
		
		
	}

}
