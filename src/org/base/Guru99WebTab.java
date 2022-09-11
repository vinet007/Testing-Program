package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99WebTab {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		//NOTE: Print all the content in the dymaic webtable.
List<WebElement> datas = driver.findElements(By.tagName("td"));
for(int i=0; i<datas.size(); i++) {
System.out.println(datas.get(i).getText());
}
        
          //NOTE: Print all value in first row
List<WebElement> firstRow = driver.findElements(By.tagName("td"));
 for(int i=0; i<2; i++) {
System.out.println(firstRow.get(i).getText());
 }
 
         //NOTE: Find out Number of rows available in webPage
List<WebElement> rowSize = driver.findElements(By.tagName("tr"));
int size = rowSize.size();
System.out.println(size);
 
         //NOTE: Print all details available in 4th webtable

 
 
 
 
//NOTE: Print Even rows  available in 4th webtable 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
}