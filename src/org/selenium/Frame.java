package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(outer);
		
		Thread.sleep(2000);
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		driver.switchTo().frame(inner);
		driver.findElement(By.id("Click1")).click();
		
		
		
	}

}
