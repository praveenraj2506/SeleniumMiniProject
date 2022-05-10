package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement courses = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		
		String text = courses.getText();
		System.out.println(text);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(courses).build().perform();
		
		WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium']"));
		
		a.click(selenium).build().perform();
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
