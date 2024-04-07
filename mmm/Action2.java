package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Action2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Actions a= new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//input[@data-testid='royal_email"));
		//a.moveToElement(ele).perform();
		//ele.click();
		//a.keyDown(Keys.SHIFT).perform();
		ele.sendKeys("arunima");
		//a.keyUp(Keys.SHIFT).perform();
		
		
		
	}

}
