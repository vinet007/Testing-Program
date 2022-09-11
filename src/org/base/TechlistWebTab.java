package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlistWebTab {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		
		//2nd table details print
	List<WebElement> findElements = driver.findElements(By.xpath("(//table[@class='tsc_table_s13'])"));
 if		
List<WebElement> twoTable = driver.findElements(By.tagName("td"));

//for(int i=0; i<twoTable.size(); i++) {
	System.out.println(twoTable);
}
}
