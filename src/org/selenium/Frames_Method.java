package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("singleframe");
		
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Praveenraj");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outer);
		
		Thread.sleep(2000);
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Praveen");
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}
