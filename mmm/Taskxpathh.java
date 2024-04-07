package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskxpathh {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
	 WebElement txtEmail = driver.findElement(By.xpath("//input[@autocomplete='off']"));
	 txtEmail.sendKeys("arusuvinam@gmail.om");
	 
	 WebDriver driver1= new ChromeDriver();
	 driver1.get("http://www.cleartrip.com/flight");
	 WebElement mob = driver1.findElement(By.xpath("//input[@type='text']"));
	 mob.sendKeys("123456");
	WebElement from = driver1.findElement(By.xpath("//input[@placeholder='Where from?']"));
	 from.sendKeys("calicut");
	 driver1.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("mumbai");
	 
	 WebDriver driver2 =new ChromeDriver();
	 driver2.get("http://petstore.swagger.io/");
	 
	 
	 WebElement btn = driver2.findElement(By.xpath("//button[@class='btn authorize unlocked']"));
	 btn.click();
	 

		
	
		
		
		
		
	}

}
