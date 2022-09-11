package org.base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartRobot {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		// Type a  name in email textbox and cut using (control +c) and paste in password using (control+v)
		//email
		WebElement findUser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		findUser.sendKeys("name");
		
		//doubleclick
		Actions act= new Actions(driver);
		act.doubleClick(findUser).perform();
		
		//cut
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		//pass
		WebElement findUser1 = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		findUser1.sendKeys("");
		
		//paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}