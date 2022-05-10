package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Methods {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		
		Thread.sleep(1000);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(fashion).build().perform();
		
		WebElement footwear = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		a.moveToElement(footwear).build().perform();
		
		
		Thread.sleep(2000);
		  Robot r = new Robot();
		  
		  Thread.sleep(1000);
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  Thread.sleep(1000); 
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  Thread.sleep(1000); 
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		 
		
		
	}

}
