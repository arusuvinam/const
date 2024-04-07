package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ation1 {
	public static void main(String[] args) {
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//WebElement lis = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		//Actions a=new Actions(driver);
		//a.moveToElement(lis).perform();
		//WebElement dee = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		//a.click(dee).perform();
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.meesho.com/");
		WebElement mmm = driver1.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a1= new Actions(driver1);
		a1.moveToElement(mmm).perform();
	
		//WebElement mn = driver1.findElement(By.xpath("//p[text()='Grooming']"));
		//a1.click(mn).perform();
		//
		//WebDriver driver2=new ChromeDriver();
		//driver2.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//WebElement we = driver2.findElement(By.id("box106"));
		//WebElement wew = driver2.findElement(By.id("box6"));
		//Actions a2=new Actions(driver2);
		//a2.dragAndDrop(we, wew).perform();
		
		
		
		
		

	
		
		
				
	}

}