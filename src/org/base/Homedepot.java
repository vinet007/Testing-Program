package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedepot {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		Actions act = new Actions(driver);
	    WebElement mouseOver = driver.findElement(By.xpath("//a[text()='All Departments']"));
	    act.moveToElement(mouseOver).perform();
	    
	    
	    Actions act1 = new Actions(driver);
	    WebElement mouseOver1 = driver.findElement(By.xpath("//a[text()='Paint']"));
	    act1.moveToElement(mouseOver1).perform();
	    
	    
	    Actions act2 = new Actions(driver);
	    WebElement mouseOver2 = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
	    act2.moveToElement(mouseOver2).perform();
	    
	    driver.findElement(By.xpath("//a[text()='Ceiling Paint']")).click();
	    
}

}