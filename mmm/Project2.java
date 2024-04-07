package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://thulo.com/");
		driver.manage().window().maximize();
		WebElement a1= driver.findElement(By.xpath("//input[@type='text']"));
		a1.sendKeys("toys");
		WebElement a2 = driver.findElement(By.xpath("//button[@title='Search']"));
		a2.click();
		WebElement a3= driver.findElement(By.xpath("//a[text()='Spider Man Toys Amazing Action Figures PVC Doll- Nepali Pasal']"));
		a3.click();
		
		
	
		
}

}