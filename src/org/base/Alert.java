package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.manage().window().maximize();
		
		WebElement findUser = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		findUser.click();
		Thread.sleep(5000);
		//alert
		//simpleAlert
	      org.openqa.selenium.Alert alert = driver.switchTo().alert();
	      alert.accept();
	      
	      //confirm Alert
	      WebElement findText = driver.findElement(By.xpath("//button[text()='Confirm Alert Box']"));
			findText.click();
			Thread.sleep(3000);
			org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
		    alert1.dismiss();
			
		//promptAlert
		    WebElement findBox = driver.findElement(By.xpath("//button[text()='Confirm Alert Box']"));
			findBox.click();
			Thread.sleep(3000);
			org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		    alert2.accept();
			
		    driver.close();
			
			
			
}
}