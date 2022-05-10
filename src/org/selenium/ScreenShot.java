package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;//Narrowing Typecasting
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumProject\\Screenshot\\image.png");
		FileUtils.copyFile(source, target);
		
		
		
	}

}
