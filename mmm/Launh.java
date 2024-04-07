package org.mmm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launh {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.swiggy.com/");
		 String title = driver.getTitle();
		 
		 String titl = driver.getTitle();
		 System.out.println("swiggy title:"+titl);
		 
		 String Url = driver.getCurrentUrl();
		 System.out.println(Url);
		 driver.quit();
		
	}
}