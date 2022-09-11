package org.log;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test {
public static WebDriver driver;
	
public static WebDriver driver;

public static  String getCountry  (String company ) {
	WebElement element = driver.findElement(By.xpath("//td[text()='"+company+"']//following-sibling::td[2]"));
	String text = element.getText();
	return text;
	
}

   public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/Html/html_tables.asp");
	
	String countryName = getCountry("Ernst Handel");
	System.out.println(countryName);

}
}