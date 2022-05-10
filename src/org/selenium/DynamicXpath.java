package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement email = driver.findElement(By.xpath("//div[@class='_6luv _52jv']//following::input[@id='email']"));
		email.sendKeys("praveenraj007");
		
		WebElement password = driver.findElement(By.xpath("(//div[@class='_6ltg'])[1]//preceding::input[@id='pass']"));
		password.sendKeys("praveen007");
		
		WebElement login = driver.findElement(By.xpath("(//div[@class='_6ltj'])[1]//preceding::button[@name='login']"));
		login.click();
		
	}

}
