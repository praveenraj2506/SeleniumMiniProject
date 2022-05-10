package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		
		
		//webelement scroll type
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;//Narrowing TypeCasting
		
		
		WebElement Brand = driver.findElement(By.xpath("//a[text()='Brand Directory']"));
		js.executeScript("arguments[0].scrollIntoView();", Brand);
		
		Thread.sleep(2000);
		//scroll up
		js.executeScript("window.scrollBy(0,-3000);");
		
		Thread.sleep(2000);
		//scroll down
		js.executeScript("window.scrollBy(0,1000);");
			
	}

}
