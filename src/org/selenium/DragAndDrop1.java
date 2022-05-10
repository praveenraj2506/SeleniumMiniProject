package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Dynamic.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement source1 = driver.findElement(By.id("mongo"));
	WebElement source2 = driver.findElement(By.id("node"));
	WebElement target = driver.findElement(By.id("droparea"));
	
	Actions builder = new Actions(driver);
	builder.dragAndDrop(source1, target).build().perform();
	
	Thread.sleep(2000);
	builder.dragAndDrop(source2, target).build().perform();
	Thread.sleep(2000);
	
	
	
	
	}

}
