package org.mmm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel1 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
	
		
		WebElement a1=driver.findElement(By.xpath("//textarea[@title='Search']"));
		a1.sendKeys("selenium");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Actions a=new Actions(driver);

		WebElement a2=driver.findElement(By.xpath("//h3[text()='Selenium with Python — Selenium Python Bindings 2 ...']"));
		a.moveToElement(a2).click().perform();
		WebElement a3=driver.findElement(By.xpath("//a[text()='7.28. Safari WebDriver Service']"));
				  a.moveToElement(a3).click().perform();


	
}
	

}
