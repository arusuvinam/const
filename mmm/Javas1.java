package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javas1 {
 public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 WebElement mm = driver.findElement(By.name("email"));
	 
	 
	 
	 JavascriptExecutor j= (JavascriptExecutor)driver;
	 j.executeScript("arguments[0].setAttribute('value','arusuvinam')", mm);
	 
	 WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	 j.executeScript("arguments[0].setAttribute('value','1234')", pass);


	
	Object a = j.executeScript("return arguments[0].getAttribute('value')",mm);
	System.out.println(a);
	
 Object a1 = j.executeScript("return arguments[1].getAttribute('value')",mm,pass);
	System.out.println(a1);
	 
	Object a2 = j.executeScript("return arguments[1].getAttribute('name')",mm,pass);
	System.out.println(a2);	 
	
}
}
