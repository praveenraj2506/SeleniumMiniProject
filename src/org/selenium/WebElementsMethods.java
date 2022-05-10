package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("praveenraj123@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("praveen123");
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
		login.click();
		
		  
		
		  boolean displayed = username.isDisplayed(); System.out.println(displayed);
		  
		  boolean enabled = password.isEnabled(); System.out.println(enabled);
		  
		  String attribute = password.getAttribute("password");
		  System.out.println(attribute);
		  
		  String text = username.getText(); 
		  System.out.println(text);
		  
		  password.clear();
		  
		  driver.close();
		 
		 

	}

}
