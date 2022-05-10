package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//simple alert
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		  //confirm alert
		  driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		  Thread.sleep(2000); 
		  driver.switchTo().alert().dismiss();
		 		
		//prompt alert
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Praveenraj");
		driver.switchTo().alert().accept();
		
}
	}