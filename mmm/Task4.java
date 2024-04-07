package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.saucedemo.com/");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("12334");
		WebElement txtuser = driver.findElement(By.id("user-name"));
		txtuser.sendKeys("raju");
	


WebDriver driver1= new ChromeDriver();
driver1.get("http://snapdeal.com/login");
WebElement txtUserna = driver1.findElement(By.name("username"));
  txtUserna.sendKeys("120097");

		
	}

}
