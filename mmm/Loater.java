package org.mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loater {
	public static void main(String[] args) { 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
WebElement txtEMail = driver .findElement(By.name("email"));
 txtEMail.sendKeys("arusuvinam@gmail.com");
  
 WebElement txtPass = driver.findElement(By.id("pass"));
 txtPass.sendKeys("12345");
 WebElement btnLogin = driver.findElement(By.name("login"));
 btnLogin.click();
 
	
		
	
	}

}
