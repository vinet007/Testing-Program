package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Testing\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		//screenshot
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File sourceFile = tk.getScreenshotAs(OutputType.FILE);
		File destinationFile =new File ("C:\\Users\\HP\\Documents\\greens\\jpeg");
		FileUtils.copyFile(sourceFile, destinationFile);
		
		
		
		

}

}