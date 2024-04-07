package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opensesame.com/");
		driver.manage().window().maximize();
		
		WebElement cli = driver.findElement(By.xpath("//a[text()='Browse Courses'][1]"));
		cli.click();
		
		WebElement cli1= driver.findElement(By.xpath("//label[text()='Search courses']"));
		
		cli1.sendKeys("technology");
		//WebElement btn = driver.findElement(By.xpath("//button[text()='Select courses']"));
		//btn.click();
		
		//WebElement btn1= driver.findElement(By.xpath("//span[text()='Add to list']"));
		//btn1.click();
		
		//WebElement cli2 = driver.findElement(By.xpath("//a[text()='My Account'])"));
		//cli2.click();
		//WebElement cli3 = driver.findElement(By.xpath("//a[text()='Quick Start']"));
		//cli3.click();
		//WebElement clic4 = driver.findElement(By.name("//input[@name='hint_q']"));
		//clic4.sendKeys("agriculture");
		//WebElement clic5 = driver.findElement(By.xpath("//span[text()='Gift Certificates')"));
		//clic5.click();
		
		//WebElement clic6 = driver.findElement(By.xpath("//input[@name='user_login')"));
		//clic6.sendKeys("arunima");
		
		
		
		
}}