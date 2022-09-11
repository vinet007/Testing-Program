package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement findFirst = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		findFirst.sendKeys("vin");
		

		WebElement findSec = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		findSec.sendKeys("007");
		
		WebElement findEmail = driver.findElement(By.xpath("//input[@type='email']"));
		findEmail.sendKeys("vin@gmail.com");
		
		WebElement findTel = driver.findElement(By.xpath("//input[@type='tel']"));
		findTel.sendKeys("932346667");
		
		
		WebElement findAdd = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		findAdd.sendKeys("123,jiki colony");

		driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		//language
		//WebElement Lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		
		
		//skill
		
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skill);
		s1.selectByIndex(4);
		
		//country
		WebElement countries = driver.findElement(By.id("country"));
		Select s2 = new Select (countries);
	    s2.selectByValue("India");
	    
		//date
		 WebElement date = driver.findElement(By.id("daybox"));
		 Select s3  = new Select(date);
		 s3.selectByIndex(7);
		 
//year
		 WebElement year = driver.findElement(By.id("yearbox"));
		 Select s4 =new Select(year);
		 s4.selectByValue("1996");
		 
		 
		 
	
		 
		
		JavascriptExecutor jk= (JavascriptExecutor)driver;
		
//month
		 WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		 month.sendKeys("May");
		
		
//password
		 WebElement pass = driver.findElement(By.id("firstpassword"));
		pass.sendKeys("1234");
		
//confirmpass		
		WebElement confirm = driver.findElement(By.id("secondpassword"));
		confirm.sendKeys("1234");
		
		
		
		
		
		
		
		
		
	
		

}

}