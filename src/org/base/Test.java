package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//WebElement findUser = driver.findElement(By.id("email"));
		//findUser.sendKeys("vin @gmail.com");
		
	WebElement findPass = driver.findElement(By.name("pass"));
	findPass.sendKeys("12345");
	
	//WebElement findUser1 = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	//findUser1.sendKeys("vin@gmail.com");
	
	WebElement findElement = driver.findElement(By.xpath("//input[contains(@type,'text')][1]"));
	findElement.sendKeys("vyn@gmail.com");
		
		
	}

}
