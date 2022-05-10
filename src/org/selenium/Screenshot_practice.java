package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Screenshot\\amazonfront.png");
		FileUtils.copyFile(source, target);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/a[text()='Mobiles']")).click();
		WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
		box.click();
		box.sendKeys("Redmi Note 8 Pro");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Screenshot\\amazondestination.png");
		FileUtils.copyFile(source1, target1);
		
		
	}

}
