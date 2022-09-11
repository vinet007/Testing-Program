package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolssqa {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		
		
		//javascript for scrollup
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		WebElement scrollUp = driver.findElement(By.xpath("//div[@class='trainer-info'][5]"));
		jk.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
		
	
		
		//scrollDown
		WebElement scrollDown = driver.findElement(By.xpath("//a[@class='activeLink']"));
		jk.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		//print text
		//WebElement user = driver.findElement(By.xpath("//div[@class='trainer-info'][5]"));
		
		Object executeScript = jk.executeScript("return arguments[0].getAttribute('value')", scrollUp);
		System.out.println(executeScript);
		
		driver.close();

}
}