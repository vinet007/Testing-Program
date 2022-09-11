package org.text;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		
		//javascript
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		
		WebElement textUser = driver.findElement(By.id("email"));
		jk.executeScript("arguments[0].setAttribute('value', 'Vin@gmail.com')", textUser);
		
		
        WebElement textPass = driver.findElement(By.id("pass"));
		jk.executeScript("arguments[1].setAttribute('value', '1234@')", textUser , textPass);
		
		//button
		WebElement login = driver.findElement(By.name("login"));
		jk.executeScript("arguments[0].click()", login);
		
		//alert
		jk.executeScript("alert('facebook')");
		
		Thread.sleep(5000);
		
		//scroll by pixel
		jk.executeScript("window.scrollBy(0,600)");
		
		
		
		//navigate to another page
		jk.executeScript("window.location = 'https://www.facebook.com\' ");
		
		
		
		
		
		//highlight + changing the bg colour of emailbox
		//WebElement emailTxt = driver.findElement(By.id("email"));
		//jk.executeScript("arguments[0].setAttribute('style', 'border:6px solid black; background: blue')" , emailTxt);
		
		//
		
		

}
}