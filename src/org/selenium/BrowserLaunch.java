package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
	//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	//BrowserLaunch
		WebDriver driver = new ChromeDriver();
	//open url
		driver.get("https://www.youtube.com/");
	//window maximize
		driver.manage().window().maximize();
	//Navigate to method
		driver.navigate().to("https://www.instagram.com/");
	//back 
		driver.navigate().back();
	//get title
		String title = driver.getTitle();
		System.out.println(title);
	//forward
		driver.navigate().forward();
	//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	//refresh the current window
		driver.navigate().refresh();
	//close the current woindow
		driver.close();
	}

}
