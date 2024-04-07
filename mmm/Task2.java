package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.swiggy.com/");
	
	
	WebElement txtLoation = driver.findElement(By.name("location"));
	txtLoation.sendKeys("kolkata");


}
}
