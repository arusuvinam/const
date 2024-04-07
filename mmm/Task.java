package org.mmm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task { 
	public static void main(String[] args) {
		
		WebDriver har=new ChromeDriver();
		har.get("https://www.naukri.com/");
		
		String tit = har.getTitle();
		System.out.println(tit);
		
		String Url = har.getCurrentUrl();
		System.out.println(Url);
		har.quit();
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		 String Url1 = driver.getCurrentUrl();
		 System.out.println(Url1);
		 
		 driver.quit();
		 
		 
		 WebDriver driver2= new ChromeDriver();
		 driver2.get("http://www.flipkart.com/");
		  String titl = driver2.getTitle();
		  System.out.println(titl);
		  
		  driver2.quit();
		  
		  WebDriver har2=new ChromeDriver();
		  har2.get("http://www.youtube.com/");
		  har2.quit();
		
		
		
		
		
	}
	

}
