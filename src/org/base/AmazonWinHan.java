package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonWinHan{
public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				
				 //inspect  searchbar
			WebElement searchButt = driver.findElement(By.id("twotabsearchtextbox"));
		searchButt.sendKeys("Iphone 13",Keys.ENTER);

			
			
				
//				//to click mobile phone (childID)r.
				WebElement iphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']"));
				iphone.click();
				
                  //to find parentId
				String parentId = driver.getWindowHandle();
				System.out.println(parentId);
				
//				//to find allWindowId
				Set<String> allWindowId = driver.getWindowHandles();
				System.out.println(allWindowId);
				
//			
			for(String x : allWindowId) {
				if(!parentId.equals(x)) {
//					//to switch back to childID
					driver.switchTo().window(x);
				}
			}
		
			//add to cart
		driver.findElement(By.id("add-to-cart-button")).click();
		
//2		
		driver.switchTo().window(parentId);
	//to go search tab
		WebElement searchButt1 = driver.findElement(By.id("twotabsearchtextbox"));
		searchButt1.click();
		//to del iphone 13 
		//to del 13
        Actions act = new Actions(driver);
		act.doubleClick(searchButt1).perform();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_BACK_SPACE);
	//to del space inbetween
		act.doubleClick(searchButt1).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
// to del iphone
		act.doubleClick(searchButt1).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);

          //samsung phone search
		WebElement search  = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("samsung s22 ultra" , Keys.ENTER);
		
		WebElement samsung = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
		samsung.click();
		 
		Set<String> allWindowId1 = driver.getWindowHandles();
		System.out.println(allWindowId1);
		
		List<String> li = new LinkedList();
		li.addAll(allWindowId1);
		String x = li.get(2);
		System.out.println(x);
		
		driver.switchTo().window(x);
		
		//add to cart
		driver.findElement(By.id("add-to-cart-button")).click();
		
//3
		driver.switchTo().window(parentId);
		//searchButt2
		WebElement searchButt2 = driver.findElement(By.id("twotabsearchtextbox"));
		searchButt2.click();
		act.doubleClick(searchButt2).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		
		act.doubleClick(searchButt2).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		
		act.doubleClick(searchButt2).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		
		act.doubleClick(searchButt2).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		
		act.doubleClick(searchButt2).perform();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		
		WebElement search1 = driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("boat earbuds",Keys.ENTER);
		
		WebElement earBuds = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
		earBuds.click();
		
		//allWindowsId2
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println(allWindowsId2);
		
		List<String> li1 = new LinkedList<>();
		li1.addAll(allWindowsId2);
		String y = li1.get(3);
		System.out.println(y);
		
		driver.switchTo().window(y);
		
driver.findElement(By.id("add-to-cart-button")).click();	
		
		
		
		
		
		
		
		
}
}	

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		