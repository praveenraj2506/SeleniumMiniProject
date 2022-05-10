package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath1 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		
		WebElement todayOffer = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[11]//following::div[@class='CXW8mj'][4]"));
		todayOffer.click();
		String text = todayOffer.getText();
		System.out.println(text);
		
		
		
		driver.navigate().back();
		
		/*
		 * WebElement MensClothing = driver.findElement(By.xpath(
		 * "(//div[@class='_10pg75'])[53]//following::div[@class='CXW8mj'][2]"));
		 * MensClothing.click(); String text2 = MensClothing.getText();
		 * System.out.println(text2);
		 */
	}

}
