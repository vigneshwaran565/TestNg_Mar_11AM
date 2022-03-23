package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vicky\\eclipse-workspace\\TestNg_Mar_11AM\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // time control
		
		driver.manage().window().maximize();    // window maximise control

		
	    WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchbox.sendKeys("iphone");
		
		
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

