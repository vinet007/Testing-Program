package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		//drag&drop bank
		Actions act= new Actions(driver);
		WebElement Source = driver.findElement(By.id("credit2"));
		WebElement Destiny = driver.findElement(By.id("bank"));
		act.dragAndDrop(Source, Destiny).perform();
		
		//sales
		Actions act1= new Actions(driver);
		WebElement Source1 = driver.findElement(By.id("credit1"));
		WebElement Destiny1 = driver.findElement(By.id("loan"));
		act1.dragAndDrop(Source1, Destiny1).perform();
		
		//5000
		Actions act2= new Actions(driver);
		WebElement Source2 = driver.findElement(By.id("fourth"));
		WebElement Destiny2 = driver.findElement(By.id("amt8"));
		act2.dragAndDrop(Source2, Destiny2).perform();
		
		
		
		
		

}
}