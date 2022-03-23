package org.base;

import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
 
	public static WebDriver driver;
	
	
	public static WebDriver chromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
		
			
   }

 public static void urlLaunch(String url) {
    driver.get(url);	
    driver.manage().window().maximize();
    
   }

 public static void implicitWait(int secounds) {
	 driver.manage().timeouts().implicitlyWait(secounds, TimeUnit.SECONDS);
	 
 }
 public static void sendkeys(WebElement e,String value) {
        e.sendKeys(value);	
}

public static void click(WebElement e) {
	e.click();

}

public static String getCurrentUrl() {
return driver.getCurrentUrl();

}

public static String grtTittle() {
	return driver.getTitle();

}

public static String getText(WebElement e) {
 return e.getText();
 
}


public static String getattribute(WebElement e) {
return e.getAttribute("value");

}

public static void quit() {
	driver.quit();
}

public static void moveToElement(WebElement e) {
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
}

public static void dragAndDrop(WebElement source,WebElement target) {
	Actions a=new Actions(driver);
	a.dragAndDrop(source, target).perform();
	
}

public static String getWindowHandles() {
	 Set<String> allId = driver.getWindowHandles();
	 
	 LinkedList<String> li=new LinkedList<String>();
	return null;
}























	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
