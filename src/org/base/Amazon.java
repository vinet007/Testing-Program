package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				
		         driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();		

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//search iphone 13
				//WebElement findSearch = driver.findElement(By.id("twotabsearchtextbox"));
				//findSearch.sendKeys("iphone 13 pro max");
				
//				//mouseover sign in
//				Actions act = new Actions(driver);
//			    WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Sign in']"));
//			    act.moveToElement(mouseOver).perform();
//			    
				
				
				
			
		
	}

	
		
	}


