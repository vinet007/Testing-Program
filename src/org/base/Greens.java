package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);

		//contains text
		WebElement findText = driver.findElement(By.xpath("//p[contains(text(),'Learn')]"));
		String text = findText.getText();
		System.out.println(text);
		
		WebElement findUser = driver.findElement(By.xpath("//p[contains(text(),'currently')][1]"));
		String User = findUser.getText();
		System.out.println(User);
		

		WebElement findText1 = driver.findElement(By.xpath("//p[contains(text(),'flexible')]"));
		String text1 = findText1.getText();
		System.out.println(text1);

		//mouse	over	
		Actions act = new Actions(driver);
	    WebElement mouseOver = driver.findElement(By.xpath("//div[text()='Courses ']"));
	    act.moveToElement(mouseOver).perform();
	   
	    //mouseover again
	    Actions act1 = new Actions(driver);
	    WebElement mouseOver1 = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
	    act1.moveToElement(mouseOver1).perform();
	     
	    //click oracle sql
	    driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']")).click();
	   
	     
	    
	    
	    
	    
		

}
}