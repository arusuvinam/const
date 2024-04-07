package org.mn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		//find how many tables
		
		
	 List<WebElement> tableNum = driver.findElements(By.tagName("table"));
	  
	  int num = tableNum.size();
	  
	  System.out.println("no of tables:"+num);
	  
	  //to get single data in a page
	    
	  List<WebElement> table= driver.findElements(By.id("customers"));
	  WebElement table1= table.get(0);
	  
	  List<WebElement> rows = table1.findElements(By.tagName("tr"));
	   WebElement row5= rows.get(4);
	  List<WebElement> data = row5.findElements(By.tagName("td"));
	  WebElement data2= data.get(1);
	  String a = data2.getText();
	  
	  System.out.println(a);
	  
	  
	  
		
		
		
		
		
	
		
		
		
		
	}

}
