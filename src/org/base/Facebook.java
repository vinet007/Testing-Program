package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	WebElement textUser = driver.findElement(By.id("email"));
	textUser.sendKeys("email");
	
	//double click
	Actions act = new Actions(driver);
	act.doubleClick(textUser).perform();
	
	//right click
	act.contextClick(textUser).perform();
	
	//robot
	Robot r = new Robot();
	
	//first down
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	//second down cut option
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	//select cut so enter
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//time to load slowly 
	Thread.sleep(5000);
	
	//to paste
	//r.keyPress(KeyEvent.VK_CONTROL);
	//r.keyPress(KeyEvent.VK_V);
	//r.keyRelease(KeyEvent.VK_CONTROL);
	//r.keyRelease(KeyEvent.VK_V);

	//to paste email in password box
WebElement findElement = driver.findElement(By.id("pass"));
findElement.sendKeys("");
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	


}

