package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCFram {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		//swtich to login page
		WebElement frameTest = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frameTest);
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345@", Keys.ENTER);
		
	//to find no of frameset in a page
	List  <WebElement> findElement = driver.findElement(By.tagName("frameset"));
	
	//int size= frameSet.size();
	//System.out.println(size);
		
}
}