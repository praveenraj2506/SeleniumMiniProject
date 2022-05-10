package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement drag1 = driver.findElement(By.id("draggable"));
		
		Thread.sleep(2000);
		WebElement drop1 = driver.findElement(By.className("test1"));
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDrop(drag1, drop1).build().perform();
	}

}
