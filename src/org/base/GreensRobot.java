package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensRobot {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		  
		//Thread.sleep(5000);
		//Right Click Framework Test Papers  and Select Inspect
		//WebElement findUser = driver.findElement(By.id("heading304"));
		//findUser.click();
		
		//right click
		//Actions act= new Actions(driver);
		//act.contextClick(findUser).perform();
		 
		//Thread.sleep(5000);
		//select inspect
		//Robot r = new Robot(); 
		//for(int i=0; i<10; i++) {
			//r.keyPress(KeyEvent.VK_DOWN);
			//r.keyRelease(KeyEvent.VK_DOWN);
		//}
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		//Click Selenium Test Papaers Right Click Day 6 Robot and select Inspect
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		}

		

}