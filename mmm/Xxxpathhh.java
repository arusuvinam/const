package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xxxpathhh {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		WebElement txtMail = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		Actions a=new Actions(driver);
		a.moveToElement(txtMail);
		txtMail.sendKeys("arusuvinam@gamil.com");
		//WebElement txtPass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	//txtPass.sendKeys("1234");
	//WebElement btn = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	//btn.click();
		
	
	}

}
