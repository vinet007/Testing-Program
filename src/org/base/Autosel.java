package org.base;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosel {
	

public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		
//select
		 //driver.findElement(By.xpath("//a[text()='Register']")).click();
		// Thread.sleep(5000);
		 
//day
		 WebElement date = driver.findElement(By.id("daybox"));
		 Select s = new Select(date);
		 s.selectByIndex(7);
		 
//year
		 WebElement year = driver.findElement(By.id("yearbox"));
		 Select s2 =new Select(year);
		 s2.selectByValue("1996");
		 
		 //month
		 WebElement month = driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']"));
		 Select s3= new Select(month);
		 s3.selectByVisibleText("May");
		
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //to print the years in dropdown option
		List<WebElement> options = s2.getOptions() ;
		for(int i =0; i<options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		List<WebElement> options2 = s.getOptions(); 
		 for(int i=0; i<options2.size(); i++) {
			 WebElement webElement = options2.get(i);
			 String text = webElement.getText();
			 System.out.println(text);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}