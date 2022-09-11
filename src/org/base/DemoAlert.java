package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
//Alert
		//WebElement findUser = driver.findElement(By.xpath("//button[text()='Click me']"));
		//findUser.click();
		//Thread.sleep(3000);
	     //Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		//WebElement findText = driver.findElement(By.id("confirmButton"));
		//findText.click();
		//Thread.sleep(3000);
		 //Alert alert2 = driver.switchTo().alert();
		//alert2.dismiss();	
		
		WebElement findBox = driver.findElement(By.id("promtButton"));
		findBox.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		
		
		
		driver.close();
}
}