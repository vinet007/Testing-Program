package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		
		//mouseover
		Actions act = new Actions(driver);
	    WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	    act.moveToElement(mouseOver).perform();
	    
	    //click bath towel
	    driver.findElement(By.xpath("//a[text()='Bath Towels']")).click();
	    
	    //print any product
	    WebElement findText = driver.findElement(By.xpath("//a[contains(text(),'380 GSM Bath Towel Set')]"));
		String text = findText.getText();
		System.out.println(text);
	    
		

}
}