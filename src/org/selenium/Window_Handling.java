package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		
		Thread.sleep(2000);
		WebElement offers = driver.findElement(By.xpath("//div[text()='Top Offers']"));
		Actions a = new Actions(driver);
		a.contextClick(offers).build().perform();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();
		
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		a.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		a.contextClick(gaming).build().perform();
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement travel = driver.findElement(By.xpath("//div[text()='Travel']"));
		a.contextClick(travel).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement travel1 = driver.findElement(By.xpath("//div[text()='Travel']"));
		a.contextClick(travel1).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		String id = driver.getWindowHandle();
		System.out.println(id);
		
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		
		Set<String> all_window = driver.getWindowHandles();
		
		for (String all : all_window) {
			System.out.println(all);
			String title2 = driver.switchTo().window(all).getTitle();
			System.out.println(title2);
			
		}
		String Title3="Mobile Phones Online at Best Prices in India";
		for (String st : all_window) {
			if (driver.switchTo().window(st).getTitle().equals(Title3)) {
				break;
				
			}
			
		}
		
		
		
	}

}
