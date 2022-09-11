package org.base;

import java.awt.AWTException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinSel {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//login
		WebElement findUser = driver.findElement(By.id("username"));
		findUser.sendKeys("vinet007");
		WebElement findPass = driver.findElement(By.id("password"));
		findPass.sendKeys("Stanisvynee@007");
		driver.findElement(By.id("login")).click();
		
		//Book room and print order no.
		
		WebElement bookRoom = driver.findElement(By.id("room_type"));
		Select s = new Select(bookRoom);
		s.selectByIndex(1);
		
		//print order
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select s1 = new Select(roomNos);
		s1.selectByVisibleText("7 - Seven");
		
		WebElement printOrder = driver.findElement(By.xpath("//option[text()='7 - Seven']"));
		String text = printOrder.getText();
		System.out.println(text);
		
	//print all the option in Room Type available.
		List<WebElement> rooms = s.getOptions();
		for(int i=0; i<rooms.size(); i++) {
		WebElement webElement = rooms.get(i);
		String text1 = webElement.getText();
		System.out.println(text1);
		}
	//print all the option in Location available.
		WebElement location = driver.findElement(By.id("location"));
		Select a = new Select(location);
		List<WebElement> locations = a.getOptions();
		for(int i=0; i<locations.size(); i++) {
			WebElement webElement = locations.get(i);
			String text2 = webElement.getText();
			System.out.println(text2);
		}
			
		//	print No of option available in Adults per Room
			WebElement adult = driver.findElement(By.id("adult_room"));
			Select b = new Select(adult);
			List<WebElement> adults = b.getOptions();
			for(int j=0; j<adults.size(); j++) {
				WebElement webElement2 = adults.get(j);
				String text3 = webElement2.getText();
				System.out.println(text3);
			}
				
			
			
			
			
			
}

			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

}

		
		
		
		//print
		//List<WebElement> rooms = s.getOptions();
		//for(int i=0; i<2; i++) {
			// WebElement webElement = rooms.get(i);
			//String text = webElement.getText();
			//System.out.println(text);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		



