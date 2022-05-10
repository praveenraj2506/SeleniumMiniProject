package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("enterimg")).click();
		
		Thread.sleep(2000);
		WebElement interactions = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		//Action 
		Actions a = new Actions(driver);
		a.moveToElement(interactions).build().perform();
		
		Thread.sleep(2000);
		
		//Robot
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Static ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.id("angular"));
		WebElement drop = driver.findElement(By.id("droparea"));
		
		Thread.sleep(1000);
		a.clickAndHold(drag).build().perform();
		a.moveToElement(drag).build().perform();
		
		Thread.sleep(2000);
		a.release(drop).build().perform();
		
	}

}
